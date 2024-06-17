package Model;

import java.time.LocalDate;

public class Desejos {

    private String nome_livro;
    private LocalDate data_entrega;

    Desejos(String nome_livro, LocalDate data_entrega)
    {
        this.nome_livro=nome_livro;
        this.data_entrega=data_entrega;
    }

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }
}
