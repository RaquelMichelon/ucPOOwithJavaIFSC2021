package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raqueldarellimichelon
 */
public class Marca {
    
    private int idMarca;
    private String nome;
    
    public int getIdMarca() {
    return this.idMarca;
    }
    
    public void setIdMarca(int id) {
        this.idMarca = id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append("\n");
        return sb.toString();
    }
    
}
