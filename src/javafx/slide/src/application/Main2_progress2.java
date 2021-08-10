package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_progress2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
			
			primaryStage.setTitle("JavaFX App");

	        ProgressBar progressBar = new ProgressBar(0);
	        
	        for(float i=0 ; i<=100; i+=1) {
	        	progressBar.setProgress(i);
	        	delay
	        }
	        VBox vBox = new VBox(progressBar);
	        Scene scene = new Scene(vBox, 300, 50);

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
