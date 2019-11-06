package controller.menu;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
	private final Desktop desktop = Desktop.getDesktop();

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="close"
	private Circle close; // Value injected by FXMLLoader

	@FXML // fx:id="min"
	private Circle min; // Value injected by FXMLLoader

	@FXML // fx:id="x1"
	private Font x1; // Value injected by FXMLLoader

	@FXML // fx:id="x2"
	private Color x2; // Value injected by FXMLLoader

	@FXML // fx:id="x11"
	private Font x11; // Value injected by FXMLLoader

	@FXML // fx:id="x21"
	private Color x21; // Value injected by FXMLLoader

	@FXML // fx:id="chkTudoDescritiva"
	private CheckBox chkTudoDescritiva; // Value injected by FXMLLoader

	@FXML // fx:id="chkMedia"
	private CheckBox chkMedia; // Value injected by FXMLLoader

	@FXML // fx:id="chkMediaAritmetica"
	private CheckBox chkMediaAritmetica; // Value injected by FXMLLoader

	@FXML // fx:id="chkMediaAritmeticaPonderada"
	private CheckBox chkMediaAritmeticaPonderada; // Value injected by FXMLLoader

	@FXML // fx:id="chkMediaHarm"
	private CheckBox chkMediaHarm; // Value injected by FXMLLoader

	@FXML // fx:id="chkMediaGeo"
	private CheckBox chkMediaGeo; // Value injected by FXMLLoader

	@FXML // fx:id="chkSomat"
	private CheckBox chkSomat; // Value injected by FXMLLoader

	@FXML // fx:id="chkModa"
	private CheckBox chkModa; // Value injected by FXMLLoader

	@FXML // fx:id="chkMediana"
	private CheckBox chkMediana; // Value injected by FXMLLoader

	@FXML // fx:id="chkVariancia"
	private CheckBox chkVariancia; // Value injected by FXMLLoader

	@FXML // fx:id="chkDesvioPadrao"
	private CheckBox chkDesvioPadrao; // Value injected by FXMLLoader

	@FXML // fx:id="chkProbabilidade"
	private CheckBox chkProbabilidade; // Value injected by FXMLLoader

	@FXML // fx:id="chkFatorial"
	private CheckBox chkFatorial; // Value injected by FXMLLoader

	@FXML // fx:id="x222"
	private Color x222; // Value injected by FXMLLoader

	@FXML // fx:id="x232"
	private Font x232; // Value injected by FXMLLoader

	@FXML // fx:id="x22"
	private Color x22; // Value injected by FXMLLoader

	@FXML // fx:id="x23"
	private Font x23; // Value injected by FXMLLoader

	@FXML // fx:id="x2212"
	private Color x2212; // Value injected by FXMLLoader

	@FXML // fx:id="x2312"
	private Font x2312; // Value injected by FXMLLoader

	@FXML // fx:id="tableClasses"
	private TableView<?> tableClasses; // Value injected by FXMLLoader

	@FXML // fx:id="x221"
	private Color x221; // Value injected by FXMLLoader

	@FXML // fx:id="x231"
	private Font x231; // Value injected by FXMLLoader

	@FXML // fx:id="graficoDeBarras"
	private BarChart<?, ?> graficoDeBarras; // Value injected by FXMLLoader

	@FXML // fx:id="x2211"
	private Color x2211; // Value injected by FXMLLoader

	@FXML // fx:id="x2311"
	private Font x2311; // Value injected by FXMLLoader

	@FXML // fx:id="graficoDeLinhas"
	private LineChart<?, ?> graficoDeLinhas; // Value injected by FXMLLoader

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
			openFile(arquivoSelecionado);
			leitor(arquivoSelecionado.getAbsolutePath());
		} else {
			System.out.println("Nenhum arquivo foi selecionado");
		}
		System.out.println("Arquivo selecionado:\n" + url);
	}

	private void openFile(File arquivo) {
		try {
			desktop.open(arquivo);
		} catch (Exception e) {
			System.err.println("Erro na abertura do arquivo...");
		}
	}

	//// leitor de linhas do arquivo carregado
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
		System.out.println("Amostra carregada:" + amostra.toString());
	}

	public static Amostra txtDados(String[] conteudo) {
		ArrayList<Double> dados = new ArrayList<Double>();
		for (int i = 1; i < conteudo.length; i++) {
			dados.add(Double.parseDouble(conteudo[i]));
		}
		Amostra novaAmostra = new Amostra(conteudo[0], dados);
		return novaAmostra;
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	////
	/**** inserir amostra ****/
	@FXML
	private void btnInserir(ActionEvent event) throws IOException {
		System.out.println("btnIserir click");
		System.out.println("Amostra do txtAmostra: " + txtAmostra.getText());
		String[] conteudo = txtAmostra.getText().split(";");
		amostra = txtDados(conteudo);
	};

	/**** campo para inserir amostra ****/
	@FXML
	private TextField txtAmostra;

	/**** minimzar ****/
	@FXML
	public void minclick(MouseEvent event) throws IOException {

		((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);

	}

	/**** fechar janela ****/
	@FXML
	public void closeclick(MouseEvent event) throws IOException {

		System.exit(0);

	}

	//
	/**** exibir resultados na tabela resultado ****/
	@FXML
	private TableView<?> tableAmostra;

	/**** exibir amostra na tabela ****/
	@FXML
	private TableColumn<Amostra, ObservableValue<Double>> colunaDados;

	//
	@FXML
	void initialize() {
		colunaDados.setCellValueFactory(new PropertyValueFactory<>("dados"));
	
	}

	private ObservableList<Amostra> listaDeAmostra() {
		return FXCollections.observableArrayList(
				new Amostra(amostra.getNome(), amostra.getDados())
		);
	}
}