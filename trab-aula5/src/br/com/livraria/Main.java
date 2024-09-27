package br.com.livraria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AutorDAO autorDAO = new AutorDAOImpl();
        LivroDAO livroDAO = new LivroDAOImpl();

        // Inserir autores
        Autor autor1 = new Autor(0, "J. K. Rowling", "Britânica");
        Autor autor2 = new Autor(0, "George R. R. Martin", "Americano");
        autorDAO.inserirAutor(autor1);
        autorDAO.inserirAutor(autor2);

        // Inserir livros
        Livro livro1 = new Livro(0, "Harry Potter e a Pedra Filosofal", 1997, autor1);
        Livro livro2 = new Livro(0, "Harry Potter e a Câmara Secreta", 1998, autor1);
        Livro livro3 = new Livro(0, "A Guerra dos Tronos", 1996, autor2);
        livroDAO.inserirLivro(livro1);
        livroDAO.inserirLivro(livro2);
        livroDAO.inserirLivro(livro3);

        // Listar todos os autores
        List<Autor> autores = autorDAO.listarAutores();
        System.out.println("Autores:");
        for (Autor autor : autores) {
            System.out.println("ID: " + autor.getIdAutor() + ", Nome: " + autor.getNome() + ", Nacionalidade: " + autor.getNacionalidade());
        }

        // Listar todos os livros
        List<Livro> livros = livroDAO.listarLivros();
        System.out.println("\nLivros:");
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getIdLivro() + ", Título: " + livro.getTitulo() + ", Ano: " + livro.getAnoPublicacao() + ", Autor: " + livro.getAutor().getNome());
        }

        // Listar livros de um autor específico
        System.out.println("\nLivros de " + autor1.getNome() + ":");
        List<Livro> livrosAutor1 = livroDAO.listarLivrosPorAutor(autor1);
        for (Livro livro : livrosAutor1) {
            System.out.println("Título: " + livro.getTitulo());
        }
    }
}
