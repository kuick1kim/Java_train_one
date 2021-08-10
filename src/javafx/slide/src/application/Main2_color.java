package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main2_color extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			primaryStage.setTitle("JavaFX App");

	        ColorPicker colorPicker = new ColorPicker();
	        Slider slider = new Slider(0, 100, 0);
	        

	        Color value = colorPicker.getValue();

	        VBox vBox = new VBox(colorPicker);
	        //HBox hBox = new HBox(button1, button2);
	        Scene scene = new Scene(vBox,140, 150);

	        
	        
	        
	        primaryStage.setTitle("JavaFX App");

	        Slider slider1 = new Slider(0, 100, 0);

	        VBox vBox1 = new VBox(slider1);
	        Scene scene1 = new Scene(vBox1, 960, 600);

	        primaryStage.setScene(scene);
	        primaryStage.show();
	        primaryStage.show();
	        primaryStage.setScene(scene1);
	        primaryStage.show();
	        
	        
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
