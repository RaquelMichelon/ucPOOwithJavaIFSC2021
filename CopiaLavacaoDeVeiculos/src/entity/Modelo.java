/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Modelo {
    
    private int idModelo;
    private String descricao;
    private Marca marca;
    
    
    public int getIdModelo() {
    return this.idModelo;
    }
    
    public void setIdModelo(int id) {
        this.idModelo = id;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public String getDados() {
    StringBuilder sb = new StringBuilder();
    sb.append(descricao);
    return sb.toString();
    }
    
}
