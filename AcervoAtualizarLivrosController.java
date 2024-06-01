package com.example.projeto_library;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class AcervoAtualizarLivrosController implements Initializable {
    @FXML
    private ChoiceBox<String> achar_livro;

    @FXML
    private TextField ano;

    @FXML
    private TextField preco;

    @FXML
    private TextField editora;

    @FXML
    private TextField estoque;



    @FXML
    private ChoiceBox<String> genero;

    @FXML
    private TextField autor;

    @FXML
    private TextField sinopse;

    @FXML
    private TextField titulo;

    public LivrosDaoImp livrosDao;

    private int index;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        livrosDao=LivrosDaoImp.getInstance();

        Livros livro_teste = new Livros();

        for (int i = 0; i < livrosDao.livros.size(); i++) {
            livro_teste = livrosDao.livros.get(i);
            achar_livro.getItems().add(livro_teste.getnome_produto());
        }

        achar_livro.setOnAction(this::livroEscolhido);

    }



    public void livroEscolhido(javafx.event.ActionEvent event)
    {
        String nome_livro = achar_livro.getValue();
        Livros livro_escolhido=null;

        for (Livros livro : livrosDao.livros)
        {
            if (nome_livro.equals(livro.getnome_produto())) {
                livro_escolhido = livro;
                break; // Parar após encontrar o livro
            }
        }
        titulo.setText(livro_escolhido.getnome_produto());
        autor.setText(livro_escolhido.getautor());
        ano.setText(String.valueOf((livro_escolhido.getano())));
        genero.setValue(livro_escolhido.getgenero());
        editora.setText(livro_escolhido.geteditora());
        preco.setText(String.valueOf(livro_escolhido.getpreco()));
        sinopse.setText(livro_escolhido.getdescricao());
        estoque.setText(String.valueOf(livro_escolhido.getestoque()));

    }

    public void atualizarLivro(javafx.event.ActionEvent event)
    {
        Livros livro_atualizado= new Livros(titulo.getText(),sinopse.getText(),genero.getValue(),autor.getText(),editora.getText(),Integer.parseInt(estoque.getText()),Integer.parseInt(ano.getText()),Float.parseFloat(preco.getText()));

        for(int i=0;i<livrosDao.livros.size();i++)
        {
            if(achar_livro.getValue().equals(livrosDao.livros.get(i).getnome_produto()))
            {
                livrosDao.livros.set(i,livro_atualizado);
                break;
            }
        }

        for (Livros livros : livrosDao.getallLivro())
        {
            System.out.println("Titulo: "+livros.getnome_produto()+"Autor:"+ livros.getautor());
        }
    }
}
