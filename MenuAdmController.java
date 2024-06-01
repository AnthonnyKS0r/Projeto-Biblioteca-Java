package com.example.projeto_library;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuAdmController {

    @FXML
    StackPane area_trabalho;

    @FXML
    private JFXButton botao_add;

    @FXML
    private JFXButton botao_configs;

    @FXML
    private JFXButton botao_mensagem;

    @FXML
    private JFXButton botao_update;


    public void acervo_atualizar(ActionEvent event) throws IOException
    {
        //Mesmo processo ja citado acima
        Parent root = FXMLLoader.load((getClass().getResource("acervo_atualizar.fxml")));
        area_trabalho.getChildren().removeAll();
        area_trabalho.getChildren().setAll(root);
    }
}
