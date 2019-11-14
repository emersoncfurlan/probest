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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
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
	private TableColumn<?, ?> classesCol;

	@FXML
	private TableColumn<?, ?> freqAbsCol;

	@FXML
	private TableColumn<?, ?> freqRelCol;

	@FXML
	private TableColumn<?, ?> freqAcumuladaCol;

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
	private TableView<Funcionalidade> tableResultado;

	@FXML
	private TextArea txtAreaAmostra;

	@FXML
	private Color x2212;

	@FXML
	private Font x2312;

	@FXML
	private TableView<?> tableClasses;

	@FXML
	private Color x221;

	@FXML
	private Font x231;

	@FXML
	private BarChart<?, ?> graficoDeBarras;

	@FXML
	private Color x2211;

	@FXML
	private Font x2311;

	@FXML
	private LineChart<?, ?> graficoDeLinhas;

	@FXML
	private TableColumn<?, ?> funcionalidadeCol;

	@FXML
	private TableColumn<?, ?> resultadoCol;

	@FXML
	void initialize() {
		assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x2 != null : "fx:id=\"x2\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert txtAmostra != null : "fx:id=\"txtAmostra\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x12 != null : "fx:id=\"x12\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x24 != null : "fx:id=\"x24\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert txtPeso != null : "fx:id=\"txtPeso\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert btnInserir != null : "fx:id=\"btnInserir\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert btnCarregar != null : "fx:id=\"btnCarregar\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x11 != null : "fx:id=\"x11\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x21 != null : "fx:id=\"x21\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkTudoDescritiva != null : "fx:id=\"chkTudoDescritiva\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMedia != null : "fx:id=\"chkMedia\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMediaAritmetica != null : "fx:id=\"chkMediaAritmetica\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMediaAritmeticaPonderada != null : "fx:id=\"chkMediaAritmeticaPonderada\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMediaHarm != null : "fx:id=\"chkMediaHarm\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMediaGeo != null : "fx:id=\"chkMediaGeo\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkSomat != null : "fx:id=\"chkSomat\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkModa != null : "fx:id=\"chkModa\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkMediana != null : "fx:id=\"chkMediana\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkVariancia != null : "fx:id=\"chkVariancia\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkDesvioPadrao != null : "fx:id=\"chkDesvioPadrao\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkProbabilidade != null : "fx:id=\"chkProbabilidade\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert chkFatorial != null : "fx:id=\"chkFatorial\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert lblAmostra != null : "fx:id=\"lblAmostra\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x222 != null : "fx:id=\"x222\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x232 != null : "fx:id=\"x232\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x22 != null : "fx:id=\"x22\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x23 != null : "fx:id=\"x23\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert tableResultado != null : "fx:id=\"tableResultado\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert funcionalidadeCol != null : "fx:id=\"funcionalidadeCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert resultadoCol != null : "fx:id=\"resultadoCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert txtAreaAmostra != null : "fx:id=\"txtAreaAmostra\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x2212 != null : "fx:id=\"x2212\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x2312 != null : "fx:id=\"x2312\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert tableClasses != null : "fx:id=\"tableClasses\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert classesCol != null : "fx:id=\"classesCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert freqAbsCol != null : "fx:id=\"freqAbsCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert freqRelCol != null : "fx:id=\"freqRelCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert freqAcumuladaCol != null : "fx:id=\"freqAcumuladaCol\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x221 != null : "fx:id=\"x221\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x231 != null : "fx:id=\"x231\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert graficoDeBarras != null : "fx:id=\"graficoDeBarras\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x2211 != null : "fx:id=\"x2211\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert x2311 != null : "fx:id=\"x2311\" was not injected: check your FXML file 'dashboard.fxml'.";
		assert graficoDeLinhas != null : "fx:id=\"graficoDeLinhas\" was not injected: check your FXML file 'dashboard.fxml'.";

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

	public static Amostra txtDados(String[] conteudo) {
		ArrayList<Double> dados = new ArrayList<Double>();
		for (int i = 1; i < conteudo.length; i++) {
			dados.add(Double.parseDouble(conteudo[i]));
		}
		Amostra novaAmostra = new Amostra(conteudo[0], dados);
		return novaAmostra;
	}

	@FXML
	void txtAreaAmostra(ActionEvent event) {

	}

	/**** btnInserir - Inserir amostra ****/
	@FXML
	private void btnInserir(ActionEvent event) throws IOException {
		System.out.println("btnIserir click:" + txtAmostra.getText());
		String[] conteudo = txtAmostra.getText().split(";");
		amostra = txtDados(conteudo);
		System.out.println("Amostra do txtAmostra: " + amostra.toString());
		setTextAreaAmostra(amostra.toString());
	};

	private void setTextAreaAmostra(String conteudo) {
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
	private void setTableResultado(ObservableList<?> funcionalidadeAmostra) {
		funcionalidadeCol.setCellValueFactory(new PropertyValueFactory<>("funcionalidade"));
		resultadoCol.setCellValueFactory(new PropertyValueFactory<>("resultado"));
		tableResultado.setItems((ObservableList<Funcionalidade>) listaResultados());
	}

	//
	private ObservableList<?> listaResultados() {
		Funcionalidade somatorio = null;
		return FXCollections.observableArrayList(new Funcionalidade("Somatório", Funcionalidade.somatorio(amostra.getDados()))
				);
	}

	//
	/**** Filtros com checkbox para preenchimento das tabelas ****/
	private ObservableList<?> checkBox = FXCollections.observableArrayList();

	public void checkListTableResultados() {
//		Double[] dados = new Double[amostra.getDados().size()];
//		dados = amostra.getDados().toArray(dados);
		boolean tudoDescritiva = false;
		if (chkTudoDescritiva.selectedProperty().getValue()) {
			System.out.println("chkTudoDescritiva: " + chkTudoDescritiva.selectedProperty().getValue());
			tudoDescritiva = true;
		}
		if (chkSomat.selectedProperty().getValue() || tudoDescritiva || tudoDescritiva) {
			System.out.println("chkSomat: " + chkSomat.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("SOMATORIO", Funcionalidade.somatorio(dados);	
		}
//    	if(chkQuadradoSoma.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkQuadradoSoma: "+ chkQuadradoSoma.selectedProperty().getValue() );
//    		funcionalidadeAmostra.add("QUADRADO_DA_SOMA", Funcionalidade.quadradoDaSoma(dados);	
//    	}
//    	if(chkSomaProdutos.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkSomaProdutos: "+ chkSomaProdutos.selectedProperty().getValue() );
//    		funcionalidadeAmostra.add("SOMA_DE_PRODUTOS", Funcionalidade.somadeprodutos(amostra, amostra2);	
//    	}
//    	if(chkProdutoSoma.selectedProperty().getValue() || tudoDescritiva) {
//    		System.out.println("chkProdutoSoma: "+ chkProdutoSoma.selectedProperty().getValue() );
//   		funcionalidadeAmostra.add("PRODUTO_DAS_SOMAS", Funcionalidade.produtoDasSomas(amostra, amostra2);	
//    	}
		if (chkMediaAritmetica.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaAritmetica: " + chkMediaAritmetica.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MEDIA_ARITMETICA_SIMPLES", Funcionalidade.mediaAritmeticaSimples(dados);	
		}
		if (chkMediaAritmeticaPonderada.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println(
					"chkMediaAritmeticaPonderada: " + chkMediaAritmeticaPonderada.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MEDIA_ARITMETICA_PONDERADA", Funcionalidade.mediaAritmeticaPonderada(amostra, pesos);	
		}
		if (chkModa.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkModa: " + chkModa.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MODA", Funcionalidade.moda(dados);	
		}
		if (chkMediana.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediana: " + chkMediana.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MEDIANA", Funcionalidade.mediana(dados);	
		}
		if (chkVariancia.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkVariancia: " + chkVariancia.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("VARIANCIA", Funcionalidade.variancia(dados);	
		}
		if (chkDesvioPadrao.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkDesvioPadrao: " + chkDesvioPadrao.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("DESVIO_PADRAO", Funcionalidade.desvioPadrao(dados);	
		}
		if (chkMediaGeo.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaGeo: " + chkMediaGeo.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MEDIA_GEOMETRICA", Funcionalidade.mediaGeometrica(dados);	
		}
		if (chkMediaHarm.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkMediaHarm: " + chkMediaHarm.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("MEDIA_HARMONICA", Funcionalidade.mediaHarmonica(dados);	
		}
//    	if(chkProduto.selectedProperty().getValue() || tudoDescritiva) {
//    	System.out.println("chkProduto: "+ chkProduto.selectedProperty().getValue() );
//    		funcionalidadeAmostra.add("PRODUTO", Funcionalidade.produto(dados);	
//    	}
		if (chkProbabilidade.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkProbabilidade: " + chkProbabilidade.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("PROBABILIDADE", Funcionalidade.probabilidade(amostra, possibilidade);	
		}
		if (chkFatorial.selectedProperty().getValue() || tudoDescritiva) {
			System.out.println("chkFatorial: " + chkFatorial.selectedProperty().getValue());
//    		funcionalidadeAmostra.add("FATORIAL", Funcionalidade.fatorial(dados);	
		}
//    	if(chkSomaQuadrados.selectedProperty().getValue() || tudoDescritiva) {
//			System.out.println("chkSomaQuadrados: "+ chkSomaQuadrados.selectedProperty().getValue() );
//    		funcionalidadeAmostra.add("SOMA_DOS_QUADRADOS", Funcionalidade.somatorio(dados);	
//    	}
	}

}
