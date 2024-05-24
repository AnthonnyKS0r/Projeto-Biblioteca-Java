package com.example.projeto_library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ResourceBundle;

public class CadastroUsuarioController implements Initializable {
    @FXML
    TextField nome;

    @FXML
    TextField senha;

    @FXML
    TextField cpf;

    @FXML
    TextField telefone;

    @FXML
    TextField email;

    @FXML
    ChoiceBox<Integer> idade;

    private Stage stage;

    private Scene scene;

    private Parent root;


    private UsuarioDaoImp usuarioDao;

    public void initialize(URL arg0, ResourceBundle arg1)
    {
        usuarioDao=new UsuarioDaoImp();

        // Preenchendo o ChoiceBox com opções de 1 a 100
        for (int i = 1; i <= 100; i++) {
            idade.getItems().add(i);
        }

    }



    public void cadastro(ActionEvent event)
    {
        try
        {
            //Criando um objeto contendo os atributos coletados na tela de Cadastro
            Usuario user = new Usuario(nome.getText(), senha.getText(), Integer.parseInt(telefone.getText()), email.getText(), idade.getValue(), Integer.parseInt(cpf.getText()));

            //Passando esses atributos para a Lista
            usuarioDao.adcionarUsuario(user);

            //Apenas uma verificação se os dados estão sendo adcioandos a lista
            for (Usuario usuario : usuarioDao.getAllUsuarios()) {
                System.out.println("nome: " + usuario.getNome() + "senha: " + usuario.getSenha());
            }

            //Transição para tela de Escolha Login

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("escolha_login.fxml"));
            root=fxmlLoader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
