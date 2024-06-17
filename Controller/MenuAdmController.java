package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

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
}
