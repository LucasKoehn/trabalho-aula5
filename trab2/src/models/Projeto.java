package models;

import java.util.Date;
import java.util.List;

public class Projeto {
    private int id;
    private String nome;
    private String local;
    private Date dataInicio;
    private Date dataTermino;
    private List<Engenheiro> engenheiros;
    private List<Operario> operarios;
    private List<Equipamento> equipamentos;
    private List<Material> materiais;

    // Construtor
    public Projeto() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }
    public Date getDataTermino() { return dataTermino; }
    public void setDataTermino(Date dataTermino) { this.dataTermino = dataTermino; }
    public List<Engenheiro> getEngenheiros() { return engenheiros; }
    public void setEngenheiros(List<Engenheiro> engenheiros) { this.engenheiros = engenheiros; }
    public List<Operario> getOperarios() { return operarios; }
    public void setOperarios(List<Operario> operarios) { this.operarios = operarios; }
    public List<Equipamento> getEquipamentos() { return equipamentos; }
    public void setEquipamentos(List<Equipamento> equipamentos) { this.equipamentos = equipamentos; }
    public List<Material> getMateriais() { return materiais; }
    public void setMateriais(List<Material> materiais) { this.materiais = materiais; }
}
