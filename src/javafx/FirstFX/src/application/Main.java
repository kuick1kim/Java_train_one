package application;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			VBox root = new VBox();
			root.setPrefWidth(550);
			root.setPrefHeight(100);
			root.setAlignment(Pos.CENTER);
			
			Label label = new Label();
			label.setText("Hello, JavaFX 김민상이다");
			label.setFont(new Font(50));
			
			Button button = new Button();
			button.setText("확인");
			button.setOnAction(event->Platform.exit());
			
			root.getChildren().add(label);
			root.getChildren().add(button);
			
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("AppMain");
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
