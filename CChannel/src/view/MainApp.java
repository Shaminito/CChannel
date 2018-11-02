package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader layouts = new FXMLLoader();
			layouts.setLocation(MainApp.class.getResource("Layouts.fxml"));
			AnchorPane bpLayouts = (AnchorPane) layouts.load();
			
			Scene scene = new Scene(bpLayouts);
			primaryStage.setScene(scene);
			
			LayoutsController controller = layouts.getController();
			controller.setMainApp(this);
			
			primaryStage.setTitle("Layouts");
			primaryStage.getIcons().add(new Image("file:resources/images/ccheart.png"));
			
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
