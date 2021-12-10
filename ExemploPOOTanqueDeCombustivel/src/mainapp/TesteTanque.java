/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

import entity.Tanque;

/**
 *
 * @author mpisching
 */
public class TesteTanque {
    public static void main(String[] args) {
        Tanque tanque = new Tanque();
        tanque.definirCapacidade(50);
        tanque.definirReserva(5);
        
        System.out.println("Tanque: \n" + tanque.getDados());
        
        tanque.abastecer(30);
        System.out.println("Tanque: \n" + tanque.getDados());
        
        System.out.println("motor em funcionamento....");
        while (tanque.obterQuantidadeAtual() > 0) {
            tanque.consumir(1);
            System.out.println(tanque.obterQuantidadeAtual());
        }
        System.out.println("motor parado...");
    }
}
