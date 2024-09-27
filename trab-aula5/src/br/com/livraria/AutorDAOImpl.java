package br.com.livraria;

import java.util.ArrayList;
import java.util.List;

public class AutorDAOImpl implements AutorDAO {
    private List<Autor> autores = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void inserirAutor(Autor autor) {
        autor.setIdAutor(contadorId++);
        autores.add(autor);
    }

    @Override
    public void atualizarAutor(Autor autor) {
        for (Autor a : autores) {
            if (a.getIdAutor() == autor.getIdAutor()) {
                a.setNome(autor.getNome());
                a.setNacionalidade(autor.getNacionalidade());
                break;
            }
        }
    }

    @Override
    public void excluirAutor(int idAutor) {
        autores.removeIf(a -> a.getIdAutor() == idAutor);
    }

    @Override
    public List<Autor> listarAutores() {
        return new ArrayList<>(autores);
    }
}
