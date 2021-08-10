package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_file_choice extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX App");

	        FileChooser fileChooser = new FileChooser();

	        Button button = new Button("Select File");
	        button.setOnAction(e -> {
	            File selectedFile = fileChooser.showOpenDialog(primaryStage);
	        });

	        VBox vBox = new VBox(button);
	        Scene scene = new Scene(vBox, 400, 200);

	        primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
