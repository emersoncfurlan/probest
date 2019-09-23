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
		int[] amostra = { 36, 35, 34, 38, 36, 38, 41 };
		int[] pesos = { 0, 1, 2, 2, 1, 0, 3, 4 };
		int possibilidade = 2;
		Integer opcao = menu();

		while (opcao != SAIR_DO_PROGRAMA) {
			switch (opcao) {
			case SOMATORIO:
				JOptionPane.showConfirmDialog(null, somatorio(amostra));
				break;
			case MEDIA_ARITMETICA_SIMPLES:
				JOptionPane.showConfirmDialog(null, mediaAritmeticaSimples(amostra));
				break;
			case MEDIA_ARITMETICA_PONDERADA:
				JOptionPane.showConfirmDialog(null, mediaAritmeticaPonderada(amostra, pesos));
				break;
			case MODA:
				JOptionPane.showConfirmDialog(null, moda(amostra));
				break;
			case MEDIANA:
				JOptionPane.showConfirmDialog(null, mediana(amostra));
				break;
			case VARIANCIA:
				JOptionPane.showConfirmDialog(null, variancia(amostra));
				break;
			case DESVIO_PADRAO:
				JOptionPane.showConfirmDialog(null, desvioPadrao(amostra));
				break;
			case MEDIA_GEOMETRICA:
				JOptionPane.showConfirmDialog(null, mediaGeometrica(amostra));
				break;
			case MEDIA_HARMONICA:
				JOptionPane.showConfirmDialog(null, mediaHarmonica(amostra));
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
				JOptionPane.showMessageDialog(null, "[Programa será encerado!]");
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

	private static int somatorio(int[] amostra) {
		int somatorio = 0;
		for (int i = 0; i < amostra.length; i++) {
			somatorio += amostra[i];
		}
		return somatorio;
	}

	private static int mediaHarmonica(int[] amostra) {
		int mediaHarm = amostra.length;
		int somat = 0;
		for (int i = 1; i < amostra.length; i++) {
			somat = 1 / amostra[i];
		}
		return mediaHarm / somat;
	}

	/*
	 * Ms: média aritmética simples x1, x2, x3,...,xn: valores dos dados n: numero
	 * de dados
	 */
	private static double mediaAritmeticaSimples(int[] amostra) {
		return (double)somatorio(amostra) / amostra.length;
	}

	/*
	 * A média aritmética ponderada é calculada multiplicando cada valor do conjunto
	 * de dados pelo seu peso. Depois, encontra-se a soma desses valores que será
	 * dividida pela soma dos pesos Mp: Média aritmética ponderada p1, p2,..., pn:
	 * pesos x1, x2,...,xn: valores dos dados
	 */
	private static int mediaAritmeticaPonderada(int[] amostra, int[] pesos) {
		int somatorioAmostra = 0;
		int somatorioPesos = 0;
		if (amostra.length == pesos.length) {
			for (int i = 0; i < amostra.length; i++) {
				somatorioAmostra += i;
			}
			for (int i = 0; i < amostra.length; i++) {
				somatorioPesos += i;
			}
			return somatorioAmostra / somatorioPesos;
		} else
			return 0;
	}

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

	/*
	 * A Moda (Mo) representa o valor mais frequente de um conjunto de dados, sendo
	 * assim, para defini-la basta observar a frequÃªncia com que os valores
	 * aparecem. Um conjunto de dados é chamado de bimodal quando apresenta duas
	 * modas, ou seja, dois valores sÃ£o mais frequentes.
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
	 * Quando o número elementos de um conjunto é par, a mediana é encontrada pela
	 * média dos dois valores centrais. Assim, esses valores sÃ£o somados e
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
	 * VariÃ¢ncia é uma medida de dispersÃ£o e é usada também para expressar o
	 * quanto um conjunto de dados se desvia da média. âˆ‘: sÃ­mbolo de somatÃ³rio.
	 * Indica que temos que somar todos os termos, desde a primeira posiÃ§Ã£o (i=1)
	 * até a posiÃ§Ã£o n xi: valor na posiÃ§Ã£o i no conjunto de dados MA: média
	 * aritmética dos dados n: quantidade de dados
	 */
	private static int variancia(int[] amostra) {
		int ma = mediaAritmeticaSimples(amostra);
		int somat = 0;
		// prepara os valores
		for (int i = 0; i < amostra.length; i++) {
			amostra[i] -= ma;
			amostra[i] = amostra[i] ^ 2;
		}
		somat = somatorio(amostra);
		return somat / amostra.length;
	}

	// Desvio PadrÃ£o
	private static double desvioPadrao(int[] amostra) {
		int variancia = variancia(amostra);
		return Math.sqrt(variancia);
	}

	// Media Geométrica
	private static double mediaGeometrica(int[] amostra) {
		double mg = 0;
		int produto = 0;
		produto = produto(amostra);
		mg = Math.sqrt(Math.pow(produto, amostra.length));
		return mg;
	}

	private static int produto(int[] amostra) {
		int valor = 0;
		for (int i = 0; i < amostra.length; i++) {
			valor *= amostra[i];
		}
		return valor;
	}

	// Amplitude
	private static int amplitude(int[] amostra) {
		// Essa medida de dispersão é definida como a diferenca entre a maior e a menor
		// observação de um conjunto de dados, isto é:
		int a = amostra[0] - amostra[amostra.length];
		return a;
	}

	// Coeficiente de Variação
	private static double coeficienteDeVariacao(int[] amostra) {
		double cv = (desvioPadrao(amostra) * 100) / mediaAritmeticaSimples(amostra);
		return cv;
	}

	// Formula da Probabilidade
	/*
	 * Em um fenómeno aleatÃ³rio, as possibilidades de ocorrÃªncia de um evento sÃ£o
	 * igualmente prováveis. p(A): probabilidade da ocorrÃªncia de um evento A n(A):
	 * número de casos que nos interessam (evento A) n(Î©): número total de casos
	 * possÃ­veis
	 */
	private static double probabilidade(int[] amostra, int possibilidade) {
		// Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado
		// resultado através da divisÃ£o
		// entre o número de eventos favoráveis e o número total de resultados
		// possÃ­veis:
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
