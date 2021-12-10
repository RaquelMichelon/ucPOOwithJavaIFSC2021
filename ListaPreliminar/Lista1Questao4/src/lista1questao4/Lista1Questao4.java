/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao4;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são
//            altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0 (zero) até 0,25. Se o
//            índice sobe para 0,3 as indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o índice
//            crescer para 0,4 as indústrias do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice
//            atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que
//            leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o índice de poluição: ");
        float indice = Float.parseFloat(entrada.nextLine());


        if (indice >= 0.5) {
            System.out.println("Índice de poluíção inaceitável! Indústrias dos grupos 1, 2 e 3 devem suspender suas atividades.");
        } else if (indice >= 0.4) {
            System.out.println("Indústrias do 1o e 2o grupo devem suspender suas atividades.");
        } else if (indice >= 0.3) {
            System.out.println("Indústrias do 1o grupo devem suspender suas atividades.");
        } else if (indice > 0.25) {
            System.out.println("Índice de poluição em nível de alerta! Nenhuma notificação se faz necessária.");
        } else {
           System.out.println("Índice de poluição aceitável! Nenhuma notificação se faz necessária.");
        }
        
    }
    
}
