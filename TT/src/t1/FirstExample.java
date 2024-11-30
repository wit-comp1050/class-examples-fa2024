package t1;

import javafx.application.Application;
import javafx.stage.Stage;

	public class FirstExample extends Application {
		
		@Override
		public void start (Stage s) {
			s.setWidth(800);
			s.setHeight(600);
			s.show();
			
			Stage s2 = new Stage();
			s2.setWidth(200);
			s2.setHeight(400);
			s2.show();
		}
	
	public static void main(String[] args ) {
		launch(args);
	}
}



