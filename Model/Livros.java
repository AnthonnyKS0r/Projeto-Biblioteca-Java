package Model;

public class Livros extends Produto {
    private String genero;
    private int ano;
    private String autor;
    private String editora;

    public Livros(String nome_produto, String descricao, String genero, String autor, String editora, int estoque,int ano, float preco)
    {
        super(nome_produto,descricao,estoque,preco);
        this.genero = genero;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public Livros(String nome_produto, String descricao, int estoque, float preco) {
        super(nome_produto, descricao, estoque, preco);
    }

    public Livros()
    {
        super();
    }


    public void setgenero(String genero)
    {
        this.genero = genero;
    }

    public String getgenero()
    {
        return genero;
    }

    public void setano (int ano)
    {
        this.ano = ano;
    }

    public int getano()
    {
        return ano;
    }

    public void setautor(String autor)
    {
        this.autor = autor;
    }

    public String getautor()
    {
        return autor;
    }

    public void seteditora(String editora)
    {
        this.editora = editora;
    }

    public String geteditora()
    {
        return editora;
    }
}
