package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_text_area extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("TextArea Experiment 1");

	        TextArea textArea = new TextArea();

	        Button button = new Button("Click to get text");
	        button.setMinWidth(50);

	        button.setOnAction(action -> {
	            System.out.println(textArea.getText());

	            textArea.setText("Clicked!");
	        });

	        VBox vbox = new VBox(textArea, button);

	        Scene scene = new Scene(vbox, 200, 100);
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
