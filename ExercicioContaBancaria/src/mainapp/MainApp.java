/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import entity.Conta;

/**
 *
 * @author raqueldarellimichelon
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNumero(013);
        
        conta1.depositar(500.00f);
        conta1.aumentarLimite(200.00f);
        
        System.out.println("Saldo em Conta: " + conta1.getSaldo());
        System.out.println("Saldo Disponível: " + conta1.getSaldoDisponivel());
        
        conta1.sacar(750.00f);
        System.out.println("\n\nSaldo Disponível: " + conta1.getSaldoDisponivel());
    }
    
}
