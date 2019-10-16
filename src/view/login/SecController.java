package view.login;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecController implements Initializable {

	@FXML
	Circle pro;
	@FXML
	Circle min;
	@FXML
	Circle close;
	private double xOffset = 0;
	private double yOffset = 0;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		Image image = new Image(getClass().getResource("pic.jpg").toExternalForm());
		pro.setFill(new ImagePattern(image));
	}

	/**** troca de tela *****/
	@FXML
	public void login(MouseEvent event) throws IOException {
		Parent telaLogin = FXMLLoader.load(getClass().getResource("profile.fxml"));

		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		telaLogin.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});

		///////////////////////////
		telaLogin.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				appStage.setX(event.getScreenX() - xOffset);
				appStage.setY(event.getScreenY() - yOffset);
			}
		});

		Scene scene = new Scene(telaLogin);

		appStage.setScene(scene);
		appStage.show();

	}

	/**** minimiza tela ****/
	@FXML
	public void minimizar(MouseEvent event) throws IOException {

		((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);

	}

	/**** fecha tela ****/
	@FXML
	public void fechar(MouseEvent event) throws IOException {

		System.exit(0);

	}
}
