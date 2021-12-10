/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Cor {
    
    private long idCor;
    private String nomeCor;

//    metodos construtores
    public Cor() {
    }

    public Cor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

//    metodo de acesso ao atributo nomeCor
    public String getNomeCor() {
        return nomeCor;
    }

//    metodo de acesso ao atributo idCor
    public void setIdCor(long idCor) {
        this.idCor = idCor;
    }

}
