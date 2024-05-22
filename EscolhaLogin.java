package com.example.projeto_library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class EscolhaLogin extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(EscolhaLogin.class.getResource("escolha_login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            //Implementado arquivo css

            String css = this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);

            stage.setTitle("FirePages");
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}

