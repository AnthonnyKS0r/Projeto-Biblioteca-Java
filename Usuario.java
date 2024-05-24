package com.example.projeto_library;

public class Usuario {

    private String nome;

    private String senha;

    private int telefone;

    private String email;

    private int idade;

    private int CPF;

    public Usuario(String nome, String senha, int telefone, String email, int idade,int CPF)
    {
        this.nome=nome;
        this.senha=senha;
        this.telefone=telefone;
        this.email=email;
        this.idade=idade;
        this.CPF=CPF;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha=senha;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public void setTelefone(int telefone)
    {
        this.telefone=telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade=idade;
    }

    public int getCPF()
    {
        return CPF;
    }

    public void setCPF(int CPF)
    {
        this.CPF=CPF;
    }



}
