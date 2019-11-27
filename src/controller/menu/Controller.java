package controller.menu;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Amostra;
import utils.Classe;
import utils.Tabeleiro;
import utils.resultadoTabela;

public class Controller {
	private static Amostra amostra = new Amostra();
	public static int botaoSelecionado;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Circle close;

	@FXML
	private Circle min;

	@FXML
	private Font x1;

	@FXML
	private Color x2;

	@FXML
	private TextField txtAmostra;

	@FXML
	private Font x12;

	@FXML
	private Color x24;

	@FXML
	private TextField txtPeso;

	@FXML
	private Button btnInserir;

	@FXML
	private Button btnCarregar;

	@FXML
	private Font x11;

	@FXML
	private Color x21;

	// inicio checkBox
	@FXML
	private CheckBox chkTudoDescritiva;

	@FXML
	private CheckBox chkMedia;

	@FXML
	private CheckBox chkMediaAritmetica;

	@FXML
	private CheckBox chkMediaAritmeticaPonderada;

	@FXML
	private CheckBox chkMediaHarm;

	@FXML
	private CheckBox chkMediaGeo;

	@FXML
	private CheckBox chkSomat;

	@FXML
	private CheckBox chkModa;

	@FXML
	private CheckBox chkMediana;

	@FXML
	private CheckBox chkVariancia;

	@FXML
	private CheckBox chkDesvioPadrao;

	@FXML
	private CheckBox chkProbabilidade;

	@FXML
	private CheckBox chkFatorial;

	@FXML
	private CheckBox chkDuasAmostras;

	@FXML
	private CheckBox chkQuadradoSoma;

	@FXML
	private CheckBox chkSomaProdutos;

	@FXML
	private CheckBox chkProdutoSoma;

	@FXML
	private CheckBox chkProduto;

	@FXML
	private CheckBox chkSomaQuadrados;

	@FXML
	private Label lblAmostra;

	@FXML
	private Color x222;

	@FXML
	private Font x232;

	@FXML
	private Color x22;

	@FXML
	private Font x23;

	@FXML
	private TextArea txtAreaAmostra;

	@FXML
	private Color x2212;

	@FXML
	private Font x2312;

	@FXML
	private Color x221;

	@FXML
	private Font x231;

	@FXML
	private Color x2211;

	@FXML
	private Font x2311;

	// buttons de ajuda
	@FXML
	private Button btnAjudaMedia;

	@FXML
	private Button btnAjudaMediaAritm;

	@FXML
	private Button btnAjudaMediaAritmPond;

	@FXML
	private Button btnAjudaMediaHarm;

	@FXML
	private Button btnAjudaMediaGeo;

	@FXML
	private Button btnAjudaSomat;

	@FXML
	private Button btnAjudaModa;

	@FXML
	private Button btnAjudaMediana;

	@FXML
	private Button btnAjudaVariancia;

	@FXML
	private Button btnAjudaDesvioPadrao;

	@FXML
	private Button btnAjudaProbabilidade;

	@FXML
	private Button btnAjudaFatorial;

	@FXML
	private Button btnAjudaSomaDosQuadrados;

	@FXML
	private Button btnAjudaProdutoDaSoma;

	@FXML
	private Button btnAjudaSomaDeProdutos;

	// grafico de linhas
	@FXML
	private LineChart<String, Integer> graficoDeLinhas;

	@FXML
	private CategoryAxis LinhaCategoryAxis;

	@FXML
	private NumberAxis LinhaNumberAxis;

	// grafico de barras
	@FXML
	private BarChart<String, Integer> graficoDeBarras;

	@FXML
	private CategoryAxis BarChartCategoryAxis;

	@FXML
	private NumberAxis BarChartNumberAxis;

	// table classes
	@FXML
	private TableView<Classe> tableClasses;

	@FXML
	private TableColumn<Classe, SimpleDoubleProperty> limiteInf;

	@FXML
	private TableColumn<Classe, SimpleDoubleProperty> limiteSup;

	@FXML
	private TableColumn<Classe, SimpleIntegerProperty> freqAbsoluta;

	@FXML
	private TableColumn<Classe, SimpleIntegerProperty> freqAcumulada;

	@FXML
	private TableColumn<Classe, SimpleDoubleProperty> freqRelativa;

	@FXML
	private TableColumn<Classe, SimpleDoubleProperty> freqRelativaAcm;

	// table resultados
	@FXML
	private TableView<resultadoTabela> tableResultado;

	@FXML
	private TableColumn<resultadoTabela, SimpleStringProperty> funcionalidadeCol;

	@FXML
	private TableColumn<resultadoTabela, SimpleDoubleProperty> resultadoCol;
	
    @FXML
    void gerenciaCheckBox(ActionEvent event) {
    	if(chkTudoDescritiva.selectedProperty().getValue()) {
    		chkMediaAritmetica.setSelected(true);
    		chkMediaAritmeticaPonderada.setSelected(true);
    		chkMediaHarm.setSelected(true);
    		chkMediaGeo.setSelected(true);
    		chkSomat.setSelected(true);
    		chkModa.setSelected(true);
    		chkMediana.setSelected(true);
    		chkVariancia.setSelected(true);
    		chkDesvioPadrao.setSelected(true);
    		chkProduto.setSelected(true);
    		chkProduto.setSelected(true);
    		chkQuadradoSoma.setSelected(true);
    		chkSomaProdutos.setSelected(true);
    		chkSomaQuadrados.setSelected(true);
    		chkProdutoSoma.setSelected(true);
    	}else {
    		chkMediaAritmetica.setSelected(false);
    		chkMediaAritmeticaPonderada.setSelected(false);
    		chkMediaHarm.setSelected(false);
    		chkMediaGeo.setSelected(false);
    		chkSomat.setSelected(false);
    		chkModa.setSelected(false);
    		chkMediana.setSelected(false);
    		chkVariancia.setSelected(false);
    		chkDesvioPadrao.setSelected(false);
    		chkProduto.setSelected(false);
    		chkProduto.setSelected(false);
    		chkQuadradoSoma.setSelected(false);
    		chkSomaProdutos.setSelected(false);
    		chkSomaQuadrados.setSelected(false);
    		chkProdutoSoma.setSelected(false);
    	}
    }

	@FXML
	void initialize() {
	}

	/****
	 * selecionar arquivo
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	public void btnCarregar(ActionEvent event) throws IOException, InterruptedException {
		System.out.println("btnCarregar click");
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File(System.getProperty("user.home"))); // defino caminho inicial
		fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("TXT", "*.txt"),
				new FileChooser.ExtensionFilter("CSV", "*.csv"));
		File arquivoSelecionado = fc.showOpenDialog(null);
		String url = null;
		if (arquivoSelecionado != null) {
			System.out.println("Endereco do arquivo: " + arquivoSelecionado.getAbsolutePath());
			leitor(arquivoSelecionado.getAbsolutePath());
		} else {
			System.out.println("Nenhum arquivo foi selecionado");
		}
		System.out.println("Arquivo selecionado:\n" + url);
		atualizarGraficosTabelas();
	}

	// leitor de linhas do arquivo carregado
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		String[] conteudo = null;
		String[] conteudoDados = new String[0];
		String[] conteudoPesos = new String[0];
		Amostra amostraPesos = new Amostra();
		boolean dados = false, pesos = false, forDados = false;
		int qtdLinhas = 0; // define quantidade de linhas para exibição e armazenagem de histórico
		int auxDados = 0, auxPesos = 0; // variavel auxiliar para gerenciar amostra irregular
		while (true) {
			if (linha != null) {
				System.out.println(
						"Linha " + qtdLinhas + " contém os elementos : " + linha + "tamanho linha: " + linha.length());
				conteudo = linha.split(";"); // quebro a linha em um array separando por ";"
				// preenchendo o conteudo dados
				if (!dados) { // se dados ainda não foi encontrado logo é false
					for (int i = 0; i < conteudo.length || forDados; i++) {
						// se peso for encontrado, armazeno o index de peso na variavel aux e saio do
						// for de dados
						if (conteudo[i].equalsIgnoreCase("peso") || conteudo[i].equalsIgnoreCase("pesos")) {
							auxDados = i; // defino ponto de inicio dos pesos
							break; // sai do for
						}
						if ((conteudo[i].equalsIgnoreCase("dado") || conteudo[i].equalsIgnoreCase("dados")) || dados) {
							if (!dados) {
								dados = true;
								System.out.println("Os dados foram encontrados? " + dados);
								conteudoDados = new String[conteudo.length - auxPesos]; // tamanho atual menos o tamanho
																						// já percorrido da linha
							}
							// se já encontrei os dados preencho o vetor de dados
							if (dados) {
								if (conteudo[i] == null) {
									break;
								} else {
									System.out.println("ConteudoDados adicionado: " + conteudo[i]);
									conteudoDados[i] = conteudo[i];
								}

							}
						}
					}
				}
				// após encontrar todos os dados da amostra na linha, preencho conteudo pesos
				// com os dados encontrados
				if (!pesos) { // se peso ainda não encontrado logo é false
					for (int j = auxDados; j < conteudo.length; j++) {
						if (conteudo[j].equalsIgnoreCase("dado") || conteudo[j].equalsIgnoreCase("dados")) {
							auxPesos = j; // defino ponto de inicio dos dados
							dados = true; // seta a flag de dados como true
							break; //// sai do for
						}
						if (((conteudo[j].equalsIgnoreCase("peso")) || (conteudo[j].equalsIgnoreCase("pesos")))
								|| pesos) {
							if (!pesos) {
								pesos = true;
								System.out.println("Os Pesos foram encontrados? " + pesos);
								conteudoPesos = new String[conteudo.length];
							}
							// se já encontrei os pesos preencho o vetor de pesos
							if (pesos) {
								if (conteudo[j] == null) {
									System.out.println("quebra");
									break;
								} else {
									System.out.println("ConteudoPesos adicionado: " + conteudo[j]);
									conteudoPesos[j] = conteudo[j];
								}

							}
						}
					}
				}
			} else {
				break;
			}
			if (linha.equalsIgnoreCase("")) {
				System.out.println("Linha " + qtdLinhas + "está vazia...");
			}
			qtdLinhas++; // contador de linhas
			linha = buffRead.readLine();
		}
		for (int j = 0; j < conteudoDados.length; j++) {
			System.out.println("Dados: " + conteudoDados[j]);
		}
		for (int j = 0; j < conteudoPesos.length; j++) {
			System.out.println("Pesos: " + conteudoPesos[j]);
		}
		amostra = txtDados(limpaAmostraCarregada(conteudoDados));
		amostraPesos = txtDados(limpaAmostraCarregada(conteudoPesos));
		amostra.setPesos(amostraPesos.getDados());
		System.out.println("Amostra do txtAmostra: " + amostra.toString());
		amostra.result();
		buffRead.close();
	}

	public static String[] limpaAmostraCarregada(String[] valores) {
		String[] limpo = new String[valores.length - 2];
		System.out.println("valores.length" + limpo.length);
		for (int i = 0, j = 1; i < limpo.length; i++, j++) {
			System.out.println("valores[j]: " + valores[j]);
			limpo[i] = valores[j];
			System.out.println("limpo[i]: " + limpo[i]);
		}
		return limpo;
	}

	public static void salvarResultados(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		linha = amostra.toString();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	/****
	 * btnInserir - Inserir amostra
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnInserir(ActionEvent event) throws IOException, InterruptedException {
		System.out.println("btnIserir click:" + txtAmostra.getText());
		String[] conteudoDados = null;
		String[] conteudoPesos = null;
		ArrayList<Double> pesos = new ArrayList<Double>();
		ArrayList<Double> dados = new ArrayList<Double>();
		conteudoDados = txtAmostra.getText().split(";");
		for (int i = 0; i < conteudoDados.length; i++) {
			dados.add(Double.valueOf(conteudoDados[i]));
		}
		if (amostra != null) {
			amostra = null;
		}
		if ("".equals(txtPeso.getText())) {
			amostra = new Amostra(dados);
		} else {
			conteudoPesos = txtPeso.getText().split(";");
			for (int i = 0; i < conteudoPesos.length; i++) {
				pesos.add(Double.valueOf(conteudoPesos[i]));
			}
			amostra = new Amostra(dados, pesos);
		}
		System.out.println("Amostra do txtAmostra: " + amostra.toString());
		amostra.result();
		atualizarGraficosTabelas();
	}

	private void atualizarGraficosTabelas() throws InterruptedException {
		clear(); // limpa para inserir a nova amostra
		setTextAreaAmostra("Dados:" + amostra.getDados() + "\nPesos: " + amostra.getPesos() + "\n Dados Pesados"
				+ amostra.getDadosPesados());
		listaResultados();
		listaClasses();
		listGraficoBarras();
		listGraficoLinha();
	}

	public void clear() {
		listResultadoTabela.clear();
		listClassesTabela.clear();
		graficoDeLinhas.getData().clear();
		graficoDeBarras.getData().clear();
	}

	public static Amostra txtDados(String[] conteudo) {
		for (int i = 0; i < conteudo.length / 2; i++) {
			System.out.println("conteudo: " + conteudo[i]);
		}
		ArrayList<Double> dados = new ArrayList<Double>();
		for (int i = 0; i < conteudo.length / 2; i++) {
			dados.add(Double.parseDouble(conteudo[i]));
		}
		Amostra novaAmostra = new Amostra(dados);
		return novaAmostra;
	}

	public void setTextAreaAmostra(String conteudo) {
		txtAreaAmostra.setText(conteudo);
	}

	/**** Minimzar janela ****/
	@FXML
	public void minclick(MouseEvent event) throws IOException {
		((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);
	}

	/**** Fechar janela ****/
	@FXML
	public void closeclick(MouseEvent event) throws IOException {
		System.exit(0);
	}

	/****
	 * tableResultados - Preenche o grafico de barras com resultados
	 ****/
	private static ObservableList<String> listGraficoDeBarrasX = FXCollections.observableArrayList();

	private void listGraficoBarras() throws InterruptedException {
		Tabeleiro classeTabela = new Tabeleiro(amostra);
		ArrayList<Classe> listClasses = new ArrayList<Classe>();
		listClasses = classeTabela.getElementos();
		// Adicionei a lista de Frequencia Media e Defini a categoria
		for (Classe classe : listClasses) {
			listGraficoDeBarrasX.add("" + classe.getlimiteMed());
		}
		BarChartCategoryAxis.setCategories(listGraficoDeBarrasX);
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		for (int i = 0; i < listClasses.size(); i++) {
//			String conteudo = ""+listClasses.get(i).getlimiteMed(); 
			series.getData().add(
					new XYChart.Data<>("" + listClasses.get(i).getlimiteMed(), listClasses.get(i).getfreqAbsoluta()));
		}
		graficoDeBarras.getData().add(series);
	}

	/****
	 * tableResultados - Preenche o grafico de linhas com resultados
	 ****/
	// grafico de linhas
	private static ObservableList<String> listGraficoDeLinha = FXCollections.observableArrayList();

	private void listGraficoLinha() throws InterruptedException {
		Tabeleiro classeTabela = new Tabeleiro(amostra);
		ArrayList<Classe> listClasses = new ArrayList<Classe>();
		listClasses = classeTabela.getElementos();
		// Adicionei a lista de Frequencia Media e Defini a categoria
		for (Classe classe : listClasses) {
			listGraficoDeLinha.add("" + classe.getlimiteMed());
		}
		LinhaCategoryAxis.setCategories(listGraficoDeLinha);
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		for (int i = 0; i < listClasses.size(); i++) {
//			String conteudo = ""+listClasses.get(i).getlimiteMed(); 
			series.getData().add(
					new XYChart.Data<>("" + listClasses.get(i).getlimiteMed(), listClasses.get(i).getfreqAbsoluta()));
		}
		graficoDeLinhas.getData().add(series);
	}

	/****
	 * tableResultados - Preenche a tabela de classes com resultados
	 ****/

	private ObservableList<Classe> listClassesTabela = FXCollections.observableArrayList();

	private void listaClasses() throws InterruptedException {
		Tabeleiro classeTabela = new Tabeleiro(amostra);
		ArrayList<Classe> listClasses = new ArrayList<Classe>();
		listClasses = classeTabela.getElementos();

		for (Classe classe : listClasses) {
			System.out.println("Adicionada: \n" + classe.toString());
			Classe obj = new Classe(classe.getlimiteInf(), classe.getlimiteSup(), classe.getlimiteMed(),
					classe.getfreqAbsoluta(), classe.getfreqAcumulada(), classe.getfreqRelativa(),
					classe.getfreqRelativaAcm());
			System.out.println("Objeto:\n" + obj.toString());
			listClassesTabela.add(obj);
		}
		limiteInf.setCellValueFactory(new PropertyValueFactory<>("limiteInf"));
		limiteSup.setCellValueFactory(new PropertyValueFactory<>("limiteSup"));
		freqAbsoluta.setCellValueFactory(new PropertyValueFactory<>("freqAbsoluta"));
		freqAcumulada.setCellValueFactory(new PropertyValueFactory<>("freqAcumulada"));
		freqRelativa.setCellValueFactory(new PropertyValueFactory<>("freqRelativa"));
		freqRelativaAcm.setCellValueFactory(new PropertyValueFactory<>("freqRelativaAcm"));
		tableClasses.setItems(listClassesTabela);
	}

	/****
	 * tableResultados - Preenche a tabela de funcionalidades com resultados
	 ****/

	private ObservableList<resultadoTabela> listResultadoTabela = FXCollections.observableArrayList();

	private void listaResultados() {
		boolean tudoDescritiva = false;
		if (chkTudoDescritiva.selectedProperty().getValue()) {
			System.out.println("chkTudoDescritiva: " + chkTudoDescritiva.selectedProperty().getValue());
			tudoDescritiva = true;
		}
		if (chkSomat.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkSomat: " + chkSomat.selectedProperty().getValue());
			resultadoTabela somatorio = new resultadoTabela("SOMATÓRIO", amostra.getResultadoSOMATORIO());
			listResultadoTabela.add(somatorio);
		}
		if (chkQuadradoSoma.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkQuadradoSoma: " + chkQuadradoSoma.selectedProperty().getValue());
			resultadoTabela quadradoDaSoma = new resultadoTabela("QUADRADO_DA_SOMA",
					amostra.getResultadoQUADRADO_DA_SOMA());
			listResultadoTabela.add(quadradoDaSoma);
		}
		if (chkSomaProdutos.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkSomaProdutos: " + chkSomaProdutos.selectedProperty().getValue());
			resultadoTabela somaDeProdutos = new resultadoTabela("Soma de Produtos",
					amostra.getResultadoSOMA_DE_PRODUTOS());
			listResultadoTabela.add(somaDeProdutos);
		}
		if (chkProdutoSoma.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkProdutoSoma: " + chkProdutoSoma.selectedProperty().getValue());
			resultadoTabela produtoDasSomas = new resultadoTabela("PRODUTO_DAS_SOMAS",
					amostra.getResultadoPRODUTO_DAS_SOMAS());
			listResultadoTabela.add(produtoDasSomas);
		}
		if (chkMediaAritmetica.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaAritmetica: " + chkMediaAritmetica.selectedProperty().getValue());
			resultadoTabela mediaAritm = new resultadoTabela("MEDIA_ARITMETICA_SIMPLES",
					amostra.getResultadoMEDIA_ARITMETICA_SIMPLES());
			listResultadoTabela.add(mediaAritm);
		}
		if (chkMediaAritmeticaPonderada.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaAritmetica: " + chkMediaAritmeticaPonderada.selectedProperty().getValue());
			resultadoTabela mediaAritmPond = new resultadoTabela("MEDIA_ARITMETICA_PONDERADA",
					amostra.getResultadoMEDIA_ARITMETICA_SIMPLES());
			listResultadoTabela.add(mediaAritmPond);
		}
		if (chkModa.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkModa: " + chkModa.selectedProperty().getValue());
			double[] modas = amostra.getResultadoMODA();
			for (int i = 0; i < modas.length; i++) {
				resultadoTabela moda = new resultadoTabela("MODA " + i, Double.valueOf(modas[i]));
				listResultadoTabela.add(moda);
			}
		}
		if (chkMediana.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediana: " + chkMediana.selectedProperty().getValue());
			resultadoTabela MEDIANA = new resultadoTabela("MEDIANA", amostra.getResultadoMEDIANA());
			listResultadoTabela.add(MEDIANA);
		}
		if (chkVariancia.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkVariancia: " + chkVariancia.selectedProperty().getValue());
			resultadoTabela VARIANCIA = new resultadoTabela("VARIANCIA", amostra.getResultadoVARIANCIA());
			listResultadoTabela.add(VARIANCIA);
		}
		if (chkDesvioPadrao.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkDesvioPadrao: " + chkDesvioPadrao.selectedProperty().getValue());
			resultadoTabela DESVIO_PADRAO = new resultadoTabela("DESVIO_PADRAO", amostra.getResultadoDESVIO_PADRAO());
			listResultadoTabela.add(DESVIO_PADRAO);
		}
		if (chkMediaGeo.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaGeo: " + chkMediaGeo.selectedProperty().getValue());
			resultadoTabela MEDIA_GEOMETRICA = new resultadoTabela("MEDIA_GEOMETRICA",
					amostra.getResultadoMEDIA_GEOMETRICA());
			listResultadoTabela.add(MEDIA_GEOMETRICA);
		}
		if (chkMediaHarm.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaHarm: " + chkMediaHarm.selectedProperty().getValue());
			resultadoTabela MEDIA_HARMONICA = new resultadoTabela("MEDIA_HARMONICA",
					amostra.getResultadoMEDIA_HARMONICA());
			listResultadoTabela.add(MEDIA_HARMONICA);
		}
		if (chkProduto.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkProduto: " + chkProduto.selectedProperty().getValue());
			resultadoTabela PRODUTO = new resultadoTabela("PRODUTO", amostra.getResultadoPRODUTO());
			listResultadoTabela.add(PRODUTO);
		}
//		if (chkFatorial.selectedProperty().getValue() || tudoDescritiva) {
//			System.out.println("chkFatorial: " + chkFatorial.selectedProperty().getValue());
//			resultadoTabela FATORIAL = new resultadoTabela("FATORIAL", amostra.getResultadoFATORIAL());
//			listResultadoTabela.add(FATORIAL);
//		}
		if (chkSomaQuadrados.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkSomaQuadrados: " + chkSomaQuadrados.selectedProperty().getValue());
			resultadoTabela SOMA_DOS_QUADRADOS = new resultadoTabela("SOMA_DOS_QUADRADOS",
					amostra.getResultadoSOMA_DOS_QUADRADOS());
			listResultadoTabela.add(SOMA_DOS_QUADRADOS);
		}
		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("nomeFuncionalidade"));
		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
		tableResultado.setItems(listResultadoTabela);
	}

	// Ajuda
	/****
	 * btnAjudaSomat
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaSomat(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 1;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaQuadradoDaSoma
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaQuadradoDaSoma(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 2;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaSomaDeProdutos
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaSomaDeProdutos(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 3;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaProdutoDaSomas
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaProdutoDaSomas(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 4;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaMediaAritm
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaMediaAritm(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 5;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaMediaAritmPond
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaMediaAritmPond(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 6;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaModa
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaModa(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 7;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaMediana
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaMediana(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 8;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaVariancia
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaVariancia(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 9;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaDesvioPadrao
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaDesvioPadrao(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 10;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaMediaGeo
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaMediaGeo(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 11;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaMediaHarm
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaMediaHarm(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 12;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaProduto
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaProduto(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 13;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaFatorial
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaFatorial(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 15;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

	/****
	 * btnAjudaSomaDosQuadrados
	 * 
	 * @throws InterruptedException
	 ****/
	@FXML
	private void btnAjudaSomaDosQuadrados(ActionEvent event) throws IOException, InterruptedException {
		botaoSelecionado = 16;
		Parent telaAjuda = FXMLLoader.load(getClass().getResource("/view/ajuda/exibeAjuda.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(telaAjuda));
		stage.show();
	}

}