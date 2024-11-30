package t1;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class T1 extends Application{
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a number: ");
		int a = s.nextInt();
		System.out.println(" Enter another number: ");
		int b = s.nextInt();
		int c = a + b;
		System.out.printf("the sum is: %d", c);
		launch(args);
	}
	
@Override
public void start(Stage s) throws Exception {
	Button b = new Button("Click");
	Label i = new Label("hi");
	GridPane g = new GridPane(3, 3);
	g.add(b, 0, 0);
	g.add(i, 1, 0);
	Scene sc = new Scene(g);
	s.setScene(sc);
	s.show();	
}

}
