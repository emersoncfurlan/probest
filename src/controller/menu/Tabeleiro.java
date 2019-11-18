package controller.menu;

import java.util.ArrayList;

import model.Amostra;

public class Tabeleiro extends Thread{

	private ArrayList<Double> amostra;
	private ArrayList<Classe> elementos;
	
	private double amplitude;
	private double numClassesAux;
	private int numClasses;
	private double tamanhoIntervalo;

	public Tabeleiro(Amostra amostra) {
		this.amostra = ordenador(amostra.getDadosPesados());
		this.amplitude = getAmplitude();
		this.numClassesAux = Math.sqrt(amostra.getDados().size());
		this.numClassesAux = arredonda(this.numClassesAux, 4);
		this.numClasses = (int) Math.ceil(numClassesAux);
		this.tamanhoIntervalo = this.amplitude / this.numClassesAux;
		this.tamanhoIntervalo = arredonda(this.tamanhoIntervalo, 4);
		this.elementos = geraTabela();
	}
	

	public ArrayList<Double> getAmostra() {
		return amostra;
	}


	public ArrayList<Classe> getElementos() {
		return elementos;
	}

	
	public double getAmplitude() {
		return this.amostra.get(this.amostra.size() - 1) - this.amostra.get(0);
	}


	public double getNumClassesAux() {
		return numClassesAux;
	}


	public int getNumClasses() {
		return numClasses;
	}


	public double getTamanhoIntervalo() {
		return tamanhoIntervalo;
	}


	private ArrayList<Double> ordenador(ArrayList<Double> amostra) {
		ArrayList<Double> aux = new ArrayList<>();

		for (int i = 0; i < amostra.size(); i++) {
			boolean added = false;
			for (int j = 0; j < aux.size(); j++) {
				if (amostra.get(i) <= aux.get(j)) {
					aux.add(j, amostra.get(i));
					added = true;
					break;
				}
			}
			if (!added) {
				aux.add(amostra.get(i));
			}
		}
		return aux;
	}
	
	
	private double arredonda(double num, int casas) {
		double aux = (int)(Math.pow(10, casas) * num);
		aux /= Math.pow(10, casas);
		
		return aux;
	}
	
	
	private int geraFreqAbs(double limiteInf, double limiteSup) {
		int freq = 0;
		for (double i : this.amostra) {
			if (i >= limiteInf && i < limiteSup) {
				freq++;
			}
		}
		
		return freq;
	}


	private ArrayList<Classe> geraTabela() {
		ArrayList<Classe> tabela = new ArrayList<>();
		
		int acumulador = 0;
		double acumuladorRel = 0;
		
		for (int i = 0; i < this.numClasses; i++) {
			double limiteInf = this.amostra.get(0) + this.tamanhoIntervalo * i;
			double limiteSup = this.amostra.get(0) + this.tamanhoIntervalo * (i + 1);
			double limiteMed = (limiteInf + limiteSup) / 2;
			limiteMed = arredonda(limiteMed, 4);
			
			int freqAbsoluta = geraFreqAbs(limiteInf, limiteSup);
			acumulador += freqAbsoluta;
			int freqAcumulada = acumulador;
			
			double freqRelativa = (double) freqAbsoluta / this.amostra.size();
			freqRelativa = arredonda(freqRelativa, 4);
			acumuladorRel += freqRelativa;
			double freqRelativaAcm = acumuladorRel;
			
			tabela.add(new Classe(limiteInf, limiteSup, limiteMed, freqAbsoluta, freqAcumulada,
					freqRelativa, freqRelativaAcm));
		}
		
		return tabela;
	}

}
