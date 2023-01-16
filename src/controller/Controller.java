package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

	@FXML
	private Button boton;

	public void handleButtonAction(ActionEvent event) {
		System.out.println("Botón pulsado");
	}

	public void onMouseEntered(MouseEvent mouseEvent) {
		System.out.println("entrado ratón en botón");
	}

	public void onMouseExited(MouseEvent mouseEvent) {
		System.out.println("salido ratón de boton");
	}

	public void onKeyPressed(KeyEvent keyEvent) {
		System.out.println("pulsado botón con tecla");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		boton.setOnAction(this::handleButtonAction);

		boton.setOnMouseEntered(this::onMouseEntered);

		boton.setOnMouseExited(this::onMouseExited);

		boton.setOnKeyPressed(this::onKeyPressed);

	}

}
