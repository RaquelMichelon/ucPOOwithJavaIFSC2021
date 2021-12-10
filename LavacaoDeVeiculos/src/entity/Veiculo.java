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
    
    public int getIdVeiculo() {
        return this.idVeiculo;
    }
    
    public void setIdVeiculo(int id) {
        this.idVeiculo = id;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Modelo getModelo() {
        return this.modelo;
    }
    
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID........: ").append(idVeiculo).append("\n");
        sb.append("Placa.....: ").append(placa).append("\n");
        sb.append("Modelo.....: ").append(modelo.getDados()).append("\n");
        sb.append("Marca......: ").append(modelo.getMarca().getDados()).append("\n");
        return sb.toString();
    }
}
