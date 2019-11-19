package controller.menu;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pane root = FXMLLoader.load(getClass().getResource("/controller/menu/dashboard.fxml"));
		Scene scene = new Scene(root, 1600, 960);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
