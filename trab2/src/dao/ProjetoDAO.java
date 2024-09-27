package dao;

import models.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {
    private List<Projeto> projetos = new ArrayList<>();
    private int nextId = 1; // Simulando auto-incremento

    public void inserir(Projeto projeto) {
        projeto.setId(nextId++);
        projetos.add(projeto);
    }

    public List<Projeto> listar() {
        return new ArrayList<>(projetos); // Retorna uma cópia para evitar modificações externas
    }

    public void atualizar(Projeto projetoAtualizado) {
        for (Projeto projeto : projetos) {
            if (projeto.getId() == projetoAtualizado.getId()) {
                projeto.setNome(projetoAtualizado.getNome());
                projeto.setLocal(projetoAtualizado.getLocal());
                projeto.setDataInicio(projetoAtualizado.getDataInicio());
                projeto.setDataTermino(projetoAtualizado.getDataTermino());
                projeto.setEngenheiros(projetoAtualizado.getEngenheiros());
                projeto.setOperarios(projetoAtualizado.getOperarios());
                projeto.setEquipamentos(projetoAtualizado.getEquipamentos());
                projeto.setMateriais(projetoAtualizado.getMateriais());
                break;
            }
        }
    }

    public void excluir(int id) {
        projetos.removeIf(projeto -> projeto.getId() == id);
    }
}
