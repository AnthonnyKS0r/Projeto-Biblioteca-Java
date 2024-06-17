package com.example.projeto_library;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuUsuarioController implements Initializable {

    private Stage stage;

    private Scene scene;

    private Parent root;


    @FXML
    StackPane area_conteudo;

    @FXML
    private Label mensagem;

    UsuarioDaoImp usuarioDaoImp = UsuarioDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try
        {

            mensagem.setText("Seja Bem-Vindo ao Nosso App: "+usuarioDaoImp.getUsuario(usuarioDaoImp.getIndex()).getNome()+"!");
            //Pega a tela que deseja carregar
            Parent root = FXMLLoader.load(getClass().getResource("acervo_usuario.fxml"));
            //Limpa o StackPane de qaulquer conteudo atualmente
            area_conteudo.getChildren().removeAll();
            //Adciona a Nova tela ao Stackpane
            area_conteudo.getChildren().setAll(root);

        } catch (IOException e) {
            Logger.getLogger(ModuleLayer.Controller.class.getName()).log(Level.SEVERE,null,e);
        }
    }
//Basicamente repete o código so mudando os parâmetros
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

    public void configs_usuarios(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("configs.fxml")));
        area_conteudo.getChildren().removeAll();
        area_conteudo.getChildren().setAll(root);
    }

    public void sair(ActionEvent event)throws  IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("escolha_login.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
