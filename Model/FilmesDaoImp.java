package Model;

import java.util.ArrayList;
import java.util.List;

public class FilmesDaoImp implements FilmesDao{
    private static FilmesDaoImp instance;

    public List<Filmes> filmes;

    private FilmesDaoImp()
    {
        filmes = new ArrayList<>();

        // Ordem [ nome_produto, descricao,diretor, estudio, genero, estoque, ano, preco, duracao ]

        Filmes filme1 = new Filmes("Blade Runner 2049", "Literalmente eu","Denis Villeneuve", "Alcon entertainment","Drama, Cyberpunk", 2049, 2017, 18);
        Filmes filme2 = new Filmes("Como eu conheci a sua vó", "Filme muito confuso","Adam Sandler", "Sandlermovies","Comédia", 3, 2018, 19);
        Filmes filme3 = new Filmes("Adam Sandler, Gênio incompreendido?", "Um documentário muito profundo sobre a vida e arte de um dos maiores artistas","Adame Sandlerina", "NotSandlermovies","Documentário", 10, 2019, 18);
        Filmes filme4 = new Filmes("O PEEPEE POOPOO MAN", "Você não estará rindo quando ele te encontrar","Sally Mcfakename", "Borror Media","Terror", 13, 2021, 3 );
        Filmes filme5 = new Filmes("Velozes e furios 95", "Familea","Neto do Vin Diesel","Diesel Movies" ,"Ação", -100, 2024, 10 );

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);
    }




    @Override
    public List<Filmes>getallFilme()
    {
        return filmes;
    }



    @Override
    public void addFilme(Filmes filme)
    {
        filmes.add(filme);
    }

    @Override
    public void updateFilme(int index, Filmes filme){}

    @Override
    public Filmes getfilme(int index)
    {
        return null;
    }

    public static synchronized FilmesDaoImp getInstance()
    {
        if (instance == null)
        {
            instance = new FilmesDaoImp();
        }
        return instance;
    }
}
