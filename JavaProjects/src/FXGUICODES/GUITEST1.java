package FXGUICODES;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
		BorderPane rootPane = new BorderPane();
		Scene scene = new Scene(rootPane,800,400);
		
		
		MenuBar menubar = new MenuBar(); //creating MenuBar  
		Menu MenuName1 = new Menu("File"); //creating Menu  
		Menu MenuName2 = new Menu("Edit"); //creating Menu  
		MenuItem MenuItem1 = new MenuItem("New"); //creating Menu Item 
		MenuName1.getItems().addAll(MenuItem1,new MenuItem("Save")); //adding Menu Item to the Menu  
		menubar.getMenus().addAll(MenuName1,MenuName2); //adding Menu to the MenuBar 
		rootPane.setTop(menubar);
		
		//VBox root1 = new VBox(menubar);
		//root1.setMinSize(800, 20);
		//root1.getChildren().add(menubar);

		/*GridPane root2=new GridPane();
		Button btn1=new Button("button 1"); 
		//root2.getChildren().add(btn1);
		Button btn2=new Button("button 2"); 
		//root2.getChildren().add(btn2);
		Button btn3=new Button("button 3"); 
		//root2.getChildren().add(btn3);
		//root2.addRow(0, btn1,btn2,btn3);
		root2.add(btn1, 0, 0, 1, 1);;
		root2.add(btn2, 3, 3, 1, 1);;
		root2.setHgap(20);
		root2.setVgap(20);
		root2.setAlignment(Pos.TOP_LEFT);*/
		Button btn1=new Button("button 1");
		rootPane.setCenter(btn1);
		Button btn2=new Button("button 2"); 
		rootPane.setLeft(btn2);
		Button btn3=new Button("button 3"); 
		rootPane.setRight(btn3);


		
		
		
		
		//rootPane.getChildren().addAll(root1,root2);
		primaryStage.setTitle("My First JavaFX App");
		primaryStage.setScene(scene);
        primaryStage.show();
	}

}
