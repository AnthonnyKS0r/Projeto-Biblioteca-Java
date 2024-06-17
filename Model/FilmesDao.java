package Model;

import java.util.List;

public interface FilmesDao {
    //Método para retornar os filmes

    public List<Filmes> getallFilme();

    //método para adicionar os filmes a lista

    public void addFilme(Filmes filme);

    public void updateFilme(int index, Filmes filme);

    public Filmes getfilme(int index);
}
