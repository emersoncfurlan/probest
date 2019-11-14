package controller.menu;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Funcionalidade {
	private int codFuncionalidade;
	private String nome;
	private double resultado;

	public Funcionalidade(String nome, double resultado) {
		super();
		this.codFuncionalidade += codFuncionalidade;
		this.nome = nome;
		this.resultado = resultado;
	}

	public static double somatorio(ArrayList<Double> amostra) {
		double somatorio = 0;
		for (Double dado : amostra) {
			somatorio += dado;
		}

		return somatorio;
	}

	public static double somadeprodutos(double[] amostra, double[] amostra2) {
		double somadeprodutos = 0;
		for (int i = 0; i < amostra.length; i++) {
			somadeprodutos += amostra[i] * amostra2[i];
		}
		return somadeprodutos;
	}

//	public static double produtoDasSomas(double[] amostra, double[] amostra2) {
//		double produtoDasSomas = somatorio(amostra) * somatorio(amostra2);
//		return produtoDasSomas;
//	}

	public static double mediaHarmonica(double[] amostra) {
		double mediaHarm = amostra.length;
		double somat = 0;
		for (int i = 1; i < amostra.length; i++) {
			somat += Math.pow(amostra[i], -1);
		}
		return mediaHarm / somat;
	}

	/*
	 * Ms: média aritmética simples x1, x2, x3,...,xn: valores dos dados n: numero
	 * de dados
	 */
	public static double mediaAritmeticaSimples(double[] amostra) {
		double amostraAux = amostra.length;
		double somatorioAux = 0;
		for (int i = 0; i < amostra.length; i++) {
			somatorioAux += amostra[i];
		}
		return somatorioAux / amostraAux;
	}

	/*
	 * A média aritmética ponderada é calculada multiplicando cada valor do conjunto
	 * de dados pelo seu peso. Depois, encontra-se a soma desses valores que será
	 * dividida pela soma dos pesos Mp: Média aritmética ponderada p1, p2,..., pn:
	 * pesos x1, x2,...,xn: valores dos dados
	 */
	public static double mediaAritmeticaPonderada(double[] amostra, double[] pesos) {
		double mAPonderada = 0;
		double somaPesos = 0;

		if (amostra.length == pesos.length) {
			for (int i = 0; i < amostra.length; i++) {
				mAPonderada += amostra[i] * pesos[i];
			}
			for (int i = 0; i < pesos.length; i++) {
				somaPesos += pesos[i];
			}
			mAPonderada = mAPonderada / somaPesos;
			return mAPonderada;
		} else
			return 0;
	}

	public static double[] ordenarAmostra(double[] amostra) {
		boolean resp = false;
		double x = 0;
		// ordenar amostra
		while (!resp) {
			resp = true;
			for (int i = 0; i < amostra.length - 1; i++) {
				if (amostra[i] > amostra[i + 1]) {
					resp = false;
					x = amostra[i + 1];
					amostra[i + 1] = amostra[i];
					amostra[i] = x;
				}
			}
		}
		return amostra;
	}

	// Método necessário para se retirar a moda
	// Recebe um vetor e retorna um vetor sem elementos repetidos
	// Dá pra melhorar se alguém souber
	public static double[] tiraRepetidos(double[] amostra) {
		boolean tem; // Variável auxiliar para checar se o valor da amostra "TEM" no resultado
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
	public static double[] moda(double[] amostra) {
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
					result += ", ";
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
	public static double mediana(double[] amostra) {
		double amostraOrdenada[] = ordenarAmostra(amostra);

		if (amostra.length % 2 == 0) { // par
			return (double) (amostraOrdenada[(amostra.length / 2)] + amostra[(amostra.length / 2) - 1]) / 2;
		} else { // impar
			return amostraOrdenada[amostra.length / 2];
		}
	}

	/*
	 * VariÃ¢ncia é uma medida de dispersÃ£o e é usada também para expressar o
	 * quanto um conjunto de dados se desvia da média. âˆ‘: sÃ­mbolo de somatÃ³rio.
	 * Indica que temos que somar todos os termos, desde a primeira posiÃ§Ã£o (i=1)
	 * até a posiÃ§Ã£o n xi: valor na posiÃ§Ã£o i no conjunto de dados MA: média
	 * aritmética dos dados n: quantidade de dados
	 */
	public static double variancia(double[] amostra) {
		double ma = mediaAritmeticaSimples(amostra);
		double somat = 0;
		// prepara os valores
		for (int i = 0; i < amostra.length; i++) {
			somat += Math.pow((double) amostra[i] - ma, 2);
		}
		return somat / amostra.length;
	}

	// Desvio PadrÃ£o
	public static double desvioPadrao(double[] amostra) {
		double variancia = variancia(amostra);
		return Math.sqrt(variancia);
	}

	// Media Geométrica
	public static double mediaGeometrica(double[] amostra) {
		double mg = 0;
		double produto = 0;
		produto = produto(amostra);
		mg = Math.pow(produto, Math.pow(amostra.length, -1));
		return mg;
	}

	public static double produto(double[] amostra) {
		double valor = amostra[0];
		for (int i = 1; i < amostra.length; i++) {
			valor *= amostra[i];
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
	public static double coeficienteDeVariacao(double[] amostra) {
		double cv = (desvioPadrao(amostra) * 100) / mediaAritmeticaSimples(amostra);
		return cv;
	}

	// Formula da Probabilidade
	/*
	 * Em um fenómeno aleatÃ³rio, as possibilidades de ocorrÃªncia de um evento sÃ£o
	 * igualmente prováveis. p(A): probabilidade da ocorrÃªncia de um evento A n(A):
	 * número de casos que nos doubleeressam (evento A) n(Î©): número total de casos
	 * possÃ­veis
	 */
	public static double probabilidade(double[] amostra, double possibilidade) {
		// Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado
		// resultado através da divisÃ£o
		// entre o número de eventos favoráveis e o número total de resultados
		// possÃ­veis:
		Double numTotal = (double) fatorial(amostra.length);
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

//	public static long quadradoDaSoma(double[] amostra) {
//		return (long) Math.pow(somatorio(amostra), 2);
//	}

	public static double calcularSomaQuadrados(double[] vetor) {
		double somaTotal;
		somaTotal = 0;

		for (int i = 0; i < vetor.length; i++) {
			somaTotal += Math.pow(vetor[i], 2);
		}

		return somaTotal;
	}
}
