package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;

    private String senha;

    private int telefone;

    private String email;

    private int idade;

    private int CPF;

    public List<Notifications>notificationslist;

    public List<Desejos>wishlist;




    public Usuario(String nome, String senha, int telefone, String email, int idade,int CPF)
    {
        this.nome=nome;
        this.senha=senha;
        this.telefone=telefone;
        this.email=email;
        this.idade=idade;
        this.CPF=CPF;
        notificationslist=new ArrayList<>();
        wishlist = new ArrayList<>();
    }
    public Usuario()
    {}



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

    public Notifications getNotifications(int index)
    {
        return notificationslist.get(index);
    }
    public void addNotifications(Notifications notifications)
    {
        notificationslist.add(notifications);
    }

    public String getNotificacao(int index)
    {
        return notificationslist.get(index).getMensagem();
    }

    public List<Notifications> getALLNotifications() {
        return notificationslist;
    }

    public Desejos getDesejos(int index)
    {
        return wishlist.get(index);
    }

    public void addDesejo(Desejos desejos)
    {
        wishlist.add(desejos);
    }

    public String getNome_Livro(int index)
    {
        return wishlist.get(index).getNome_livro();
    }

    public LocalDate getData_entrega(int index)
    {
        return  wishlist.get(index).getData_entrega();
    }

    public List<Desejos> getAllDesejos()
    {
        return wishlist;
    }




}
