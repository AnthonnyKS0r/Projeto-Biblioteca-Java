package com.example.projeto_library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class EscolhaLogin_Controller {

    private Stage stage;

    private Scene scene;

    private Parent root;

    // Campo de Inserir Usuário
    @FXML
    TextField usuario;

    @FXML
    Label usuario_incorreto;

    //Campo de Inserir Senha
    @FXML
    PasswordField senha;

    @FXML
    Label senha_incorreta;
    // Método para entrada de usúario para a tela inicial de usuário
    public void login_usuario(ActionEvent event) throws IOException
    {
        usuario_incorreto.setText("");
        senha_incorreta.setText("");
        try
        {
            if(usuario.getText().equals("Paulo")&&senha.getText().equals("1"))
            {
                // Armazena a tle_inicial_usuario como parâmetro que será usado no root
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tela_inicial_usuario.fxml"));

                //Root carrega a tela_inicial_usuario
                root=fxmlLoader.load();

                //Stage passa a ser qualquer stage que esteja sendo apresentando atualmente (acho)
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();

                //Passamos o root para a Scene
                scene=new Scene(root);

                //Carregamos a Scene
                stage.setScene(scene);

                //Carregamos o Stage
                stage.show();
            }
            else if (usuario.getText().equals("Paulo")==false&&senha_incorreta.getText().equals("1")==false)
            {
                usuario_incorreto.setText("Usuário Incorreto");
                senha_incorreta.setText("Senha incorreta");
            }
            else if (usuario.getText().equals("Paulo")==false)
            {
                usuario_incorreto.setText("Usuário Incorreto");
            }
            else if (senha.getText().equals("1")==false)
            {
                senha_incorreta.setText("Senha incorreta");
            }


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void login_adm(ActionEvent event) throws IOException
    {
        usuario_incorreto.setText("");
        senha_incorreta.setText("");
        try
        {
            if(usuario.getText().equals("Paula")&&senha.getText().equals("2"))
            {
                // Armazena a tle_inicial_usuario como parâmetro que será usado no root
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tela_inicial_adm.fxml"));

                //Root carrega a tela_inicial_usuario
                root=fxmlLoader.load();

                //Stage passa a ser qualquer stage que esteja sendo apresentando atualmente (acho)
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();

                //Passamos o root para a Scene
                scene=new Scene(root);

                //Carregamos a Scene
                stage.setScene(scene);

                //Carregamos o Stage
                stage.show();
            }
            else if (usuario.getText().equals("Paula")==false&&senha_incorreta.getText().equals("2")==false)
            {
                usuario_incorreto.setText("Usuário Incorreto");
                senha_incorreta.setText("Senha incorreta");
            }
            else if (usuario.getText().equals("Paula")==false)
            {
                usuario_incorreto.setText("Usuário Incorreto");
            }
            else if (senha.getText().equals("2")==false)
            {
                senha_incorreta.setText("Senha incorreta");
            }


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
