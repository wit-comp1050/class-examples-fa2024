package myProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyClass extends Application {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//BorderPane root = new BorderPane();
		Scene scene = new Scene(new Pane());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
