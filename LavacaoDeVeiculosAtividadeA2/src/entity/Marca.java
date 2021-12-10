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
    
//  metodos construtores
    public Marca() {
    }
    
    public Marca(String nome) {
        this.nome = nome;
    }

    
//  metodos de acesso aos atributos   
    public void setIdMarca(int id) {
        this.idMarca = id;
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome).append("\n");
        return sb.toString();
    }
    
}
