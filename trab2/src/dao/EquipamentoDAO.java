package dao;

import models.Equipamento;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoDAO {
    private final List<Equipamento> equipamentos = new ArrayList<>(); // Tornando a lista final
    private int nextId = 1; // Simulando auto-incremento

    // Método para inserir um equipamento
    public void inserir(Equipamento equipamento) {
        equipamento.setId(nextId++);
        equipamentos.add(equipamento);
    }

    // Método para listar todos os equipamentos
    public List<Equipamento> listar() {
        return new ArrayList<>(equipamentos);
    }

    // Método para atualizar um equipamento
    public void atualizar(Equipamento equipamentoAtualizado) {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getId() == equipamentoAtualizado.getId()) {
                equipamento.setNome(equipamentoAtualizado.getNome());
                equipamento.setTipo(equipamentoAtualizado.getTipo());
                break;
            }
        }
    }

    // Método para excluir um equipamento
    public void excluir(int id) {
        equipamentos.removeIf(equipamento -> equipamento.getId() == id);
    }
}
