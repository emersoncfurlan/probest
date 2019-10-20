package controller.menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class Controller implements Initializable {

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
    private Color x222;

    @FXML
    private Font x232;

    @FXML
    private Color x22;

    @FXML
    private Font x23;

    @FXML
    private TableView<?> tableResultado;

    @FXML
    private TableColumn<?, ?> tableAmostra;

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
    void closeclick(MouseEvent event) {

    }

    @FXML
    void minclick(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x2 != null : "fx:id=\"x2\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert txtAmostra != null : "fx:id=\"txtAmostra\" was not injected: check your FXML file 'dashboard.fxml'.";
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
        assert x222 != null : "fx:id=\"x222\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x232 != null : "fx:id=\"x232\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x22 != null : "fx:id=\"x22\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x23 != null : "fx:id=\"x23\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert tableResultado != null : "fx:id=\"tableResultado\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert tableAmostra != null : "fx:id=\"tableAmostra\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x2212 != null : "fx:id=\"x2212\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x2312 != null : "fx:id=\"x2312\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert tableClasses != null : "fx:id=\"tableClasses\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x221 != null : "fx:id=\"x221\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x231 != null : "fx:id=\"x231\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert graficoDeBarras != null : "fx:id=\"graficoDeBarras\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x2211 != null : "fx:id=\"x2211\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert x2311 != null : "fx:id=\"x2311\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert graficoDeLinhas != null : "fx:id=\"graficoDeLinhas\" was not injected: check your FXML file 'dashboard.fxml'.";

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
