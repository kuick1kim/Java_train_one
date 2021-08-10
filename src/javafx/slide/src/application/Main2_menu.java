package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main2_menu extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX App");

	        MenuBar menuBar = new MenuBar();
	        
	        
	        Menu menu = new Menu("Menu 1");
	        
	        MenuItem menuItem1 = new MenuItem("Item 1");
	        MenuItem menuItem2 = new MenuItem("Item 2");
	        MenuItem menuItem3 = new MenuItem("Item 3");
	        MenuItem menuItem4 = new MenuItem("Item 4");


	        menu.getItems().add(menuItem1);
	        menu.getItems().add(menuItem2);
	        menu.getItems().add(menuItem3);
	        menu.getItems().add(menuItem4);
	        
	        Menu menu1 = new Menu("Menu 2");
	        
	        MenuItem menuItem5 = new MenuItem("Item 1");
	        MenuItem menuItem6 = new MenuItem("Item 2");
	        MenuItem menuItem7 = new MenuItem("Item 3");
	        MenuItem menuItem8 = new MenuItem("Item 4");


	        menu.getItems().add(menuItem5);
	        menu.getItems().add(menuItem6);
	        menu.getItems().add(menuItem7);
	        menu.getItems().add(menuItem8);
	        
	        menuBar.getMenus().add(menu);
	        
	        VBox vBox = new VBox(menuBar);

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
