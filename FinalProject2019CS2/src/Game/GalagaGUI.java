package Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;







public class GalagaGUI extends Application {

	Button button;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		
		stage.setTitle("Galaga");
		button = new Button("Start Here");
		
		
		StackPane Backdrop = new StackPane();
		Backdrop.getChildren().add(button);
		
		
		Scene scene = new Scene (Backdrop, 400,400);
		
		stage.setScene(scene);
		
		stage.show();
		
		
		
	}

}
