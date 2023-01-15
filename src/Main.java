import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		// cargo la vista.
		Parent root = FXMLLoader.load(getClass().getResource("view/ud3tarea5.fxml")); 
		// añado título al escenario.
		arg0.setTitle("UD3 Tarea5");
		// asocio la escena al escenario y le indico tamaño inicial
		arg0.setScene(new Scene(root,600,400));
		// lo hago visible
		arg0.show();
		
	}
	

	public static void main(String[] args) {
		launch(args);
		

	}

	

}
