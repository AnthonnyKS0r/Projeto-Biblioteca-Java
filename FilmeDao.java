import java.util.List;
public interface FilmeDao
{

    //Método para retornar os filmes

    public List<Filme> getallFilme();

    //método para adicionar os filmes a lista

    public void adicionarFilme(Filme filme);

    public void updateFilme(int index, Filme filme);

    public Livro getfilme(int index);
}
