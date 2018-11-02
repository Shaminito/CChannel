package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LayoutsController {

	MainApp mainapp;
	
	@FXML
	Button btnDie;
	@FXML
	Button btnLive;
	
	public void setMainApp(MainApp mainapp) {
		this.mainapp = mainapp;
	}
	
	@FXML
	private void c_btnDie() {
		System.exit(0);
	}
	
	@FXML
	private void c_btnLive() {
		
	}
}