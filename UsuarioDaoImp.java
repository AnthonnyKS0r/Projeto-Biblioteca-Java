package com.example.projeto_library;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImp implements UsuarioDao{

    List<Usuario>usuarios;


    public UsuarioDaoImp()
    {
        usuarios=new ArrayList<>();
        Usuario usuario1=new Usuario("Paulo","pmaa",3444,"pooe",20,12039039);
        Usuario usuario2=new Usuario("Paloma","oi",2333,"powo",20,232323);

        usuarios.add(usuario1);
        usuarios.add(usuario2);

    }


    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarios;
    }

    @Override
    public void adcionarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }


}
