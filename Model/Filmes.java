package Model;

public class Filmes extends Produto {
    private String diretor;
    private String estudio;
    private String genero;
    private int ano;

    public  Filmes(String nome_produto, String descricao, String diretor, String estudio, String genero, int estoque, int ano, float preco)
    {
        super(nome_produto,descricao,estoque,preco);
        this.diretor = diretor;
        this.estudio = estudio;
        this.genero = genero;
        this.ano = ano;
    }

    public Filmes()
    {
        super();
    }


    public void setdiretor(String diretor)
    {
        this.diretor = diretor;
    }

    public String getdiretor()
    {
        return diretor;
    }

    public void setestudio(String estudio)
    {
        this.estudio = estudio;
    }

    public String getestudio()
    {
        return estudio;
    }

    public void setgenero(String genero)
    {
        this.genero = genero;
    }

    public String getgenero()
    {
        return genero;
    }

    public void setano(int ano)
    {
        this.ano = ano;
    }

    public int getano()
    {
        return ano;
    }
}
