package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Amostra {

	private int codAmostra;
	private ArrayList<Double> dados = new ArrayList<Double>();
	private ArrayList<Double> pesos = new ArrayList<Double>();
	private double possibilidade;

	public double getPossibilidade() {
		return possibilidade;
	}

	public void setPossibilidade(double possibilidade) {
		this.possibilidade = possibilidade;
	}

	public Double getResultadoSOMATORIO() {
		return ResultadoSOMATORIO;
	}

	public void setResultadoSOMATORIO(Double resultadoSOMATORIO) {
		ResultadoSOMATORIO = resultadoSOMATORIO;
	}

	public Double getResultadoQUADRADO_DA_SOMA() {
		return ResultadoQUADRADO_DA_SOMA;
	}

	public void setResultadoQUADRADO_DA_SOMA(Double resultadoQUADRADO_DA_SOMA) {
		ResultadoQUADRADO_DA_SOMA = resultadoQUADRADO_DA_SOMA;
	}

	public Double getResultadoSOMA_DE_PRODUTOS() {
		return ResultadoSOMA_DE_PRODUTOS;
	}

	public void setResultadoSOMA_DE_PRODUTOS(Double resultadoSOMA_DE_PRODUTOS) {
		ResultadoSOMA_DE_PRODUTOS = resultadoSOMA_DE_PRODUTOS;
	}

	public Double getResultadoPRODUTO_DAS_SOMAS() {
		return ResultadoPRODUTO_DAS_SOMAS;
	}

	public void setResultadoPRODUTO_DAS_SOMAS(Double resultadoPRODUTO_DAS_SOMAS) {
		ResultadoPRODUTO_DAS_SOMAS = resultadoPRODUTO_DAS_SOMAS;
	}

	public Double getResultadoMEDIA_ARITMETICA_SIMPLES() {
		return ResultadoMEDIA_ARITMETICA_SIMPLES;
	}

	public void setResultadoMEDIA_ARITMETICA_SIMPLES(Double resultadoMEDIA_ARITMETICA_SIMPLES) {
		ResultadoMEDIA_ARITMETICA_SIMPLES = resultadoMEDIA_ARITMETICA_SIMPLES;
	}

	public Double getResultadoMEDIA_ARITMETICA_PONDERADA() {
		return ResultadoMEDIA_ARITMETICA_PONDERADA;
	}

	public void setResultadoMEDIA_ARITMETICA_PONDERADA(Double resultadoMEDIA_ARITMETICA_PONDERADA) {
		ResultadoMEDIA_ARITMETICA_PONDERADA = resultadoMEDIA_ARITMETICA_PONDERADA;
	}

	public double[] getResultadoMODA() {
		return ResultadoMODA;
	}

	public void setResultadoMODA(double[] resultadoMODA) {
		ResultadoMODA = resultadoMODA;
	}

	public Double getResultadoMEDIANA() {
		return ResultadoMEDIANA;
	}

	public void setResultadoMEDIANA(Double resultadoMEDIANA) {
		ResultadoMEDIANA = resultadoMEDIANA;
	}

	public Double getResultadoVARIANCIA() {
		return ResultadoVARIANCIA;
	}

	public void setResultadoVARIANCIA(Double resultadoVARIANCIA) {
		ResultadoVARIANCIA = resultadoVARIANCIA;
	}

	public Double getResultadoDESVIO_PADRAO() {
		return ResultadoDESVIO_PADRAO;
	}

	public void setResultadoDESVIO_PADRAO(Double resultadoDESVIO_PADRAO) {
		ResultadoDESVIO_PADRAO = resultadoDESVIO_PADRAO;
	}

	public Double getResultadoMEDIA_GEOMETRICA() {
		return ResultadoMEDIA_GEOMETRICA;
	}

	public void setResultadoMEDIA_GEOMETRICA(Double resultadoMEDIA_GEOMETRICA) {
		ResultadoMEDIA_GEOMETRICA = resultadoMEDIA_GEOMETRICA;
	}

	public Double getResultadoMEDIA_HARMONICA() {
		return ResultadoMEDIA_HARMONICA;
	}

	public void setResultadoMEDIA_HARMONICA(Double resultadoMEDIA_HARMONICA) {
		ResultadoMEDIA_HARMONICA = resultadoMEDIA_HARMONICA;
	}

	public Double getResultadoPRODUTO() {
		return ResultadoPRODUTO;
	}

	public void setResultadoPRODUTO(Double resultadoPRODUTO) {
		ResultadoPRODUTO = resultadoPRODUTO;
	}

	public Double getResultadoPROBABILIDADE() {
		return ResultadoPROBABILIDADE;
	}

	public void setResultadoPROBABILIDADE(Double resultadoPROBABILIDADE) {
		ResultadoPROBABILIDADE = resultadoPROBABILIDADE;
	}

	public Double getResultadoFATORIAL() {
		return ResultadoFATORIAL;
	}

	public void setResultadoFATORIAL(Double resultadoFATORIAL) {
		ResultadoFATORIAL = resultadoFATORIAL;
	}

	public Double getResultadoSOMA_DOS_QUADRADOS() {
		return ResultadoSOMA_DOS_QUADRADOS;
	}

	public void setResultadoSOMA_DOS_QUADRADOS(Double resultadoSOMA_DOS_QUADRADOS) {
		ResultadoSOMA_DOS_QUADRADOS = resultadoSOMA_DOS_QUADRADOS;
	}

	// Resultados
	private Double ResultadoSOMATORIO;
	private Double ResultadoQUADRADO_DA_SOMA;
	private Double ResultadoSOMA_DE_PRODUTOS;
	private Double ResultadoPRODUTO_DAS_SOMAS;
	private Double ResultadoMEDIA_ARITMETICA_SIMPLES;
	private Double ResultadoMEDIA_ARITMETICA_PONDERADA;
	private double[] ResultadoMODA;
	private Double ResultadoMEDIANA;
	private Double ResultadoVARIANCIA;
	private Double ResultadoDESVIO_PADRAO;
	private Double ResultadoMEDIA_GEOMETRICA;
	private Double ResultadoMEDIA_HARMONICA;
	private Double ResultadoPRODUTO;
	private Double ResultadoPROBABILIDADE;
	private Double ResultadoFATORIAL;
	private Double ResultadoSOMA_DOS_QUADRADOS;

	public Amostra() {

	}

	public Amostra(ArrayList<Double> dados) {
		super();
		this.codAmostra = codAmostra + 1;
		this.dados = dados;
	}

	public Amostra(ArrayList<Double> dados, ArrayList<Double> pesos) {
		super();
		this.codAmostra = codAmostra + 1;
		this.dados = dados;
		this.pesos = pesos;
	}

	@Override
	public String toString() {
		return "Dados=" + dados + "\n pesos=" + pesos + "\n possibilidade="
				+ possibilidade;
	}

	public ArrayList<Double> getPesos() {
		return pesos;
	}

	public void setPesos(ArrayList<Double> pesos) {
		this.pesos = pesos;
	}

	public int getCodAmostra() {
		return codAmostra;
	}

	public void setCodAmostra(int codAmostra) {
		this.codAmostra = codAmostra;
	}
	public void result() {
		this.ResultadoSOMATORIO = somatorio(dados);
		this.ResultadoQUADRADO_DA_SOMA = (double) quadradoDaSoma(dados);
		this.ResultadoSOMA_DE_PRODUTOS = somadeprodutos(dados, pesos);
//		this.ResultadoPRODUTO_DAS_SOMAS =  ;
		this.ResultadoMEDIA_ARITMETICA_SIMPLES = mediaAritmeticaSimples(dados);
		this.ResultadoMEDIA_ARITMETICA_PONDERADA = mediaAritmeticaPonderada(dados, pesos);
		this.ResultadoMODA = moda(dados); //da erro caso não tenha repetido
		this.ResultadoMEDIANA = mediana(dados);
		this.ResultadoVARIANCIA = variancia(dados);
		this.ResultadoDESVIO_PADRAO = desvioPadrao(dados);
		this.ResultadoMEDIA_GEOMETRICA = mediaGeometrica(dados);
		this.ResultadoMEDIA_HARMONICA = mediaHarmonica(dados);
		this.ResultadoPRODUTO = produto(dados);
		this.ResultadoPROBABILIDADE = probabilidade(dados, possibilidade);
//		this.ResultadoFATORIAL = fatorial();
		this.ResultadoSOMA_DOS_QUADRADOS = (double) quadradoDaSoma(dados);
	}
	public ArrayList<Double> getDados() {
		return dados;
	}

	public void setDados(ArrayList<Double> dados) {
		this.dados = dados;
	}

	public static double somatorio(ArrayList<Double> dados) {
		double somatorio = 0;
		for (Double dado : dados) {
			somatorio += dado;
		}
		return somatorio;
	}

	public static double somadeprodutos(ArrayList<Double> dados, ArrayList<Double> pesos) {

		double somadeprodutos = 0;
		for (int i = 0; i < dados.size(); i++) {
			somadeprodutos += dados.get(i) * pesos.get(i);
		}
		return somadeprodutos;
	}

	public static double mediaHarmonica(ArrayList<Double> dados) {
		double[] amostra = new double[dados.size()];
		for (int i = 0; i < dados.size(); i++) {
			amostra[i] = dados.get(i);
		}
		double mediaHarm = amostra.length;
		double somat = 0;
		for (int i = 1; i < amostra.length; i++) {
			somat += Math.pow(amostra[i], -1);
		}
		return mediaHarm / somat;
	}

	public static double mediaAritmeticaSimples(ArrayList<Double> dados) {
		double amostraAux = dados.size();
		double somatorio = somatorio(dados);
		return somatorio / amostraAux;
	}

	public static double mediaAritmeticaPonderada(ArrayList<Double> amostra, ArrayList<Double> pesos) {
		double mAPonderada = 0;
		double somaPesos = 0;
		if (amostra.size() == pesos.size()) {
			for (int i = 0; i < amostra.size(); i++) {
				mAPonderada += amostra.get(i) * pesos.get(i);
			}
			for (int i = 0; i < pesos.size(); i++) {
				somaPesos += pesos.get(i);
			}
			mAPonderada = mAPonderada / somaPesos;
			return mAPonderada;
		} else
			return 0;
	}

	public static double[] ordenarAmostra(ArrayList<Double> amostraDados) {
		double[] dados = new double[amostraDados.size()];
		int count = 0;
		for (double dado : dados) {
			dados[count] = dado;
			count++;
		}
		boolean resp = false;
		double x = 0;
		while (!resp) {
			resp = true;
			for (int i = 0; i < dados.length - 1; i++) {
				if (dados[i] > dados[i + 1]) {
					resp = false;
					x = dados[i + 1];
					dados[i + 1] = dados[i];
					dados[i] = x;
				}
			}
		}
		return dados;
	}

	public static double[] tiraRepetidos(double[] amostra) {
		boolean tem;
		ArrayList<Double> result = new ArrayList<Double>();

		for (int i = 0; i < amostra.length; i++) {
			tem = false; // Inicia como se não tem
			for (int j = 0; j < result.size(); j++) { // Passa por todos os elementos da ArrayList result
				if (amostra[i] == result.get(j)) {
					tem = true; // Já tem o elemento
				}
			}
			if (!tem) { // Se não tem, adicionar no result
				result.add(amostra[i]);
			}
		}
		double fim[] = new double[result.size()]; // Vetor final para converter de ArrayList para vetor
		for (int i = 0; i < result.size(); i++) {
			fim[i] = result.get(i);
		}
		return fim;
	}

	// Conta quantas vezes um elemento aparece num vetor
	// Não sei se já existe um método que faz isso, não achei
	// Auxilia na função da moda
	public static double contaNoVetor(double[] amostra, double elemento) {
		double contador = 0;
		for (int i = 0; i < amostra.length; i++) {
			if (amostra[i] == elemento) {
				contador++;
			}
		}
		return contador;
	}

	/*
	 * A Moda (Mo) representa os valores mais frequentes de um conjunto de dados,
	 * sendo assim, para defini-la basta observar a frequência com que os valores
	 * aparecem. Um conjunto de dados pode ser bimodal, trimodal, quadrimodal...
	 */
	public static double[] moda(ArrayList<Double> dados) {
		double[] amostra = new double[dados.size()];
		for (int i = 0; i < dados.size(); i++) {
			amostra[i] = dados.get(i);
		}
		double semRepetidos[] = tiraRepetidos(amostra); // Amostra sem dados repetidos
		double freq[] = new double[semRepetidos.length]; // Vetor que vai armazenar a frequência dos itens individuais
		/*
		 * O segudoublee 'for', checa a quantidade dos itens do vetor sem repetidos
		 * dentro da amostra e grava a frequencia no vetor freq
		 */
		for (int i = 0; i < freq.length; i++) {
			double quant = 0;
			for (int j = 0; j < amostra.length; j++) {
				if (semRepetidos[i] == amostra[j]) {
					quant++;
				}
			}
			freq[i] = quant;
		}

		double moda = freq[0]; // Grava a frequência modal
		for (int i = 0; i < freq.length; i++) { // Pega a maior frequência e salva em moda
			if (freq[i] > moda) {
				moda = freq[i];
			}
		}

		// Se o elemento com mais frequência se repete em todas as vezes não há moda
		if (freq.length == contaNoVetor(freq, moda)) {
			return null; // Se já não tem moda, retorna null
		}

		// Lista de modas (em ArrayList), pode ter mais de uma e ir adicionando
		ArrayList<Double> modasArList = new ArrayList<Double>();

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == moda) {
				// Adiciona os valores que tem a mesma frequência (a frequência modal)
				modasArList.add(semRepetidos[i]);
			}
		}

		// Lista de modas (em vetor)
		double[] modas = new double[modasArList.size()];

		// Converte de ArrayList para Vetor
		for (int i = 0; i < modas.length; i++) {
			modas[i] = modasArList.get(i);
		}

		return modas;
	}

	// O método moda retorna um vetor, este método está sendo usado para transformar
	// as modas em String
	public static String vetorToString(double[] vetor) {
		if (vetor != null) {
			String result = "";
			for (int i = 0; i < vetor.length; i++) {
				result += vetor[i];
				if (i != vetor.length - 1) {
					result += ", \n ";
				}
			}
			return result;
		}
		return "N/A";
	}

	/*
	 * Quando o número elementos de um conjunto é par, a mediana é encontrada pela
	 * média dos dois valores centrais. Assim, esses valores sÃ£o somados e
	 * divididos por dois.
	 */
	public static double mediana(ArrayList<Double> dados) {
		double amostraOrdenada[] = ordenarAmostra(dados);
		if (dados.size() % 2 == 0) { // par
			return (double) (amostraOrdenada[(dados.size() / 2)] + dados.get((dados.size() / 2) - 1)) / 2;
		} else { // impar
			return amostraOrdenada[dados.size() / 2];
		}
	}

	public static double variancia(ArrayList<Double> dados) {
		double ma = mediaAritmeticaSimples(dados);
		double somat = 0;
		// prepara os valores
		for (Double dado : dados) {
			somat += Math.pow((double) dado - ma, 2);
		}
		return somat / dados.size();
	}

	// Desvio PadrÃ£o
	public static double desvioPadrao(ArrayList<Double> dados) {
		double variancia = variancia(dados);
		return Math.sqrt(variancia);
	}

	// Media Geométrica
	public static double mediaGeometrica(ArrayList<Double> dados) {
		double mg = 0;
		double produto = 0;
		produto = produto(dados);
		mg = Math.pow(produto, Math.pow(dados.size(), -1));
		return mg;
	}

	public static double produto(ArrayList<Double> dados) {
		double valor = dados.get(0);
		for (Double dado : dados) {
			valor *= dado;
		}
		return valor;
	}

	// Amplitude
	public static double amplitude(double[] amostra) {
		// Essa medida de dispersão é definida como a diferenca entre a maior e a menor
		// observação de um conjunto de dados, isto é:
		double a = amostra[0] - amostra[amostra.length];
		return a;
	}

	// Coeficiente de Variação
	public static double coeficienteDeVariacao(ArrayList<Double> dados) {
		double cv = (desvioPadrao(dados) * 100) / mediaAritmeticaSimples(dados);
		return cv;
	}

	// Formula da Probabilidade
	/*
	 * Em um fenómeno aleatÃ³rio, as possibilidades de ocorrÃªncia de um evento sÃ£o
	 * igualmente prováveis. p(A): probabilidade da ocorrÃªncia de um evento A n(A):
	 * número de casos que nos doubleeressam (evento A) n(Î©): número total de casos
	 * possÃ­veis
	 */
	public static double probabilidade(ArrayList<Double> dados, double possibilidade) {
		// Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado
		// resultado através da divisÃ£o
		// entre o número de eventos favoráveis e o número total de resultados
		// possÃ­veis:
		Double numTotal = (double) fatorial(dados.size());
		Double pa = possibilidade / numTotal;
		// converter para porcentagem aproximada
		double porcent = 100 * (double) pa;
		JOptionPane.showConfirmDialog(null, porcent + "%");
		return porcent;
	}

	// Fatorial recursivo
	public static Double fatorial(double num) {
		Integer anterior = (int) (num - 1);
		Double fatorial = 0.0;
		if (num <= 1) {
			return (double) 1;
		} else {
			fatorial = (Double) (num * fatorial(anterior));
			return fatorial;
		}
	}

	public static long quadradoDaSoma(ArrayList<Double> dados) {
		return (long) Math.pow(somatorio(dados), 2);
	}

	public static double calcularSomaQuadrados(ArrayList<Double> dados) {
		double somaTotal;
		somaTotal = 0;
		for (Double dado : dados) {
			somaTotal += Math.pow(dado, 2);
		}
		return somaTotal;
	}
}
