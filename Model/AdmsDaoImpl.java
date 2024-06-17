package Model;

import java.util.ArrayList;
import java.util.List;

public class AdmsDaoImpl implements AdmsDao{

    public static AdmsDaoImpl instance;
    public List<Adms>gerentes;
    private int index;

    AdmsDaoImpl()
    {
        gerentes=new ArrayList<>();
        Adms gerente1 = new Adms("Paloma","123",34225577,"carloshot",20,01221);
        Adms gerente2 = new Adms("Yamaloka","124",342425577,"yahamlok",20,012221);
        gerentes.add(gerente1);
        gerentes.add(gerente2);
    }


    @Override
    public List<Adms> getAllAdm() {
        return gerentes;
    }


    @Override
    public void updateAdm(int index, Adms adms) {
        gerentes.set(index,adms);
    }

    @Override
    public Adms getAdm(int index)
    {
        return gerentes.get(index);
    }

    public int getIndex() {
       return index;
    }
    public void setIndex(int index)
    {
        this.index=index;
    }

    public static synchronized AdmsDaoImpl getInstance()
    {
        if(instance == null)
        {
            instance=new AdmsDaoImpl();
        }
        return instance;
    }

}
