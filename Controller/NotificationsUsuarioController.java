package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class NotificationsUsuarioController implements Initializable {

    @FXML
    private ChoiceBox<String> pegar_notifications;

    @FXML
    private Label detalhes;



    UsuarioDaoImp usuarioDao =UsuarioDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Notifications notification_teste = new Notifications();

        for(int i=0;i<usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.size();i++)
        {
            notification_teste = usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.get(i);
            pegar_notifications.getItems().add(notification_teste.getHora()+" - "+notification_teste.getData());

        }
        pegar_notifications.setOnAction(this::mostrarNot);
    }

    public void mostrarNot(ActionEvent event)
    {
        String notificacao_teste =  pegar_notifications.getValue();
        System.out.println(notificacao_teste);
        Notifications not_escolhida = null;

        for(int i=0;i<usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.size();i++)
        {
            if(notificacao_teste.equals(usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.get(i).getHora()+" - "+usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.get(i).getData()))
            {
                not_escolhida=usuarioDao.usuarios.get(usuarioDao.getIndex()).notificationslist.get(i);
            }
        }
        detalhes.setText(not_escolhida.getMensagem());

    }

}
