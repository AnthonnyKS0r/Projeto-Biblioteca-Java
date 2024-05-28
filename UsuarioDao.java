package com.example.projeto_library;

import java.util.List;

public interface UsuarioDao {

    // Método para retornar todos os usuários
    public List<Usuario> getAllUsuarios();

    // Método para adicionar usuários a Lista
    public void adcionarUsuario(Usuario usuario);

    public void updateUsuario(int index,Usuario usuario);

    public Usuario getUsuario(int index);
}
