package controller.menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ControllerAjuda implements Initializable {

	@FXML
	private AnchorPane anchorPaneVideo;

	@FXML
	private Label labelVoltar;

	@FXML
	private Circle close;

	@FXML
	private Circle min;

	@FXML
	private Label labelAjuda;

	@FXML
	private Text txtDescricaoCurta;

	@FXML
	private Button btnVoltar;

	@FXML
	private Text txtDescricaoAjuda;

	@FXML
	private Text txtVideo;

	@FXML
	private WebView WebViewVideo;

	public WebView carregaVideo(String txt) {
		WebView WebViewVideo = new WebView();
		WebViewVideo.getEngine().load(txt);
		WebViewVideo.setPrefSize(640, 390);
		return WebViewVideo;
	}

	@FXML
	void closeclick(MouseEvent event) {
		System.exit(0);
	}

	@FXML
	void btnVoltar(MouseEvent event) {
		System.out.println("Usuário quer voltar...");
	}

	@FXML
	void minclick(MouseEvent event) {
		((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);
	}

	@FXML
	void voltar(MouseEvent event) {

	}

	public int getBotaoSelecionado() {
		return Controller.botaoSelecionado;
	}

	public String defineUrl(int codBotao) {
		String txt;
		switch (codBotao) {
		case 1: // somatorio simples
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 2: // quadrado da soma
			txt = "https://www.youtube-nocookie.com/embed/Vf7qfYX1Fck";
			return txt;
		case 3: // produto das somas
			txt = "https://www.youtube-nocookie.com/embed/JtHS7GdcIMs";
			return txt;
		case 4: // media aritmetica simples
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 5: // media aritmetica ponderada
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 6: // moda
			txt = "https://www.youtube-nocookie.com/embed/vDqCrYmXfIk";
			return txt;
		case 7: // mediana
			txt = "https://www.youtube-nocookie.com/embed/RICaIF5q2FQ";
			return txt;
		case 8: // variancia
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 9: // desvio padrao
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 10: // media geometrica
			txt = "https://www.youtube-nocookie.com/embed/yiApPbh1VDM";
			return txt;
		case 11: // media harmonica
			txt = "https://www.youtube-nocookie.com/embed/byDVo4inbvI";
			return txt;
		case 12: // produto
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 13: // probabilidade
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 14: // fatorial
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 15: // soma de quadrados
			txt = "https://www.youtube-nocookie.com/embed/Vf7qfYX1Fck";
			return txt;
		default:
			break;
		}
		return null;
	}

	public String descLonga(int codBotao) {
		String txt;
		switch (codBotao) {
		case 1: // somatorio simples
			txt = "Muitos dos processos estatísticos exigem o cálculo da soma. Para simplificar a apresentação da operação de adição nas expressões algébricas, utiliza-se a notação Σ, letra grega sigma maiúscula.\r\n"
					+ "\r\n" + "SOMATÓRIO SIMPLES\r\n" + "\r\n"
					+ "O somatório simples consiste na soma de todos os valores da amostra.\r\n" + "\r\n" + "\r\n"
					+ "Sendo:\r\n" + "\r\n" + "N, é a ordem da última parcela ou limite superior (LS) do somatório;\r\n"
					+ "i=1, é a ordem da primeira parcela da soma ou limite inferior do somatório (LI);\r\n"
					+ "i, é o índice que está indexando os valores da variável X (outras letras como j, l, k podem ser utilizadas)\r\n"
					+ "";
			return txt;
		case 2: // quadrado da soma
			txt = "O quadrado da soma consiste no quadrado de uma operação de adição com dois termos.\r\n" + "\r\n"
					+ "Sendo:\r\n" + "\r\n" + "N, é a ordem da última parcela ou limite superior (LS) do somatório;\r\n"
					+ "i=1, é a ordem da primeira parcela da soma ou limite inferior do somatório (LI);\r\n"
					+ "i, é o índice que está indexando os valores da variável X (outras letras como j, l, k podem ser utilizadas)";
			return txt;
		case 3: // produto das somas
			txt = "Consiste na multiplicação do somatório de dois conjuntos, x e y.\r\n" + "\r\n" + "Sendo:\r\n"
					+ "\r\n" + "N, é a ordem da última parcela ou limite superior (LS) do somatório;\r\n"
					+ "i=1, é a ordem da primeira parcela da soma ou limite inferior do somatório (LI);\r\n"
					+ "i, é o índice que está indexando os valores da variável X (outras letras como j, l, k podem ser utilizadas)\r\n"
					+ "";
			return txt;
		case 4: // media aritmetica simples
			txt = "Esse tipo de média funciona de forma mais adequada quando os valores são relativamente uniformes.\r\n"
					+ "Por ser sensível aos dados, nem sempre fornece os resultados mais adequados.\r\n"
					+ "Isso porque todos os dados possuem a mesma importância (peso).\r\n" + "\r\n" + "Sendo:\r\n"
					+ "Ms: média aritmética simples\r\n" + "x1, x2, x3,...,Xn: valores dos dados\r\n"
					+ "n: número de dados";
			return txt;
		case 5: // media aritmetica ponderada
			txt = "A m�dia aritm�tica ponderada � calculada multiplicando cada valor do conjunto de dados pelo seu peso.\r\n"
					+ "Depois, encontra-se a soma desses valores que será dividida pela soma dos pesos.\r\n" + "\r\n"
					+ "Sendo:\r\n" + "Mp: Média aritmética ponderada\r\n" + "p1, p2,..., Pn: pesos\r\n"
					+ "x1, x2,...,Xn: valores dos dados\r\n" + "";
			return txt;
		case 6: // moda
			txt = "A Moda (Mo) representa o valor mais frequente de um conjunto de dados, sendo assim, para defini-la basta observar a frequência com que os valores aparecem.\r\n"
					+ "Um conjunto de dados é chamado de unimodal quando apresenta uma moda, bimodal quando apresenta duas modas ou multimodal quando aparece múltiplas modas.";
			return txt;
		case 7: // mediana
			txt = "A Mediana (Md) representa o valor central de um conjunto de dados. Para encontrar o valor da mediana é necessário colocar os valores em ordem crescente ou decrescente.\r\n"
					+ "Quando o número elementos de um conjunto é par, a mediana é encontrada pela média dos dois valores centrais. Assim, esses valores são somados e divididos por dois.\r\n"
					+ "Quando o número de elementos de um conjunto é ímpar, basta retirar o valor do meio, lembrando que os valores devem estar em ordem.";
			return txt;
		case 8: // variancia
			txt = "Vari�ncia � uma medida de dispers�oo e � usada tamb�m para expressar o quanto um conjunto de dados se desvia da média.\r\n"
					+ "O desvio padrão (DP) é definido como a raiz quadrada da variância (V).\r\n" + "\r\n" + "\r\n"
					+ "Sendo:\r\n"
					+ "∑: símbolo de somatório. Indica que temos que somar todos os termos, desde a primeira posição (i=1) até a posição n\r\n"
					+ "xi: valor na posição i no conjunto de dados\r\n" + "MA: média aritmética dos dados\r\n"
					+ "n: quantidade de dados";
			return txt;
		case 9: // desvio padrao
			txt = "O desvio padrão (DP) é calculado usando-se a seguinte fórmula:\r\n" + "\r\n" + "Sendo:\r\n"
					+ "∑: símbolo de somatório. Indica que temos que somar todos os termos, desde a primeira posição (i=1) até a posição n\r\n"
					+ "xi: valor na posição i no conjunto de dados\r\n" + "MA: média aritmética dos dados\r\n"
					+ "n: quantidade de dados\r\n" + "";
			return txt;
		case 10: // media geometrica
			txt = "A média geométrica é definida, para números positivos, como a raiz n-ésima do produto de n elementos de um conjunto de dados.\r\n"
					+ "Assim como a média aritmética, a média geométrica também é uma medida de tendência central.\r\n"
					+ "\r\n" + "Sendo:\r\n" + "MG: média geométrica\r\n"
					+ "n: número de elementos do conjunto de dados\r\n" + "x1, x2, x3, ..., Xn: valores dos dados\r\n"
					+ "";
			return txt;
		case 11: // media harmonica
			txt = "A média harmônica de um conjunto de n dados é obtida dividindo a quantidade de dados pela soma dos inversos dos dados. \r\n"
					+ "\r\n" + "\r\n" + "Sendo:\r\n" + "H: média Harmônica\r\n"
					+ "n: número de elementos do conjunto de dados\r\n" + "x1, x2, x3, ..., Xn: valores dos dados";
			return txt;
		case 12: // produto
			txt = "https://www.youtube-nocookie.com/embed/jJ4WJvZ7lqo";
			return txt;
		case 13: // probabilidade
			txt = "A teoria da probabilidade é o ramo da Matemática que estuda experimentos ou fenômenos aleatórios e através dela é possível analisar as chances de um determinado evento ocorrer.\r\n"
					+ "Quando calculamos a probabilidade, estamos associando um grau de confiança na ocorrência dos resultados possíveis de experimentos, cujos resultados não podem ser determinados antecipadamente.\r\n"
					+ "Em um fenômeno aleatório, as possibilidades de ocorrência de um evento são igualmente prováveis.\r\n"
					+ "Sendo assim, podemos encontrar a probabilidade de ocorrer um determinado resultado através da divisão entre o número de eventos favoráveis e o número total de resultados possíveis:\r\n"
					+ "\r\n" + "Sendo:\r\n" + "p(A): probabilidade da ocorrência de um evento A\r\n"
					+ "n(A): número de casos que nos interessam (evento A)\r\n"
					+ "n(Ω): número total de casos possíveis";
			return txt;
		case 14: // fatorial
			txt = "Fatorial � um n�mero natural inteiro positivo, o qual � representado por n!\r\n"
					+ "O fatorial de um número é calculado pela multiplicação desse número por todos os seus antecessores até chegar ao número 1. Note que nesses produtos, o zero (0) é excluído.\r\n"
					+ "O fatorial é representado por:\r\n" + "n!= n.(n-1) . (n-2) . (n-3) …. (n-3)!\r\n" + "\r\n"
					+ "Sendo:\r\n" + "\r\n" + "N → é o número inteiro que determina o fatorial;";
			return txt;
		case 15: // soma de quadrados
			txt = "Consiste no somatório dos quadrados dos números presentes na amostra.\r\n" + "\r\n" + "\r\n"
					+ "Sendo:\r\n" + "\r\n" + "N, é a ordem da última parcela ou limite superior (LS) do somatório;\r\n"
					+ "i=1, é a ordem da primeira parcela da soma ou limite inferior do somatório (LI);\r\n"
					+ "i, é o índice que está indexando os valores da variável X (outras letras como j, l, k podem ser utilizadas)";
			return txt;
		default:
			break;
		}
		return null;
	}

	public String descCurta(int codBotao) {
		String txt;
		switch (codBotao) {
		case 1: // somatorio simples
			txt = "Somatorio Simples";
			return txt;
		case 2: // quadrado da soma
			txt = "Quadrado da Soma";
			return txt;
		case 3: // produto das somas
			txt = "Produto das Somas";
			return txt;
		case 4: // media aritmetica simples
			txt = "Média Aritmética Simples";
			return txt;
		case 5: // media aritmetica ponderada
			txt = "Média Aritmética Ponderada";
			return txt;
		case 6: // moda
			txt = "Moda";
			return txt;
		case 7: // mediana
			txt = "Mediana";
			return txt;
		case 8: // variancia
			txt = "Variância";
			return txt;
		case 9: // desvio padrao
			txt = "Desvio Padrão";
			return txt;
		case 10: // media geometrica
			txt = "Média Geométrica";
			return txt;
		case 11: // media harmonica
			txt = "Média Harmônica";
			return txt;
		case 12: // produto
			txt = "Produto";
			return txt;
		case 13: // probabilidade
			txt = "Probabilidade";
			return txt;
		case 14: // fatorial
			txt = "Fatorial";
			return txt;
		case 15: // soma de quadrados
			txt = "Soma de Quadrados";
			return txt;
		default:
			break;
		}
		return null;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// pega o valor do botão
		int codBotao = getBotaoSelecionado();
		double videoX = WebViewVideo.getLayoutX();
		double videoY = WebViewVideo.getLayoutY();
		// preenche a tela com as informações
		txtDescricaoCurta.setText(descCurta(codBotao));
		txtDescricaoAjuda.setText(descLonga(codBotao));
		WebViewVideo = carregaVideo(defineUrl(codBotao));
		anchorPaneVideo.getChildren().add(WebViewVideo);
		WebViewVideo.setLayoutX(videoX);
		WebViewVideo.setLayoutY(videoY);
	}
}
