/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Conta {
    
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void sacar(float valor) {
        if (getSaldoDisponivel() >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar esta operação!");
        }
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public float getSaldoDisponivel() {
        return this.saldo + this.limite;
    }
    
    public void aumentarLimite(float valor) {
        this.limite += valor;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Saldo Atual......: ").append(saldo).append("\n");
        sb.append("Saldo + Limite......: ").append(saldo + limite).append("\n");
        return sb.toString();
    }
    
}
