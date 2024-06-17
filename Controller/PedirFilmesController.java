package com.example.projeto_library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PedirFilmesController implements Initializable {

    @FXML
    private Label erro_debito;

    @FXML
    private Label ano;

    @FXML
    private Label diretor;

    @FXML
    private DatePicker escolha_data;

    @FXML
    private ChoiceBox<String> escolha_filme;

    @FXML
    private Label estudio;

    @FXML
    private Label genero;

    @FXML
    private Label nome;

    @FXML
    private Label preco;

    @FXML
    private Label erro;

    @FXML
    private Label erro1;


    UsuarioDaoImp usuarioDao = UsuarioDaoImp.getInstance();
    FilmesDaoImp filmesDao = FilmesDaoImp.getInstance();
    private int index_escolhido;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Filmes preencher = new Filmes();
        for(int i=0;i<filmesDao.filmes.size();i++)
        {
            preencher= filmesDao.filmes.get(i);
            escolha_filme.getItems().add(preencher.getnome_produto());
        }
        escolha_filme.setOnAction(this::mostrarInfo);
    }

    public void mostrarInfo(ActionEvent event)
    {
        String nome_livro = escolha_filme.getValue();
        Filmes filme_escolhido = null;

        for(int i=0;i<filmesDao.filmes.size();i++)
        {
            if(nome_livro.equals(filmesDao.filmes.get(i).getnome_produto()))
            {
                index_escolhido=i;
                filme_escolhido = filmesDao.filmes.get(i);
            }
        }
        nome.setText(filme_escolhido.getnome_produto());
        diretor.setText(filme_escolhido.getdiretor());
        ano.setText(String.valueOf(filme_escolhido.getano()));
        estudio.setText(filme_escolhido.getestudio());
        genero.setText(filme_escolhido.getgenero());
        preco.setText(String.valueOf(filme_escolhido.getpreco()));
    }

    public void addToWishList(ActionEvent event)
    {

        erro.setText("");
        erro1.setText("");
        erro_debito.setText("");

        Boolean debito = false;
        LocalDate data_entrega = escolha_data.getValue();
        LocalDate hoje = LocalDate.now();
        LocalDate duasSemanas = hoje.plusWeeks(2);
        String nome_livro = escolha_filme.getValue();

        for(int i=0;i<usuarioDao.usuarios.get(usuarioDao.getIndex()).wishlist.size();i++)
        {
            LocalDate verificar_debito = usuarioDao.usuarios.get(usuarioDao.getIndex()).getDesejos(i).getData_entrega();
            if(verificar_debito.isEqual(LocalDate.now())||verificar_debito.isBefore(LocalDate.now()))
            {
                debito=true;
            }
        }
        if(debito==false) {
            if (filmesDao.filmes.get(index_escolhido).getestoque() - 1 >= 0) {
                if (data_entrega != null && (data_entrega.isEqual(hoje)) || data_entrega.isAfter(hoje) && data_entrega.isBefore(duasSemanas)) {
                    Desejos novo_desejo = new Desejos(filmesDao.filmes.get(index_escolhido).getnome_produto(), data_entrega);
                    usuarioDao.usuarios.get(usuarioDao.getIndex()).wishlist.add(novo_desejo);
                } else {
                    erro1.setText("Escolha uma data Válida (No máximo 2 semanas de Hoje ");
                }
            } else {
                erro.setText("Desculpe! O Estoque desse produto já se esgotou");
            }
        }
        else
        {
            erro_debito.setText("Impossivel continuar a transação devido á debito pendente!");
        }



    }
}

