package application;

import dao.*;
import models.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instancia os DAOs
        ProjetoDAO projetoDAO = new ProjetoDAO();
        EngenheiroDAO engenheiroDAO = new EngenheiroDAO();
        OperarioDAO operarioDAO = new OperarioDAO();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
        MaterialDAO materialDAO = new MaterialDAO();

        // Criar novo projeto
        Projeto projeto = new Projeto();
        projeto.setNome("Construção de Prédio");
        projeto.setLocal("São Paulo");
        projeto.setDataInicio(new Date());
        projeto.setDataTermino(new Date());

        // Inserir projeto no sistema
        projetoDAO.inserir(projeto);

        // Criar engenheiro
        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setNome("João Silva");
        engenheiro.setEspecialidade("Estruturas");

        // Inserir engenheiro no sistema
        engenheiroDAO.inserir(engenheiro);

        // Criar operário
        Operario operario = new Operario();
        operario.setNome("Carlos Oliveira");
        operario.setFuncao("Pedreiro");

        // Inserir operário no sistema
        operarioDAO.inserir(operario);

        // Criar equipamento
        Equipamento equipamento = new Equipamento();
        equipamento.setNome("Betoneira");
        equipamento.setTipo("Misturador");

        // Inserir equipamento no sistema
        equipamentoDAO.inserir(equipamento);

        // Criar material
        Material material = new Material();
        material.setNome("Cimento");
        material.setQuantidade(50); // quantidade inicial


        // Inserir material no sistema
        materialDAO.inserir(material);

        // Listar todos os projetos
        System.out.println("Lista de Projetos:");
        for (Projeto p : projetoDAO.listar()) {
            System.out.println(p.getNome() + " - Local: " + p.getLocal());
        }

        // Listar todos os engenheiros
        System.out.println("Lista de Engenheiros:");
        for (Engenheiro e : engenheiroDAO.listar()) {
            System.out.println(e.getNome() + " - Especialidade: " + e.getEspecialidade());
        }

        // Listar todos os operários
        System.out.println("Lista de Operários:");
        for (Operario o : operarioDAO.listar()) {
            System.out.println(o.getNome() + " - Função: " + o.getFuncao());
        }

        // Listar todos os equipamentos
        System.out.println("Lista de Equipamentos:");
        for (Equipamento eq : equipamentoDAO.listar()) {
            System.out.println(eq.getNome() + " - Tipo: " + eq.getTipo());
        }

        // Listar todos os materiais
        System.out.println("Lista de Materiais:");
        for (Material m : materialDAO.listar()) {
            System.out.println(m.getNome() + " - Quantidade: " + m.getQuantidade());
        }

        // Atualizar material
        material.setQuantidade(100); // nova quantidade
        materialDAO.atualizar(material);
        System.out.println("Material atualizado: " + material.getNome() + " - Nova Quantidade: " + material.getQuantidade());

        // Excluir material
        materialDAO.excluir(material.getId());
        System.out.println("Material excluído: " + material.getNome());
    }
}
