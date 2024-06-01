package com.example.projeto_library;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AcervoAtualizarFilmesController implements Initializable {

    @FXML
    private ChoiceBox<String> achar_filme;

    @FXML
    private TextField ano;

    @FXML
    private TextField diretor;

    @FXML
    private TextField estudio;

    @FXML
    private TextField estoque;

    @FXML
    private ChoiceBox<String> genero;

    @FXML
    private TextField nome;

    @FXML
    private TextField preco;

    @FXML
    private TextField sinopse;

    FilmesDaoImp filmesDao = FilmesDaoImp.getInstance();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Filmes filmes_teste = new Filmes();

        for (int i = 0; i < filmesDao.filmes.size(); i++) {
            filmes_teste = filmesDao.filmes.get(i);
            achar_filme.getItems().add(filmes_teste.getnome_produto());
        }

        achar_filme.setOnAction(this::filmeEscolhido);

    }



    public void filmeEscolhido(javafx.event.ActionEvent event)
    {
        String nome_filme = achar_filme.getValue();
        Filmes filme_escolhido=null;

        for (Filmes filme : filmesDao.filmes)
        {
            if (nome_filme.equals(filme.getnome_produto())) {
                filme_escolhido = filme;
                break; // Parar após encontrar o filme
            }
        }
        nome.setText(filme_escolhido.getnome_produto());
        diretor.setText(filme_escolhido.getdiretor());
        ano.setText(String.valueOf((filme_escolhido.getano())));
        genero.setValue(filme_escolhido.getgenero());
        estudio.setText(filme_escolhido.getestudio());
        preco.setText(String.valueOf(filme_escolhido.getpreco()));
        sinopse.setText(filme_escolhido.getdescricao());
        estoque.setText(String.valueOf(filme_escolhido.getestoque()));

    }

    public void atualizarFilme(javafx.event.ActionEvent event)
    {
        Filmes filme_atualizado= new Filmes(nome.getText(),sinopse.getText(),diretor.getText(),estudio.getText(),genero.getValue(),Integer.parseInt(estoque.getText()),Integer.parseInt(ano.getText()),Float.parseFloat(preco.getText()));

        for(int i=0;i<filmesDao.filmes.size();i++)
        {
            if(achar_filme.getValue().equals(filmesDao.filmes.get(i).getnome_produto()))
            {
                filmesDao.filmes.set(i,filme_atualizado);
                break;
            }
        }

        for (Filmes filmes : filmesDao.getallFilme())
        {
            System.out.println("Titulo: "+filmes.getnome_produto()+"Autor:"+ filmes.getdiretor());
        }
    }
}
