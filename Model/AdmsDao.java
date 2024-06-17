package Model;

import java.util.List;

public interface AdmsDao {
    // Método para retornar todos os usuários
    public List<Adms> getAllAdm();

    public void updateAdm(int index,Adms adms);

    public Adms getAdm(int index);
}
