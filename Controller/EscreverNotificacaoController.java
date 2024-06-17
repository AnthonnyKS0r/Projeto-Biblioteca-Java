package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class EscreverNotificacaoController implements Initializable {

    @FXML
    private ChoiceBox<String> escolher_usuario;

    @FXML
    private TextField mensagem;

    @FXML
    private TextArea areaNotificacoes;



    UsuarioDaoImp usuarioDao = UsuarioDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Usuario usuario_teste = new Usuario();
        for(int i=0;i<usuarioDao.usuarios.size();i++)
        {
            usuario_teste=usuarioDao.usuarios.get(i);
            escolher_usuario.getItems().add(usuario_teste.getEmail());
        }
    }

    public void enviarNot(ActionEvent event)
    {
        String armazenar_mensagem=mensagem.getText();
        for(int i=0;i<usuarioDao.usuarios.size();i++)
        {
            if(escolher_usuario.getValue()==usuarioDao.usuarios.get(i).getEmail())
            {
                LocalDate date = LocalDate.now();
                Date hora_atual = new Date();
                String horas = new SimpleDateFormat("HH:mm").format(hora_atual);
                System.out.println(horas);
                System.out.println(date);
                Notifications new_notification= new Notifications(armazenar_mensagem,date,horas);
                usuarioDao.usuarios.get(i).addNotifications(new_notification);
            }
        }

    }

    public void verificarTodasNotificacoes(ActionEvent event) {
        StringBuilder sb = new StringBuilder();
        for (Usuario usuario : usuarioDao.usuarios) {
            sb.append("User: ").append(usuario.getEmail()).append("\n");
            List<Notifications> notificacoes = usuario.getALLNotifications();
            for (Notifications notificacao : notificacoes) {
                sb.append("  Date: ").append(notificacao.getData()).append("\n");
                sb.append("  Message: ").append(notificacao.getMensagem()).append("\n");
            }
            sb.append("\n");
        }
        areaNotificacoes.setText(sb.toString());
    }



}
