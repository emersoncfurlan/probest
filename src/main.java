import java.util.Random;

import javax.swing.JOptionPane;

public class main {
	private static final int SOMATORIO = 1;
	private static final int MEDIA_ARITMETICA_SIMPLES = 2;
	private static final int MEDIA_ARITMETICA_PONDERADA = 3;
	private static final int MODA = 4;
	private static final int MEDIANA = 5;
	private static final int VARIANCIA = 6;
	private static final int DESVIO_PADRAO = 7;
	private static final int MEDIA_GEOMETRICA = 8;
	private static final int MEDIA_HARMONICA = 9;
	private static final int PRODUTO = 10;
	private static final int PROBABILIDADE = 11;
	private static final int FATORIAL = 12;
	private static final int SAIR_DO_PROGRAMA = 13;

	public static void main(String[] args) {
		int[] amostra = { 15, 18, 16, 43 , 25, 10, 10};
		int[] pesos = { 0, 1, 2, 2, 1, 0, 1};
		int possibilidade = 2;
		Integer opcao = menu();

		while (opcao != SAIR_DO_PROGRAMA) {
			switch (opcao) {
			case SOMATORIO:
				JOptionPane.showConfirmDialog(null, somatorio(amostra)); // arrumado
				break;
			case MEDIA_ARITMETICA_SIMPLES:
				JOptionPane.showConfirmDialog(null, mediaAritmeticaSimples(amostra)); // correto
				break;
			case MEDIA_ARITMETICA_PONDERADA:
				JOptionPane.showConfirmDialog(null, mediaAritmeticaPonderada(amostra, pesos)); // arrumado
				break;
			case MODA:
				JOptionPane.showConfirmDialog(null, moda(amostra)); // testando uma modificação
				break;
			case MEDIANA:
				JOptionPane.showConfirmDialog(null, mediana(ordenarAmostra(amostra))); // arrumado
				break;
			case VARIANCIA:
				JOptionPane.showConfirmDialog(null, variancia(amostra)); // arrumado o somatório
				break;
			case DESVIO_PADRAO:
				JOptionPane.showConfirmDialog(null, desvioPadrao(amostra)); //  correto
				break;
			case MEDIA_GEOMETRICA:
				JOptionPane.showConfirmDialog(null, mediaGeometrica(amostra)); // feito
				break;
			case MEDIA_HARMONICA:
				JOptionPane.showConfirmDialog(null, mediaHarmonica(amostra)); // feito
				break;
			case PRODUTO:
				JOptionPane.showConfirmDialog(null, produto(amostra));
				break;
			case PROBABILIDADE:
				JOptionPane.showConfirmDialog(null, probabilidade(amostra, possibilidade));
				break;
			case FATORIAL:
				JOptionPane.showConfirmDialog(null, fatorial(possibilidade));
				break;
			case SAIR_DO_PROGRAMA:
				JOptionPane.showMessageDialog(null, "[Programa ser� encerado!]");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				break;
			}
			opcao = menu();
		}
	}

	private static Integer menu() {
		String menu = "[-------- Menu ---------]";
		menu += "\n[1]  - Somatorio";
		menu += "\n[2]  - Media Aritmetica Simples";
		menu += "\n[3]  - Media Aritmetica Ponderada";
		menu += "\n[4]  - Moda";
		menu += "\n[5]  - Mediana";
		menu += "\n[6]  - Variancia";
		menu += "\n[7]  - Desvio Padrao";
		menu += "\n[8]  - Media Geometrica";
		menu += "\n[9]  - Media Harmonica";
		menu += "\n[10] - Produto";
		menu += "\n[11] - Probabilidade";
		menu += "\n[12] - Fatorial";
		menu += "\n[13] - Sair";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";

		String strOpcao = JOptionPane.showInputDialog(null, menu);

		return Integer.parseInt(strOpcao);
	}


	// MATRIZ ORDENADA //
	private static int[] ordenarAmostra(int[] amostra) {
		boolean resp = false;
		int x = 0;
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

	// PARTES DO PROGRAMA //

	private static int somatorio(int[] amostra) {
		int somatorio = 0;
		for (int i = 0; i < amostra.length; i++) {
			somatorio += amostra[i];
		}
		return somatorio;
	}

	/*
	 * Ms: m�dia aritm�tica simples x1, x2, x3,...,xn: valores dos dados n: numero
	 * de dados
	 */
	private static int mediaAritmeticaSimples(int[] amostra) {
		return somatorio(amostra) / amostra.length;
	}

	/*
	 * A m�dia aritm�tica ponderada � calculada multiplicando cada valor do conjunto
	 * de dados pelo seu peso. Depois, encontra-se a soma desses valores que ser�
	 * dividida pela soma dos pesos Mp: M�dia aritm�tica ponderada p1, p2,..., pn:
	 * pesos x1, x2,...,xn: valores dos dados
	 */
	private static int mediaAritmeticaPonderada(int[] amostra, int[] pesos) {
		int valorAmostra = 0;
		int valorPesos = 0;
		String saida="";
		if (amostra.length == pesos.length) {
			for (int i = 0; i < amostra.length; i++) {
				valorAmostra+= amostra[i]*pesos[i];
				valorPesos+= pesos[i];
			}
			return valorAmostra / valorPesos;
		} else
			return 0;
	}


	/*
	 * A Moda (Mo) representa o valor mais frequente de um conjunto de dados, sendo
	 * assim, para defini-la basta observar a frequência com que os valores
	 * aparecem. Um conjunto de dados � chamado de bimodal quando apresenta duas
	 * modas, ou seja, dois valores são mais frequentes.
	 */

	private static int moda(int[] amostra) {
		boolean resp = false;
		int x = 0;
		int contador[] = new int[amostra.length];
		// ordenando a amostra
		int[] amostraOrdenada = ordenarAmostra(amostra);
		// verifica frequencia dos numeros
		for (int i = 0; i < amostraOrdenada.length; i++) {
			// percorre o vetor j a cada item do vetor i para contabilizar,
			// como a amostra está ordenada se o item posterior for diferente do item atual
			// nÃ£o tem porque voltar e rever o item
			for (int j = 0; j < amostraOrdenada.length; j++) {

			}
			System.out.println(contador[i]);
		}
		return 0;
	}

	/*
	 * Quando o n�mero elementos de um conjunto � par, a mediana � encontrada pela
	 * m�dia dos dois valores centrais. Assim, esses valores são somados e
	 * divididos por dois.
	 */
	private static int mediana(int[] amostra) {
		if (amostra.length % 2 == 0) { // par
			return ((amostra[(amostra.length / 2)] + amostra[(amostra.length / 2) + 1]) / 2);
		} else { // impar
			return amostra[amostra.length / 2];
		}
	}

	/*
	 * Variância � uma medida de dispersão e � usada tamb�m para expressar o
	 * quanto um conjunto de dados se desvia da m�dia. ∑: símbolo de somatório.
	 * Indica que temos que somar todos os termos, desde a primeira posição (i=1)
	 * at� a posição n xi: valor na posição i no conjunto de dados MA: m�dia
	 * aritm�tica dos dados n: quantidade de dados
	 */

	private static int variancia(int[] amostra) {
		int ma = mediaAritmeticaSimples(amostra);
		int somat = 0;
		// prepara os valores
		for (int i = 0; i < amostra.length; i++) {
			amostra[i] -= ma;
			amostra[i] = amostra[i] ^ 2;
			somat+=amostra[i];
		}
		return somat / (amostra.length-1); // trabalhando com a perda de um valor, ou não?
	}

	// Desvio Padrão
	private static double desvioPadrao(int[] amostra) {
		int variancia = variancia(amostra);
		return Math.sqrt(variancia);
	}

	// media harmonica
	private static int mediaHarmonica(int[] amostra) {
		int mediaHarm = amostra.length;
		int somat = 0;
		for (int i = 0; i < amostra.length; i++) {
			somat += 1 / amostra[i];
		}
		return mediaHarm / somat;
	}

	// Media Geom�trica
	private static double mediaGeometrica(int[] amostra) {
		double mg = 0;
		int produto = 0;
		produto = produto(amostra);
		mg = Math.pow(produto, (1/amostra.length));
		return mg;
	}

	private static int produto(int[] amostra) {
		int valor = amostra[0];
		for (int i = 1; i < amostra.length; i++) {
			valor *= amostra[i];
		}
		return valor;
	}

	// Amplitude
	private static int amplitude(int[] amostra) {
		// Essa medida de dispers�o � definida como a diferenca entre a maior e a menor
		// observa��o de um conjunto de dados, isto �:
		int a = amostra[0] - amostra[amostra.length];
		return a;
	}

	// Coeficiente de Varia��o
	private static double coeficienteDeVariacao(int[] amostra) {
		double cv = (desvioPadrao(amostra) * 100) / mediaAritmeticaSimples(amostra);
		return cv;
	}

	// Formula da Probabilidade
	/*
	 * Em um fen�meno aleatório, as possibilidades de ocorrência de um evento são
	 * igualmente prov�veis. p(A): probabilidade da ocorrência de um evento A n(A):
	 * n�mero de casos que nos interessam (evento A) n(Ω): n�mero total de casos
	 * possíveis
	 */
	private static double probabilidade(int[] amostra, int possibilidade) {
		// Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado
		// resultado atrav�s da divisão
		// entre o n�mero de eventos favor�veis e o n�mero total de resultados
		// possíveis:
		long numTotal = fatorial(amostra.length);
		long pa = possibilidade / numTotal;
		// converter para porcentagem aproximada
		double porcent = 100 * (double) pa;
		JOptionPane.showConfirmDialog(null, porcent + "%");
		return porcent;
	}

	// Fatorial recursivo
	private static long fatorial(int num) {
		int anterior = num - 1;
		long fatorial = 0;
		if (num <= 1) {
			return 1;
		} else {
			fatorial = num * fatorial(anterior);
			return fatorial;
		}
	}

}
