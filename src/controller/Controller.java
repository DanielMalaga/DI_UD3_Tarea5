package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent; // no se usa finalmente.
import javafx.fxml.FXML;
import javafx.fxml.Initializable; // para poder inicializar el controller.
import javafx.scene.control.Button; // para poder usar el botón tipo Button
import javafx.scene.control.Label; // para poder usar la etiqueta tipo Label
import javafx.scene.input.KeyEvent; // para gestionar eventos solo de teclado
import javafx.scene.input.MouseEvent; // para gestionar eventos solo de ratón
import javafx.scene.layout.VBox; // para gestionar el elemento (no se ha usado)
import javafx.scene.paint.Color; // para cambiar color de texto en botón

public class Controller implements Initializable {

	@FXML
	private Button boton;
	private VBox contenedor;
	public Label label;

	/*manejador general
	public void handleButtonAction(ActionEvent event) {
		label.setText("Hola");
	}*/

	// manejadores de eventos de ratón
	public void onMouseEntered(MouseEvent mouseEvent) {
		boton.setTextFill(Color.RED);
	}

	public void onMouseClicked(MouseEvent mouseEvent) {

		label.setText("Hola (pulsado por ratón)");
	}

	public void onMouseExited(MouseEvent mouseEvent) {
		boton.setTextFill(Color.BLACK);
	}

	// manejadores evento de tecla
	public void onKeyPressed(KeyEvent keyEvent) {
		label.setText("Hola (pulsado por tecla)");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// boton.setOnAction(this::handleButtonAction);

		boton.setOnMouseEntered(this::onMouseEntered);
		boton.setOnMouseExited(this::onMouseExited);
		boton.setOnMouseClicked(this::onMouseClicked);
		boton.setOnKeyPressed(this::onKeyPressed);

	}

}
