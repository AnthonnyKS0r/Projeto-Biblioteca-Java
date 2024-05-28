import java.util.ArrayList;
import java.util.List;
public class LivroDaoImp implements LivroDao
{
    private static LivroDaoImp instance;

    public List<Livro>livros;

    private LivroDaoImp()
    {
        livros = new ArrayList<>();

            // Ordem [ nome_produto, descricao, genero, autor, editora,estoque,quant_paginas,ano,preco ]

            Livro livro1 = new Livro("Charadas com coronga", "Piadas Brabas", "Comédia","Jonkler","Detective Comics", 20, 200,2024,149);
            Livro livro2 = new Livro("El Perigosa", "Maria malurdes rigoberta redescobre seu amor, POR ARMAS", "Drama","Jordanes Gonzalez","Romances reais", 3, 990,1977,39);
            Livro livro3 = new Livro("Introdução a warhammer, um guia compreensivo", "Um guia fácil e prático", "enciclopédia","John MCComeCheetos","Basement publisher ", -1, 40000,2024,13);
            Livro livro4 = new Livro("Como cozinhar pepinos e cactos", "Melhor jeito para cozinhar coisas verdes", "Culinária","Palmirinha , Ana Maria Braga","Panini", 31, 200,2014,19);
            Livro livro5 = new Livro("Tudo que eles não te ensinam na faculdade de direito de Harvard", "Literalmente Tudo", "Educacional","Dr.Herbert Weberjengermenjansen phd","KnowItAll", 13, 999999999,2024,13);

            livros.add(livro1);
            livros.add(livro2);
            livros.add(livro3);
            livros.add(livro4);
            livros.add(livro5);
    }



    @Override
    public List<Livro>getallLivro()
    {
        return livros;
    }

    @Override
    public void adicionarLivro(Livro livro)
    {
        livros.add(livro);
    }

    @Override
    public void updateLivro(int index, Livro livro) {

    }

    @Override
    public Livro getlivro(int index) {
        return null;
    }

    public static synchronized LivroDaoImp getInstance()
    {
        if (instance == null)
        {
            instance = new LivroDaoImp();
        }
        return instance;
    }




}
