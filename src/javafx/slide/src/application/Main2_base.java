package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_base extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("My First JavaFX App");

	        PieChart pieChart = new PieChart();

	        PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
	        PieChart.Data slice2 = new PieChart.Data("Phone"  , 67);
	        PieChart.Data slice3 = new PieChart.Data("Tablet" , 365);

	        pieChart.getData().add(slice1);
	        pieChart.getData().add(slice2);
	        pieChart.getData().add(slice3);

	        
	        
	        
	        VBox vbox = new VBox(pieChart); 
	        Scene scene = new Scene(vbox, 400, 400);

	        primaryStage.setScene(scene);
	        primaryStage.setHeight(500);
	        primaryStage.setWidth(500);

	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
