package view.exibeAjuda;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private TextArea txtAreaConteudoAjuda;

	/**** minimize ****/
	@FXML
	public void minclick(MouseEvent event) throws IOException {
		((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);
	}

	/**** close screen ****/
	@FXML
	public void closeclick(MouseEvent event) throws IOException {
		System.exit(0);
	}

    @FXML
    void initialize() {
        assert labelVoltar != null : "fx:id=\"labelVoltar\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert labelAjuda != null : "fx:id=\"labelAjuda\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert txtDescricaoCurta != null : "fx:id=\"txtDescricaoCurta\" was not injected: check your FXML file 'exibeAjuda.fxml'.";
        assert txtAreaConteudoAjuda != null : "fx:id=\"txtAreaConteudoAjuda\" was not injected: check your FXML file 'exibeAjuda.fxml'.";

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}

