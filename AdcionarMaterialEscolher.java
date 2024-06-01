package com.example.projeto_library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdcionarMaterialEscolher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("adcionar_material_escolher.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
}
