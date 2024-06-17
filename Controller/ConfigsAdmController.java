package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfigsAdmController implements Initializable {
    @FXML
    private TextField altera_cpf;

    @FXML
    private TextField altera_email;

    @FXML
    private TextField altera_nome;

    @FXML
    private TextField altera_senha;

    @FXML
    private TextField altera_telefone;

    @FXML
    private ChoiceBox<Integer> idade;

    AdmsDaoImpl admDao;

    private Adms adms_corrente;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        admDao=AdmsDaoImpl.getInstance();
        adms_corrente=admDao.gerentes.get(admDao.getIndex());

        // Preenchendo o ChoiceBox com opções de 1 a 100
        for (int i = 1; i <= 100; i++) {
            idade.getItems().add(i);
        }

        altera_nome.setText(adms_corrente.getNome());
        altera_senha.setText(adms_corrente.getSenha());
        altera_cpf.setText(String.valueOf(adms_corrente.getCPF()));
        altera_telefone.setText(String.valueOf(adms_corrente.getTelefone()));
        altera_email.setText(adms_corrente.getEmail());
        idade.setValue(adms_corrente.getIdade());




    }

    public void atualizarAdm(ActionEvent event)
    {
        Adms adm_user = new Adms(altera_nome.getText(),altera_senha.getText(),Integer.parseInt(altera_telefone.getText()),altera_email.getText(),idade.getValue(),Integer.parseInt(altera_cpf.getText()));
        admDao.updateAdm(admDao.getIndex(), adm_user);
        //Apenas uma verificação se os dados estão sendo adcioandos a lista
        for (Adms adm : admDao.getAllAdm()) {
            System.out.println("nome: " + adm.getNome() + "senha: " + adm.getSenha());
        }
    }
}
