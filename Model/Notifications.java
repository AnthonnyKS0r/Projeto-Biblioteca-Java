package Model;

import java.time.LocalDate;

public class Notifications {
    private LocalDate data;
    private String hora;
    private String mensagem;

    public  Notifications(String mensagem,LocalDate data,String hora)
    {
        this.mensagem=mensagem;
        this.data=data;
        this.hora = hora;
    }

    public Notifications()
    {}

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public LocalDate getData()
    {
        return data;
    }

    public void setData(LocalDate data)
    {
        this.data=data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
