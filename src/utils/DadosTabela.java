package utils;

public class DadosTabela {
	private Tabeleiro tabela;
	private double mediaT;
	private double modaT;
	private double[] medianaT = new double[2];
	private double[] quartilT = new double[4];
	private double[] decilT = new double[10];

	public DadosTabela(Tabeleiro tabela) {
		this.tabela = tabela;
		this.mediaT = mediaTabela();
		this.modaT = modaTabela();

		fazPercentil(this.medianaT);
		fazPercentil(this.quartilT);
		fazPercentil(this.decilT);
	}

	public String getMedianaT() {
		String mediana = "";
		for (int i = 0; i < medianaT.length; i++) {
			mediana += " | "+medianaT[i];
		}
		return mediana;
	}

	public String getQuartilT() {
		String quartil = "";
		for (int i = 0; i < quartilT.length; i++) {
			quartil += " | "+quartilT[i];
		}
		return quartil;
	}

	public String getDecilT() {
		String decil = "";
		for (int i = 0; i < decilT.length; i++) {
			decil += " | "+decilT[i];
		}
		return decil;
	}

	public double getMediaT() {
		return mediaT;
	}

	public double getModaT() {
		return modaT;
	}

	public double mediaTabela() {
		double soma = 0;
		double nDeTermos = 0;
		for (Classe classe : this.tabela.getElementos()) {
			soma += classe.getlimiteMed() * classe.getfreqAbsoluta();
			nDeTermos += classe.getfreqAbsoluta();
		}

		return soma / nDeTermos;
	}

	public double modaTabela() {
		Classe modal = null;
		Classe anterior = null;
		Classe posterior = null;
		for (int i = 0; i < this.tabela.getElementos().size(); i++) {
			Classe classe = this.tabela.getElementos().get(i);

			if (modal == null || classe.getfreqAbsoluta() > modal.getfreqAbsoluta()) {
				modal = classe;
				if (i > 0) {
					anterior = this.tabela.getElementos().get(i - 1);
				}
				if (i < this.tabela.getElementos().size() - 1) {
					posterior = this.tabela.getElementos().get(i + 1);
				}
			}
		}

		double delta1;
		if (anterior != null) {
			delta1 = modal.getfreqAbsoluta() - anterior.getfreqAbsoluta();
		} else {
			delta1 = modal.getfreqAbsoluta();
		}

		double delta2;
		if (posterior != null) {
			delta2 = modal.getfreqAbsoluta() - posterior.getfreqAbsoluta();
		} else {
			delta2 = modal.getfreqAbsoluta();
		}

		double moda = modal.getlimiteInf() + (delta1 / (delta1 + delta2)) * (modal.getlimiteSup() - modal.getlimiteInf());

		return moda;
	}
	
	public double percentilTabela(double percentil) {
		if (percentil > 1) {
			percentil /= 100;
		}
		
		int totalElementos = 0;
		for (Classe classe : this.tabela.getElementos()) {
			totalElementos += classe.getfreqAbsoluta();
		}
		
		double classeLimIndex = (double) percentil * totalElementos;
		Classe classeLim = null;
		double SomaClassesAnteriores = 0;

		for (Classe classe : this.tabela.getElementos()) {
			if (classeLimIndex <= classe.getfreqAcumulada()) {
				classeLim = classe;
				break;
			}
			SomaClassesAnteriores = classe.getfreqAcumulada();
		}
		
		double perc = classeLim.getlimiteInf() + ((classeLimIndex - SomaClassesAnteriores) / classeLim.getfreqAbsoluta()) * (classeLim.getlimiteSup() - classeLim.getlimiteInf());
		
		return perc;
	}
	
	public void fazPercentil(double[] limitesDosPercentis) {
		for (int i = 0; i < limitesDosPercentis.length; i++) {
			limitesDosPercentis[i] = percentilTabela((100 / limitesDosPercentis.length) * (i + 1));
		}
	}

}
