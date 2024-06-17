package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PedirLivrosController implements Initializable {
    @FXML
    private Label ano;

    @FXML
    private Label autor;

    @FXML
    private Label editora;

    @FXML
    private Label erro;

    @FXML
    private Label erro1;

    @FXML
    private DatePicker escolha_data;

    @FXML
    private ChoiceBox<String> escolha_livro;

    @FXML
    private Label genero;

    @FXML
    private Label nome;

    @FXML
    private Label preco;

    private int index_escolhido;

    LivrosDaoImp livrosDao = LivrosDaoImp.getInstance();
    UsuarioDaoImp usuarioDao = UsuarioDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Livros preencher = new Livros();
        for(int i=0;i<livrosDao.livros.size();i++)
        {
            preencher= livrosDao.livros.get(i);
            escolha_livro.getItems().add(preencher.getnome_produto());
        }
        escolha_livro.setOnAction(this::mostrarInfo);
    }

    public void mostrarInfo(ActionEvent event)
    {
        String nome_livro = escolha_livro.getValue();
        Livros livro_escolhido = null;

        for(int i=0;i<livrosDao.livros.size();i++)
        {
            if(nome_livro.equals(livrosDao.livros.get(i).getnome_produto()))
            {
                index_escolhido=i;
                livro_escolhido = livrosDao.livros.get(i);
            }
        }
        nome.setText(livro_escolhido.getnome_produto());
        autor.setText(livro_escolhido.getautor());
        ano.setText(String.valueOf(livro_escolhido.getano()));
        editora.setText(livro_escolhido.geteditora());
        genero.setText(livro_escolhido.getgenero());
        preco.setText(String.valueOf(livro_escolhido.getpreco()));
    }

    public void addToWishList(ActionEvent event)
    {

        erro.setText("");
        erro1.setText("");


        LocalDate data_entrega = escolha_data.getValue();
        LocalDate hoje = LocalDate.now();
        LocalDate duasSemanas = hoje.plusWeeks(2);
        String nome_livro = escolha_livro.getValue();

        if(livrosDao.livros.get(index_escolhido).getestoque()-1>=0)
        {
            if(data_entrega!=null && (data_entrega.isEqual(hoje))||data_entrega.isAfter(hoje)&&data_entrega.isBefore(duasSemanas))
            {
                Desejos novo_desejo = new Desejos(livrosDao.livros.get(index_escolhido).getnome_produto(),data_entrega);
                usuarioDao.usuarios.get(usuarioDao.getIndex()).wishlist.add(novo_desejo);
            }
            else
            {
                erro1.setText("Escolha uma data Válida (No máximo 2 semanas de Hoje ");
            }
        }
        else
        {
            erro.setText("Desculpe! O Estoque desse produto já se esgotou");
        }


    }
}
