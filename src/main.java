import java.util.Random;
import java.util.ArrayList;
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
				JOptionPane.showConfirmDialog(null, arrayToString(moda(amostra)));
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

	private static double mediaHarmonica(int[] amostra) {
		int mediaHarm = amostra.length;
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
	private static double mediaAritmeticaSimples(int[] amostra) {
		double amostraAux = amostra.length;
		int somatorioAux = 0;
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
	private static double mediaAritmeticaPonderada(int[] amostra, int[] pesos) {
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
			return  mAPonderada;
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

	// Método necessário para se retirar a moda
	// Recebe um vetor e retorna um vetor sem elementos repetidos
	// Dá pra melhorar se alguém souber
	private static int[] tiraRepetidos(int[] amostra) {
		boolean tem; // Variável auxiliar para checar se o valor da amostra "TEM" no resultado
		ArrayList<Integer> result = new ArrayList<Integer>();

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

		int fim[] = new int[result.size()]; // Vetor final para converter de ArrayList para vetor

		for (int i = 0; i < result.size(); i++) {
			fim[i] = result.get(i);
		}

		return fim;
	}

	// Conta quantas vezes um elemento aparece num vetor
	// Não sei se já existe um método que faz isso, não achei
	// Auxilia na função da moda
	private static int contaNoVetor(int[] amostra, int elemento) {
		int contador = 0;
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
	private static int[] moda(int[] amostra) {
		int semRepetidos[] = tiraRepetidos(amostra); // Amostra sem dados repetidos
		int freq[] = new int[semRepetidos.length]; // Vetor que vai armazenar a frequência dos itens individuais
		/*
		 * O seguinte 'for', checa a quantidade dos itens do vetor sem repetidos dentro
		 * da amostra e grava a frequencia no vetor freq
		 */
		for (int i = 0; i < freq.length; i++) {
			int quant = 0;
			for (int j = 0; j < amostra.length; j++) {
				if (semRepetidos[i] == amostra[j]) {
					quant++;
				}
			}
			freq[i] = quant;
		}

		int moda = freq[0]; // Grava a frequência modal
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
		ArrayList<Integer> modasArList = new ArrayList<Integer>();

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == moda) {
				// Adiciona os valores que tem a mesma frequência (a frequência modal)
				modasArList.add(semRepetidos[i]);
			}
		}

		// Lista de modas (em vetor)
		int[] modas = new int[modasArList.size()];

		// Converte de ArrayList para Vetor
		for (int i = 0; i < modas.length; i++) {
			modas[i] = modasArList.get(i);
		}

		return modas;
	}

	// O método moda retorna um vetor, este método está sendo usado para transformar
	// as modas em String
	private static String arrayToString(int[] vetor) {
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
		return "";
	}

	/*
	 * Quando o número elementos de um conjunto é par, a mediana é encontrada pela
	 * média dos dois valores centrais. Assim, esses valores sÃ£o somados e
	 * divididos por dois.
	 */
	private static double mediana(int[] amostra) {
		int amostraOrdenada[] = ordenarAmostra(amostra);
		
		if (amostra.length % 2 == 0) { // par
			return (double)(amostraOrdenada[(amostra.length / 2)] + amostra[(amostra.length / 2) - 1]) / 2;
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
	private static double variancia(int[] amostra) {
		double ma = mediaAritmeticaSimples(amostra);
		double somat = 0;
		// prepara os valores
		for (int i = 0; i < amostra.length; i++) {
			somat += Math.pow((double) amostra[i] - ma, 2);
		}
		return somat / amostra.length;
	}

	// Desvio PadrÃ£o
	private static double desvioPadrao(int[] amostra) {
		double variancia = variancia(amostra);
		return Math.sqrt(variancia);
	}

	// Media Geométrica
	private static double mediaGeometrica(int[] amostra) {
		double mg = 0;
		double produto = 0;
		produto = produto(amostra);
		mg = Math.pow(produto, Math.pow(amostra.length, -1));
		return mg;
	}

	private static long produto(int[] amostra) {
		long valor = amostra[0];
		for (int i = 1; i < amostra.length; i++) {
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
