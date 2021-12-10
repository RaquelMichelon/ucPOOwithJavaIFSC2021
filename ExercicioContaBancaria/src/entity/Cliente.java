/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Cliente {
    
    private String cliente;
    private String cpf;
    private String fone;
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String nomeCliente) {
        cliente = nomeCliente;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpfCliente) {
        cpf = cpfCliente;
    }
    
    public String getFone() {
        return fone;
    }
    
    public void setFone(String foneCliente) {
        foneCliente = fone;
    }

}
