package Model;

import java.util.ArrayList;
import java.util.List;

public class LivrosDaoImp implements LivrosDao{
    private static LivrosDaoImp instance;

    public List<Livros> livros;

    private  int index;

    private LivrosDaoImp()
    {
        livros = new ArrayList<>();

        // Ordem [ nome_produto, descricao, genero, autor, editora,estoque,quant_paginas,ano,preco ]

        Livros livro1 = new Livros("Charadas com coronga", "Piadas Brabas", "Comédia","Jonkler","Detective Comics", 20,2024,149);
        Livros livro2 = new Livros("El Perigosa", "Maria malurdes rigoberta redescobre seu amor, POR ARMAS", "Drama","Jordanes Gonzalez","Romances reais", 3,1977,39);
        Livros livro3 = new Livros("Introdução a warhammer, um guia compreensivo", "Um guia fácil e prático", "enciclopédia","John MCComeCheetos","Basement publisher ", -1,2024,13);
        Livros livro4 = new Livros("Como cozinhar pepinos e cactos", "Melhor jeito para cozinhar coisas verdes", "Culinária","Palmirinha , Ana Maria Braga","Panini", 31,2014,19);
        Livros livro5 = new Livros("Tudo que eles não te ensinam na faculdade de direito de Harvard", "Literalmente Tudo", "Educacional","Dr.Herbert Weberjengermenjansen phd","KnowItAll", 13,2024,13);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
    }



    @Override
    public List<Livros>getallLivro()
    {
        return livros;
    }

    @Override
    public void adicionarLivro(Livros livro)
    {
        livros.add(livro);
    }

    @Override
    public void updateLivro(int index, Livros livro)
    {
        livros.set(index,livro);
    }

    @Override
    public Livros getlivro(int index) {
        return null;
    }

    public static synchronized LivrosDaoImp getInstance()
    {
        if (instance == null)
        {
            instance = new LivrosDaoImp();
        }
        return instance;
    }

    public  void setIndex(int index)
    {
        this.index=index;
    }

    public int getIndex()
    {
        return  index;
    }
}
