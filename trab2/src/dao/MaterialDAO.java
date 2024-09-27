package dao;

import models.Material;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO {
    private final List<Material> materiais = new ArrayList<>(); // Tornando a lista final
    private int nextId = 1; // Simulando auto-incremento

    // Método para inserir um material
    public void inserir(Material material) {
        material.setId(nextId++);
        materiais.add(material);
    }

    // Método para listar todos os materiais
    public List<Material> listar() {
        return new ArrayList<>(materiais);
    }

    // Método para atualizar um material
    public void atualizar(Material materialAtualizado) {
        for (Material material : materiais) {
            if (material.getId() == materialAtualizado.getId()) {
                material.setNome(materialAtualizado.getNome());
                material.setQuantidade(materialAtualizado.getQuantidade());
                break;
            }
        }
    }

    // Método para excluir um material
    public void excluir(int id) {
        materiais.removeIf(material -> material.getId() == id);
    }
}
