package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdcionarMaterialLivroController implements Initializable {


    @FXML
    private Label copia_error;


    @FXML
    private TextField ano;

    @FXML
    private TextField autor;

    @FXML
    private TextField editora;

    @FXML
    private TextField estoque;

    @FXML
    private ChoiceBox<String> genero;

    @FXML
    private TextField preco;

    @FXML
    private TextField sinopse;

    @FXML
    private TextField titulo;

    private String[] tipo_generos= {"Ação","Aventura","Romance","Terror","Drama","Suspence","Ficção Ciêntifca","Comédia","Animação"};

    LivrosDaoImp livrosDao = LivrosDaoImp.getInstance();

    boolean verificar_existe;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genero.getItems().addAll(tipo_generos);
    }

    public void addLivros(ActionEvent event)
    {
        if(ano.getText()!=null&&titulo.getText()!=null&&autor.getText()!=null&&editora.getText()!=null&&sinopse!=null&&estoque!=null&&preco.getText()!=null&&genero.getValue()!=null)
        {
            Livros novo_livro = new Livros(titulo.getText(),sinopse.getText(),genero.getValue(),autor.getText(),editora.getText(),Integer.parseInt(estoque.getText()),Integer.parseInt(ano.getText()),Float.parseFloat(preco.getText()));
            for(int i=0;i<livrosDao.livros.size();i++)
            {
                if ((livrosDao.livros.get(i).getnome_produto() == novo_livro.getnome_produto())&&(livrosDao.livros.get(i).geteditora()==novo_livro.geteditora()))
                {
                    copia_error.setText("Esse Livro já existe!");
                    verificar_existe=true;
                }

            }
            if (verificar_existe==false)
            {
                livrosDao.livros.add(novo_livro);
            }
        }

        for(Livros livros : livrosDao.getallLivro())
        {
            System.out.println("Nome:"+livros.getnome_produto()+"editora:"+livros.geteditora());
        }

    }
}
