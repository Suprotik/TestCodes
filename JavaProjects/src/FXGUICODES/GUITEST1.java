package FXGUICODES;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUITEST1 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TilePane rootPane = new TilePane();
		Scene scene = new Scene(rootPane,800,400);
		
		
		MenuBar menubar = new MenuBar(); //creating MenuBar  
		Menu MenuName1 = new Menu("File"); //creating Menu  
		Menu MenuName2 = new Menu("Edit"); //creating Menu  
		MenuItem MenuItem1 = new MenuItem("New"); //creating Menu Item 
		MenuName1.getItems().addAll(MenuItem1,new MenuItem("Save")); //adding Menu Item to the Menu  
		menubar.getMenus().addAll(MenuName1,MenuName2); //adding Menu to the MenuBar 
		VBox root1 = new VBox(menubar);
		root1.setMinSize(800, 20);
		//root1.getChildren().add(menubar);

		GridPane root2=new GridPane();
		Button btn=new Button("This is a button"); 
		root2.getChildren().add(btn);
		
		
		
		rootPane.getChildren().addAll(root1,root2);
		primaryStage.setTitle("My First JavaFX App");
		primaryStage.setScene(scene);
        primaryStage.show();
	}

}
