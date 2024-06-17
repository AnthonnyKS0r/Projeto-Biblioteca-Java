package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;

import java.net.URL;
import java.util.ResourceBundle;

public class AcervoLivrosUsuarioController implements Initializable {

    @FXML
    private ChoiceBox<String> Livros_choice;

    @FXML
    private Label ano;

    @FXML
    private Label autor;

    @FXML
    private Label editora;

    @FXML
    private Label genero;

    @FXML
    private Label nome;

    @FXML
    private Label preco;



    @FXML
    private ScrollBar scroll;

    @FXML
    private Label sinopse;



    private LivrosDaoImp livroDao = LivrosDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Livros livro_teste = new Livros();

        for (int i = 0; i < livroDao.livros.size(); i++) {
            livro_teste = livroDao.livros.get(i);
            Livros_choice.getItems().add(livro_teste.getnome_produto());
        }


        Livros_choice.setOnAction(this::escolhaLivro);
    }

    public void escolhaLivro(ActionEvent event) {
        String nome_livro = Livros_choice.getValue();
        Livros livro_escolhido = null;

        // Procurar o livro escolhido
        for (Livros livro : livroDao.livros) {
            if (nome_livro.equals(livro.getnome_produto())) {
                livro_escolhido = livro;
                break; // Parar após encontrar o livro
            }
        }

        nome.setText(livro_escolhido.getnome_produto());
        autor.setText(livro_escolhido.getautor());
        ano.setText(String.valueOf((livro_escolhido.getano())));
        genero.setText(livro_escolhido.getgenero());
        editora.setText(livro_escolhido.geteditora());
        preco.setText(String.valueOf(livro_escolhido.getpreco()));
        sinopse.setText(livro_escolhido.getdescricao());


    }

    public void retornar(ActionEvent event)
    {

    }

}

