package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfigsController implements Initializable {
    @FXML
    private TextField altera_email;

    @FXML
    ChoiceBox<Integer> idade;

    @FXML
    public TextField altera_nome;

    @FXML
    private TextField altera_senha;

    @FXML
    private TextField altera_telefone;

    @FXML
    private TextField altera_cpf;

    public UsuarioDaoImp usuarioDao;

    private Usuario usuario_corrente;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usuarioDao=UsuarioDaoImp.getInstance();
        usuario_corrente=usuarioDao.usuarios.get(usuarioDao.getIndex());

        // Preenchendo o ChoiceBox com opções de 1 a 100
        for (int i = 1; i <= 100; i++) {
            idade.getItems().add(i);
        }

        altera_nome.setText(usuario_corrente.getNome());
        altera_senha.setText(usuario_corrente.getSenha());
        altera_cpf.setText(String.valueOf(usuario_corrente.getCPF()));
        altera_telefone.setText(String.valueOf(usuario_corrente.getTelefone()));
        altera_email.setText(usuario_corrente.getEmail());
        idade.setValue(usuario_corrente.getIdade());




    }

    public void atualizarUsuario(ActionEvent event)
    {
        Usuario user = new Usuario(altera_nome.getText(),altera_senha.getText(),Integer.parseInt(altera_telefone.getText()),altera_email.getText(),idade.getValue(),Integer.parseInt(altera_cpf.getText()));
        usuarioDao.updateUsuario(usuarioDao.getIndex(), user);
        //Apenas uma verificação se os dados estão sendo adcioandos a lista
        for (Usuario usuario : usuarioDao.getAllUsuarios()) {
            System.out.println("nome: " + usuario.getNome() + "senha: " + usuario.getSenha());
        }
    }


}
