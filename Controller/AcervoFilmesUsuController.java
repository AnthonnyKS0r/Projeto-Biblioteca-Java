package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AcervoFilmesUsuController implements Initializable {
    @FXML
    private ChoiceBox<String> Filmes_choice;

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
    private Label sino;


    private Stage stage;

    private Scene scene;

    private Parent root;

    FilmesDaoImp filmesdao= FilmesDaoImp.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Filmes filme_teste=new Filmes();

        for (int i = 0; i < filmesdao.filmes.size(); i++) {
            filme_teste = filmesdao.filmes.get(i);
            Filmes_choice.getItems().add(filme_teste.getnome_produto());
        }

        Filmes_choice.setOnAction(this::escolherFilme);


    }

    public void escolherFilme(ActionEvent event)
    {
        String nome_filme = Filmes_choice.getValue();
        Filmes filme_escolhido = null;

        // Procurar o livro escolhido
        for (Filmes filme : filmesdao.filmes) {
            if (nome_filme.equals(filme.getnome_produto())) {
                filme_escolhido = filme;
                break; // Parar após encontrar o livro
            }
        }

        nome.setText(filme_escolhido.getnome_produto());
        autor.setText(filme_escolhido.getdiretor());
        ano.setText(String.valueOf((filme_escolhido.getano())));
        genero.setText(filme_escolhido.getgenero());
        editora.setText(filme_escolhido.getestudio());
        preco.setText(String.valueOf(filme_escolhido.getpreco()));
        sino.setText(filme_escolhido.getdescricao());
    }


}
