package br.com.livraria;

import java.util.List;

public interface AutorDAO {
    void inserirAutor(Autor autor);
    void atualizarAutor(Autor autor);
    void excluirAutor(int idAutor);
    List<Autor> listarAutores();
}
