package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Controller implements Initializable {

	@FXML
	private Button boton;

	public void handleButtonAction(ActionEvent event) {
		System.out.println("Botón pulsado");

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		boton.setOnAction(this::handleButtonAction);

	}

}
