package com.example.projeto_library;

import java.util.List;

public interface LivrosDao {
    //Método para retornar os livros
    public List<Livros> getallLivro();

    //método para adicionar os livros a lista

    public void adicionarLivro(Livros livro);

    public void updateLivro(int index, Livros livro);

    public Livros getlivro(int index);
}
