import java.util.ArrayList;
import java.util.List;
public class FilmeDaoImp implements FilmeDao
{
    private static FilmeDaoImp instance;

    public List<Filme>filmes;

    private FilmeDaoImp()
    {
        filmes = new ArrayList<>();

        // Ordem [ nome_produto, descricao,diretor, estudio, genero, estoque, ano, preco, duracao ]

        Filme filme1 = new Filme("Blade Runner 2049", "Literalmente eu","Denis Villeneuve", "Alcon entertainment","Drama, Cyberpunk", 2049, 2017, 18, 0243 );
        Filme filme2 = new Filme("Como eu conheci a sua vó", "Filme muito confuso","Adam Sandler", "Sandlermovies","Comédia", 3, 2018, 19, 0130 );
        Filme filme3 = new Filme("Adam Sandler, Gênio incompreendido?", "Um documentário muito profundo sobre a vida e arte de um dos maiores artistas","Adame Sandlerina", "NotSandlermovies","Documentário", 10, 2019, 18, 0230 );
        Filme filme4 = new Filme("O PEEPEE POOPOO MAN", "Você não estará rindo quando ele te encontrar","Sally Mcfakename", "Borror Media","Terror", 13, 2021, 3, 045 );
        Filme filme5 = new Filme("Velozes e furios 95", "Familea","Neto do Vin Diesel","Diesel Movies" ,"Ação", -100, 2024, 10, 0250 );

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);
    }




    @Override
    public List<Filme>getallFilme()
    {
        return filmes;
    }

    @Override
    public void adicionarFilme(Filme filme)
    {
        filmes.add(filme);
    }

    @Override
    public void updateFilme(int index, Filme filme){}

    @Override
    public Filme getfilme(int index)
    {
        return null;
    }

    public static synchronized FilmeDaoImp getInstance()
    {
        if (instance == null)
        {
            instance = new FilmeDaoImp();
        }
        return instance;
    }

}
