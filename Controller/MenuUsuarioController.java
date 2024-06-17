package Controller;

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

public class MenuUsuarioController implements Initializable {

    @FXML
    StackPane area_conteudo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try
        {
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

}