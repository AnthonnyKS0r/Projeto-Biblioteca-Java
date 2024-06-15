package com.example.projeto_library;

public class Produto {
    private String nome_produto;

    private String descricao;

    private int estoque;

    private float preco;

    public Produto(String nome_produto, String descricao, int estoque, float preco)
    {
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;

    }

    public Produto()
    {

    }

    public void setnome_produto(String nome_produto)
    {
        this.nome_produto = nome_produto;
    }

    public String getnome_produto()
    {
        return nome_produto;
    }

    public void setdescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getdescricao()
    {
        return descricao;
    }

    public void setestoque(int num)
    {
        this.estoque = num;
    }

    public int getestoque()
    {
        return estoque;
    }

    //Próximos dois métodos para adicionar e diminuir quantidade de estoque.

    public void adicionar_estoque (int q)
    {
        this.estoque += q;
    }

    public void diminuir_estoque (int q)
    {
        this.estoque -= q;
    }

    public void setpreco(float preco)
    {
        this.preco = preco;
    }

    public float getpreco()
    {
        return preco;
    }
}
