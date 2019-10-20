package controller.exibeAjuda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;

public class Controller implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane btnVoltar;

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
    private Text txtDescricaoAjuda;

    @FXML
    private Text txtVideo;

    @FXML
    private WebView WebViewVideo;

    @FXML
    void closeclick(MouseEvent event) {

    }

    @FXML
    void minclick(MouseEvent event) {

    }

    @FXML
    void voltar(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert labelVoltar != null : "fx:id=\"labelVoltar\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert labelAjuda != null : "fx:id=\"labelAjuda\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert txtDescricaoCurta != null : "fx:id=\"txtDescricaoCurta\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert txtDescricaoAjuda != null : "fx:id=\"txtDescricaoAjuda\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert txtVideo != null : "fx:id=\"txtVideo\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert WebViewVideo != null : "fx:id=\"WebViewVideo\" was not injected: check your FXML file 'exibeAjuda.fxml'.";

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    WebViewVideo = new WebView();
	    WebViewVideo.getEngine().loadContent(
	      "<video width='320' height='240'controls='controls'>" +
	        "<source src='http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv'/>" + 
	        "Your browser does not support the video tag." + 
	      "</video>");
	}
}
