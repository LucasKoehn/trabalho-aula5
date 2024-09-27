package br.com.livraria;

import java.util.List;

public interface LivroDAO {
    void inserirLivro(Livro livro);
    void atualizarLivro(Livro livro);
    void excluirLivro(int idLivro);
    List<Livro> listarLivros();
    List<Livro> listarLivrosPorAutor(Autor autor);
}
