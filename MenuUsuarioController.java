package com.example.projeto_library;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuUsuarioController implements Initializable {

    @FXML
    StackPane area_conteudo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("acervo_usuario.fxml"));
            area_conteudo.getChildren().removeAll();
            area_conteudo.getChildren().setAll(root);

        } catch (IOException e) {
            Logger.getLogger(ModuleLayer.Controller.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    public void acervo_usuario(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("acervo_usuario.fxml")));
        area_conteudo.getChildren().removeAll();
        area_conteudo.getChildren().setAll(root);
    }

    public void pedir_usuario(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("pedir_usuario.fxml")));
        area_conteudo.getChildren().removeAll();
        area_conteudo.getChildren().setAll(root);
    }

    public void notifications_usuarios(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("notifications_usuarios.fxml")));
        area_conteudo.getChildren().removeAll();
        area_conteudo.getChildren().setAll(root);
    }

}