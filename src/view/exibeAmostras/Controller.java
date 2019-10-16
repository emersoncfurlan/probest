package view.exibeAmostras;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	private double xOffset = 0;
	private double yOffset = 0;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle close;

    @FXML
    private Circle min;

    @FXML
    private Label tituloTela;

    @FXML
    private TableView<?> tableAmostras;

    @FXML
    private ScrollBar scrollVertical;

    @FXML
    private ScrollBar scrollHorizontal;

    @FXML
    private Label inserirAmostra;

    @FXML
    private Label alterarAmostra;

    @FXML
    private Label excluirAmostra;

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
        assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert tituloTela != null : "fx:id=\"tituloTela\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert tableAmostras != null : "fx:id=\"tableAmostras\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert scrollVertical != null : "fx:id=\"scrollVertical\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert scrollHorizontal != null : "fx:id=\"scrollHorizontal\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert inserirAmostra != null : "fx:id=\"inserirAmostra\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert alterarAmostra != null : "fx:id=\"alterarAmostra\" was not injected: check your FXML file 'exibeAmostras.fxml'.";
        assert excluirAmostra != null : "fx:id=\"excluirAmostra\" was not injected: check your FXML file 'exibeAmostras.fxml'.";

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Ao iniciar deverá carregar todos os registros da tabela
	}
	
}
