/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Veiculo {
    private int idVeiculo;
    private String placa;
    private Modelo modelo;
    private String observacoes;
    private Cor cor;

//    metodos construtores    
    public Veiculo() {
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa, Modelo modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }
    
//    metodos de acesso aos atributos   
    public void setIdVeiculo(int id) {
        this.idVeiculo = id;
    }
   
    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID........: ").append(this.idVeiculo).append("\n");
        sb.append("Placa.....: ").append(this.placa).append("\n");
        sb.append("Modelo.....: ").append(this.modelo.getDados()).append("\n");
        sb.append("Marca......: ").append(this.modelo.getMarca().getDados());
        sb.append("Cor........: ").append(this.cor.getNomeCor()).append("\n");
        sb.append("Obs.:......: ").append(this.observacoes).append("\n");
        return sb.toString();
    }
}
