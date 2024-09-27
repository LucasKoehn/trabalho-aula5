package dao;

import models.Engenheiro;
import java.util.ArrayList;
import java.util.List;

public class EngenheiroDAO {
    private final List<Engenheiro> engenheiros = new ArrayList<>(); // Tornando a lista final
    private int nextId = 1; // Simulando auto-incremento

    // Método para inserir um engenheiro
    public void inserir(Engenheiro engenheiro) {
        engenheiro.setId(nextId++);
        engenheiros.add(engenheiro);
    }

    // Método para listar todos os engenheiros
    public List<Engenheiro> listar() {
        return new ArrayList<>(engenheiros);
    }

    // Método para atualizar um engenheiro
    public void atualizar(Engenheiro engenheiroAtualizado) {
        for (Engenheiro engenheiro : engenheiros) {
            if (engenheiro.getId() == engenheiroAtualizado.getId()) {
                engenheiro.setNome(engenheiroAtualizado.getNome());
                engenheiro.setEspecialidade(engenheiroAtualizado.getEspecialidade());
                break;
            }
        }
    }

    // Método para excluir um engenheiro
    public void excluir(int id) {
        engenheiros.removeIf(engenheiro -> engenheiro.getId() == id);
    }
}
