package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdcionarMaterialFilmeController implements Initializable {
    @FXML
    private Label copia_error;

    @FXML
    private TextField ano;

    @FXML
    private TextField diretor;

    @FXML
    private TextField estoque;

    @FXML
    private TextField estudio;

    @FXML
    private ChoiceBox<String> genero;

    @FXML
    private TextField preco;

    @FXML
    private TextField sinopse;

    @FXML
    private TextField titulo;

    private String[] tipos_generos= {"Ação","Aventura","Romance","Terror","Drama","Suspence","Ficção Ciêntifca","Comédia","Animação"};

    FilmesDaoImp filmesDao = FilmesDaoImp.getInstance();

    boolean verificar_existe;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genero.getItems().addAll(tipos_generos);
    }

    public void addFilmes(ActionEvent event)
    {
        System.out.println("entrou");
        if(ano.getText()!=null&&titulo.getText()!=null&&diretor.getText()!=null&&estudio.getText()!=null&&sinopse!=null&&estoque!=null&&preco.getText()!=null&&genero.getValue()!=null)
        {
            Filmes novo_filme = new Filmes(titulo.getText(),sinopse.getText(),diretor.getText(),estudio.getText(),genero.getValue(),Integer.parseInt(estoque.getText()),Integer.parseInt(ano.getText()),Float.parseFloat(preco.getText()));
            for(int i=0;i<filmesDao.filmes.size();i++)
            {
                if ((filmesDao.filmes.get(i).getnome_produto() == novo_filme.getnome_produto())&&(filmesDao.filmes.get(i).getestudio()==novo_filme.getestudio()))
                {
                    copia_error.setText("Esse Filme já existe!");
                    verificar_existe=true;
                }

            }
            if (verificar_existe==false)
            {
                filmesDao.filmes.add(novo_filme);
            }
        }

        for(Filmes filme :filmesDao.getallFilme())
        {
            System.out.println("Nome:"+filme.getnome_produto()+"Estudio:"+filme.getestudio());
        }

    }
}
