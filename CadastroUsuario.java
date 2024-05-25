package com.example.projeto_library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastroUsuario extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastro_usuario.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

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
}
