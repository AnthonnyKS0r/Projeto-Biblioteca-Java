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
import com.example.projeto_library.UsuarioDaoImp;



import java.io.IOException;
import java.util.List;

public class EscolhaLogin_Controller {

    private Stage stage;

    private Scene scene;

    private Parent root;

    // Campo de Inserir Usuário
    @FXML
    TextField usuario;

    //Mensagemd e Usuário incorreto
    @FXML
    Label usuario_incorreto;

    //Campo de Inserir Senha
    @FXML
    PasswordField senha;

    //mensagem de Senha inocrreta
    @FXML
    Label senha_incorreta;

    // Definindo a Instancia do objeto, para Intancia de UsuarioDaoImp
    UsuarioDaoImp usuarioDao = UsuarioDaoImp.getInstance();

    //Criando um lista chamada usuários, e passando os valores da lista da instancia de UsuarioDaoImp
    List<Usuario> usuarios= usuarioDao.getAllUsuarios();

    // Variaveis de Verificação para usuario e senha
    int nome_certo=0,senha_certa=0;


    // Método para entrada de usúario para a tela inicial de usuário
    public void login_usuario(ActionEvent event) throws IOException
    {
        //Reiniciando o conteudo das mensagens sempre que apertar o botão cadastro
        usuario_incorreto.setText("");
        senha_incorreta.setText("");
        nome_certo=0;
        senha_certa=0;
        try {

            //Vai interir por toda a lista
            for (int i = 0; i < usuarioDao.usuarios.size(); i++)
            {
                //Criando um objeto do tipo Usuario que recebe cada elemento da lista da instância de UsuarioDaoImp
                Usuario teste = usuarioDao.usuarios.get(i);

                //Comparamos se os Usuários e senha batem com algum valor contido na lista
                if (teste.getNome().equals(usuario.getText()) && teste.getSenha().equals(senha.getText()))
                {
                    //Carrega a nova pagina
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tela_inicial_usuario.fxml"));
                    root = fxmlLoader.load();
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }

                //Testamos se pelo menos o nome ou a senha foram digitados corretamente
                if (teste.getSenha().equals(senha.getText())==true)
                {
                    senha_certa=1;
                }
                if (teste.getNome().equals(usuario.getText())==true)
                {
                    nome_certo=1;
                }
            }

            //Setamos os labels para caso de erros na digitação
            if(nome_certo==0&&senha_certa==0)
            {
                usuario_incorreto.setText("Usuário não encontrado");
                senha_incorreta.setText("Senha Incorreta");
            }
            else if (nome_certo==0&&senha_certa==1)
            {
                usuario_incorreto.setText("Usuário incorreto");
            }
            else if (nome_certo==1&&senha_certa==0)
            {
                senha_incorreta.setText("Senha Incorreta!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Mesmo procedimento para cadastro
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

    public void cadastrar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastro_usuario.fxml"));
        root = fxmlLoader.load();
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
