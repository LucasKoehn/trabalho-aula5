package dao;

import models.Operario;
import java.util.ArrayList;
import java.util.List;

public class OperarioDAO {
    private final List<Operario> operarios = new ArrayList<>(); // Tornando a lista final
    private int nextId = 1; // Simulando auto-incremento

    // Método para inserir um operário
    public void inserir(Operario operario) {
        operario.setId(nextId++);
        operarios.add(operario);
    }

    // Método para listar todos os operários
    public List<Operario> listar() {
        return new ArrayList<>(operarios);
    }

    // Método para atualizar um operário
    public void atualizar(Operario operarioAtualizado) {
        for (Operario operario : operarios) {
            if (operario.getId() == operarioAtualizado.getId()) {
                operario.setNome(operarioAtualizado.getNome());
                operario.setFuncao(operarioAtualizado.getFuncao());
                break;
            }
        }
    }

    // Método para excluir um operário
    public void excluir(int id) {
        operarios.removeIf(operario -> operario.getId() == id);
    }
}
