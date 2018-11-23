package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author 21746033
 * @version 1.0
 * @see LayoutsController
 *
 */
public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader layouts = new FXMLLoader();
			layouts.setLocation(MainApp.class.getResource("Layouts.fxml"));
			AnchorPane aLayouts = (AnchorPane) layouts.load();
			
			Scene scene = new Scene(aLayouts);
			primaryStage.setScene(scene);
			
			LayoutsController controller = layouts.getController();
			controller.setMainApp(this);
			
			primaryStage.setTitle("Layouts");
			primaryStage.getIcons().add(new Image("file:resources/images/ccheart.png"));
			
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}