package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_progress extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 primaryStage.setTitle("JavaFX App");

		        DirectoryChooser directoryChooser = new DirectoryChooser();
		        directoryChooser.setInitialDirectory(new File("src"));

		        Button button = new Button("Select Directory");
		        button.setOnAction(e -> {
		            File selectedDirectory = directoryChooser.showDialog(primaryStage);

		            System.out.println(selectedDirectory.getAbsolutePath());
		        });


		        VBox vBox = new VBox(button);
		        //HBox hBox = new HBox(button1, button2);
		        Scene scene = new Scene(vBox, 960, 600);

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
