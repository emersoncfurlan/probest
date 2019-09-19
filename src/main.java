import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Variaveis de ambiente
		int[] amostra1 = { 36, 35, 34, 38, 36, 38, 41 };
		int[] pesos = { 0, 1, 2, 2, 1, 0, 3, 4 };
		// Métodos e funções

		// mediaAritmeticaSimples(amostra1);
		// mediaAritmeticaPonderada(amostra1, pesos);
		moda(amostra1);
	}

	private static int somatorio(int[] amostra) {
		int somatorio = 0;
		for (int i = 0; i < amostra.length; i++) {
			somatorio += i;
		}
		return somatorio;
	}

	/*
	 * Ms: média aritmética simples x1, x2, x3,...,xn: valores dos dados n: número
	 * de dados
	 */
	private static int mediaAritmeticaSimples(int[] amostra) {
		return somatorio(amostra) / amostra.length;
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
	 * assim, para defini-la basta observar a frequência com que os valores
	 * aparecem. Um conjunto de dados é chamado de bimodal quando apresenta duas
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
			// não tem porque voltar e rever o item
			for (int j = 0; j < amostraOrdenada.length; j++) {

			}
			System.out.println(contador[i]);
		}
		return 0;
	}

	/*
	 * Quando o número elementos de um conjunto é par, a mediana é encontrada pela
	 * média dos dois valores centrais. Assim, esses valores são somados e divididos
	 * por dois.
	 */
	private static int mediana(int[] amostra) {
		if (amostra.length % 2 == 0) { // par
			return amostra[amostra.length / 2];
		} else { // impar
			return ((amostra[(amostra.length / 2)] + amostra[(amostra.length / 2) + 1]) / 2);
		}
	}

	/*
	 * Variância é uma medida de dispersão e é usada também para expressar o quanto
	 * um conjunto de dados se desvia da média. ∑: símbolo de somatório. Indica que
	 * temos que somar todos os termos, desde a primeira posição (i=1) até a posição
	 * n xi: valor na posição i no conjunto de dados MA: média aritmética dos dados
	 * n: quantidade de dados
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

	// Desvio Padrão
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
		// Essa medida de dispersão é definida como a diferença entre a maior e a menor
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
	 * Em um fenômeno aleatório, as possibilidades de ocorrência de um evento são
	 * igualmente prováveis. p(A): probabilidade da ocorrência de um evento A n(A):
	 * número de casos que nos interessam (evento A) n(Ω): número total de casos
	 * possíveis
	 */
	private static double probabilidade(int[] amostra, int possibilidade) {
		// Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado
		// resultado através da divisão
		// entre o número de eventos favoráveis e o número total de resultados
		// possíveis:
		long numTotal = fatorial(amostra.length);
		long pa = possibilidade / numTotal;
		// converter para porcentagem aproximada
		double porcent = 100 * (double) pa;
		return porcent;
	}

	// Fatorial recursivo
	private static long fatorial(int num) {
		int anterior = num - 1;
		long fatorial = 0;
		if (num <= 1)
			return 1;
		else
			fatorial = num * fatorial(anterior);
		return fatorial;
	}

}
