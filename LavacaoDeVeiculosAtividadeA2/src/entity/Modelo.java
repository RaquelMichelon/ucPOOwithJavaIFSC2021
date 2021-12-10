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

//    metodos construtores
    public Modelo() {
    }

    public Modelo(String descricao, Marca marca) {
        this.descricao = descricao;
        this.marca = marca;
    }
    

//    metodos de acesso aos atributos   
    public void setIdModelo(int id) {
        this.idModelo = id;
    }
 
    public Marca getMarca() {
        return this.marca;
    }

    
    public String getDados() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.descricao);
    return sb.toString();
    }
    
}
