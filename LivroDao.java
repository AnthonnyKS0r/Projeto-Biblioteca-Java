import java.util.List;
public interface LivroDao
{

    //Método para retornar os livros
    public List<Livro> getallLivro();

    //método para adicionar os livros a lista

    public void adicionarLivro(Livro livro);

    public void updateLivro(int index, Livro livro);

    public Livro getlivro(int index);

}
