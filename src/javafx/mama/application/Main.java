package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
	//			BorderPane root = new BorderPane();
	//			Scene scene = new Scene(root,400,400);
	//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	//			primaryStage.setScene(scene);
	//			primaryStage.show();
				primaryStage.setTitle("Button Experiment 1");
				
				DatePicker datePicker = new DatePicker();
	
		        HBox hbox = new HBox(datePicker);
	
		        Scene scene = new Scene(hbox, 200, 100);
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

	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			primaryStage.setTitle("Button Experiment 1");
			
			DatePicker datePicker = new DatePicker();

	        HBox hbox = new HBox(datePicker);

	        Scene scene = new Scene(hbox, 200, 100);
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
