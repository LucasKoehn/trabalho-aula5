package br.com.livraria;

import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAO {
    private List<Livro> livros = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void inserirLivro(Livro livro) {
        livro.setIdLivro(contadorId++);
        livros.add(livro);
    }

    @Override
    public void atualizarLivro(Livro livro) {
        for (Livro l : livros) {
            if (l.getIdLivro() == livro.getIdLivro()) {
                l.setTitulo(livro.getTitulo());
                l.setAnoPublicacao(livro.getAnoPublicacao());
                l.setAutor(livro.getAutor());
                break;
            }
        }
    }

    @Override
    public void excluirLivro(int idLivro) {
        livros.removeIf(l -> l.getIdLivro() == idLivro);
    }

    @Override
    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }

    @Override
    public List<Livro> listarLivrosPorAutor(Autor autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().getIdAutor() == autor.getIdAutor()) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }
}
