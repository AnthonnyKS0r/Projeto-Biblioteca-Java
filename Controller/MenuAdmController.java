package com.example.projeto_library;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuAdmController implements Initializable {

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

    @FXML
    private Label mensagem;

    private Stage stage;

    private Scene scene;

    private Parent root;

    AdmsDaoImpl admsDao = AdmsDaoImpl.getInstance();


    public void acervo_atualizar(ActionEvent event) throws IOException
    {
        //Mesmo processo ja citado acima
        Parent root = FXMLLoader.load((getClass().getResource("acervo_atualizar.fxml")));
        area_trabalho.getChildren().removeAll();
        area_trabalho.getChildren().setAll(root);
    }
    public void adcionar_material(ActionEvent event) throws IOException
    {
        //Mesmo processo ja citado acima
        Parent root = FXMLLoader.load((getClass().getResource("adcionar_material_escolher.fxml")));
        area_trabalho.getChildren().removeAll();
        area_trabalho.getChildren().setAll(root);
    }

    public void enviar_mensagem(ActionEvent event)throws IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("escrever_notificacao.fxml")));
        area_trabalho.getChildren().removeAll();
        area_trabalho.getChildren().setAll(root);
    }

    public void configs(ActionEvent event)throws  IOException
    {
        Parent root = FXMLLoader.load((getClass().getResource("configs_adm.fxml")));
        area_trabalho.getChildren().removeAll();
        area_trabalho.getChildren().setAll(root);
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mensagem.setText("Seja Bem-Vindo ao Nosso App: "+admsDao.getAdm(admsDao.getIndex()).getNome()+"!");
    }
}
