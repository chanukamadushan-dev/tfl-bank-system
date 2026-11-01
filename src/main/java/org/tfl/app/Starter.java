package org.tfl.app;

import javafx.application.Application;
import javafx.stage.Stage;
import scene.SceneManager;

public class Starter extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        SceneManager.setStage(stage);
        SceneManager.switchPage("/view/main_dashboard.fxml");


    }

    public static void main(String[] args) {
        launch();
    }
}
