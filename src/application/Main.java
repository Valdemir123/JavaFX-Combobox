package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage _stage) {
		try {
			
			Parent _par = FXMLLoader.load(getClass().getResource("/Gui/View.fxml"));
			Scene _scene = new Scene(_par);
			_stage.setScene(_scene);
			_stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
