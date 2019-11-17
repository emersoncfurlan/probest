package controller.menu;

import java.net.URL;
import java.util.ResourceBundle;

import org.omg.CORBA.INITIALIZE;

import javafx.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
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

public class Controller {
	private static Amostra amostra = null;

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
	
	//inicio checkBox
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
	//fim checkBox

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

	@FXML
	private LineChart<?, ?> graficoDeLinhas;
	
	@FXML
	private BarChart<?, ?> graficoDeBarras;

	@FXML
	private CategoryAxis BarChartCategoryAxis;

	@FXML
	private NumberAxis BarChartNumberAxis;
	
	//table classes

	@FXML
	private TableView<resultadoTabela> tableClasses;

	@FXML
	private TableColumn<?, ?> classesCol;

	@FXML
	private TableColumn<?, ?> freqAbsCol;

	@FXML
	private TableColumn<?, ?> freqRelCol;

	@FXML
	private TableColumn<?, ?> freqAcumuladaCol;
	
	//table resultados
	@FXML
	private TableView<resultadoTabela> tableResultado;
	
	@FXML
	private TableColumn<resultadoTabela, SimpleStringProperty> funcionalidadeCol;

	@FXML
	private TableColumn<resultadoTabela, SimpleDoubleProperty> resultadoCol;

	@FXML
	void initialize() {
//		// inicializa a tabela de funcionalidade/resultado
//		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("funcionalidade"));
//		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
//		tableResultado.setItems((ObservableList<resultadoTabela>) listaResultados());
//
//		// incializa a tabela classes
//		classesCol.setCellValueFactory(new PropertyValueFactory<>("classes"));
//		freqAbsCol.setCellValueFactory(new PropertyValueFactory<>("frequenciaAbsoluta"));
//		freqAcumuladaCol.setCellValueFactory(new PropertyValueFactory<>("frequenciaAcumulada"));
//		freqRelCol.setCellValueFactory(new PropertyValueFactory<>("frequenciaRelativa"));
//		tableClasses.setItems((ObservableList<resultadoTabela>) listaResultados());
	}

	/**** selecionar arquivo ****/
	@FXML
	public void btnCarregar(ActionEvent event) throws IOException {
		System.out.println("btnCarregar click");
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File(System.getProperty("user.home"))); // defino caminho inicial
		fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("TXT", "*.txt"),
				new FileChooser.ExtensionFilter("CSV", "*.csv"));
		File arquivoSelecionado = fc.showOpenDialog(null);
		String url = null;
		if (arquivoSelecionado != null) {
//			openFile(arquivoSelecionado);
			System.out.println("Endereco do arquivo: " + arquivoSelecionado.getAbsolutePath());
			leitor(arquivoSelecionado.getAbsolutePath());
		} else {
			System.out.println("Nenhum arquivo foi selecionado");
		}
		System.out.println("Arquivo selecionado:\n" + url);
		setTextAreaAmostra(amostra.toString());
	}

	// leitor de linhas do arquivo carregado
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		String[] conteudo = null;
		while (true) {
			if (linha != null) {
				System.out.println(linha);
				conteudo = linha.split(";");
				ArrayList<Double> dados = new ArrayList<Double>();
				amostra = txtDados(conteudo);
				System.out.println("Amostra do txtAmostra: " + amostra.toString());
			} else {
				break;
			}
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void salvarResultados(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		linha = amostra.toString();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	@FXML
	void txtAreaAmostra(ActionEvent event) {

	}

	/**** btnInserir - Inserir amostra ****/
	@FXML
	private void btnInserir(ActionEvent event) throws IOException {
		System.out.println("btnIserir click:" + txtAmostra.getText());
		String[] conteudoDados = txtAmostra.getText().split(";");
		amostra = txtDados(conteudoDados);
		String[] conteudoPesos = txtPeso.getText().split(";");
		Amostra amostraPesos = new Amostra();
		amostraPesos = txtDados(conteudoPesos);
		amostra.setPesos(amostraPesos.getDados());
		amostra.result();
		System.out.println("Amostra do txtAmostra: " + amostra.toString());
		setTextAreaAmostra(amostra.toString());
		listaResultados();

	};

	public static Amostra txtDados(String[] conteudo) {
		ArrayList<Double> dados = new ArrayList<Double>();
		for (int i = 0; i < conteudo.length; i++) {
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
	 * tableResultados - Preenche a tabela de funcionalidades com resultados
	 ****/
//	private void setTableResultado(ObservableList<?> checkBoxList) {
//		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("funcionalidade"));
//		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
//		tableResultado.setItems((ObservableList<resultadoTabela>) listaResultados());
//	}

	private ObservableList<resultadoTabela> listResultadoTabela = FXCollections.observableArrayList();

	private void listaResultados() {
		boolean tudoDescritiva = false;
		if (chkTudoDescritiva.selectedProperty().getValue()) {
			System.out.println("chkTudoDescritiva: " + chkTudoDescritiva.selectedProperty().getValue());
			tudoDescritiva = true;
		}
		if (chkSomat.selectedProperty().getValue()) {
			System.out.println("chkSomat: " + chkSomat.selectedProperty().getValue());
			resultadoTabela somatorio = new resultadoTabela("Somatório", amostra.getResultadoSOMATORIO());
			listResultadoTabela.add(somatorio);
		}
//		if (chkQuadradoSoma.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkQuadradoSoma: "+ chkQuadradoSoma.selectedProperty().getValue() );
//    		checkBoxList.add("QUADRADO_DA_SOMA", Funcionalidade.quadradoDaSoma(dados);
//    		resultadoTabela quadradoDaSoma = new resultadoTabela("QUADRADO_DA_SOMA",
//					amostra.getResultadoQUADRADO_DA_SOMA());
//			listResultadoTabela.add(quadradoDaSoma);
//    	}
//    	if(chkSomaProdutos.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkSomaProdutos: "+ chkSomaProdutos.selectedProperty().getValue() );
//			resultadoTabela somaDeProdutos = new resultadoTabela("Soma de Produtos",
//					amostra.getResultadoSOMA_DE_PRODUTOS()));
//			listResultadoTabela.add(somaDeProdutos);
//    	}
//    	if(chkProdutoSoma.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkProdutoSoma: "+ chkProdutoSoma.selectedProperty().getValue() );
//			resultadoTabela produtoDasSomas = "PRODUTO_DAS_SOMAS",
//					amostra.getResultadoPRODUTO_DAS_SOMAS());
//			listResultadoTabela.add(produtoDasSomas);
//    	}
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
			resultadoTabela moda = new resultadoTabela("MODA",
					amostra.getResultadoMEDIA_ARITMETICA_SIMPLES());
			listResultadoTabela.add(moda);
		}
		if (chkMediana.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediana: " + chkMediana.selectedProperty().getValue());
			resultadoTabela MEDIANA = new resultadoTabela("MEDIANA",
					amostra.getResultadoMEDIANA());
			listResultadoTabela.add(MEDIANA);
		}
		if (chkVariancia.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkVariancia: " + chkVariancia.selectedProperty().getValue());
			resultadoTabela VARIANCIA = new resultadoTabela("VARIANCIA",
		amostra.getResultadoVARIANCIA());
			listResultadoTabela.add(VARIANCIA);
		}
		if (chkDesvioPadrao.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkDesvioPadrao: " + chkDesvioPadrao.selectedProperty().getValue());
			resultadoTabela DESVIO_PADRAO = new resultadoTabela("DESVIO_PADRAO",
					amostra.getResultadoDESVIO_PADRAO());
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
//    	if(chkProduto.selectedProperty().getValue() || tudoDescritiva) {
//    	System.out.println("chkProduto: "+ chkProduto.selectedProperty().getValue() );
//		resultadoTabela PRODUTO = new resultadoTabela("PRODUTO",
//				amostra.getResultadoPRODUTO());
//		listResultadoTabela.add(PRODUTO);
//    	}
		if (chkProbabilidade.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkProbabilidade: " + chkProbabilidade.selectedProperty().getValue());
			resultadoTabela PROBABILIDADE = new resultadoTabela("PROBABILIDADE",
					amostra.getResultadoPROBABILIDADE());
			listResultadoTabela.add(PROBABILIDADE);
		}
		if (chkFatorial.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkFatorial: " + chkFatorial.selectedProperty().getValue());
			resultadoTabela FATORIAL = new resultadoTabela("FATORIAL",
					amostra.getResultadoFATORIAL());
			listResultadoTabela.add(FATORIAL);
		}
//    	if(chkSomaQuadrados.selectedProperty().getValue() || tudoDescritiva) {
//			System.out.println("chkSomaQuadrados: "+ chkSomaQuadrados.selectedProperty().getValue());
//			resultadoTabela SOMA_DOS_QUADRADOS = new resultadoTabela("SOMA_DOS_QUADRADOS",
//					amostra.getResultadoSOMA_DOS_QUADRADOS());
//			listResultadoTabela.add(SOMA_DOS_QUADRADOS);
//    	}
		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("nomeFuncionalidade"));
		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
		tableResultado.setItems(listResultadoTabela);
	}
}
//		resultadoTabela somatorio = new resultadoTabela(new SimpleStringProperty("Somatório"), new SimpleDoubleProperty(amostra.getResultadoSOMATORIO()));
//		listResultadoTabela.add(somatorio);
//		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("nomeFuncionalidade"));
//		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
//		tableResultado.setItems(listResultadoTabela);
