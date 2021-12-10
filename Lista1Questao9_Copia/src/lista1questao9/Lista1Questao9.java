/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Fazer um programa que:
//        • Leia e escreva o nome e a altura das moças inscritas em um concurso de beleza. Para cada moça,
//        foi informado seu nome e sua altura. Para encerrar, será informada a palavra "FIM" no lugar do
//        nome.
//        • Calcule e escreva as duas maiores alturas e quantas moças a possuem.
        Scanner entrada = new Scanner(System.in);
        String nome;
        float maiorAlturaA = 0, maiorAlturaB = 0;
        int contadorMaioresAlturas = 0;
        System.out.println("***** INSCRIÇÕES PARA O CONCURSO DE BELEZA *****");
        
        ArrayList<Float> listaAlturas = new ArrayList<>();
        
        do {    
            System.out.print("\n\nInforme o nome da inscrita [ou digite FIM para sair...]: ");
            nome = entrada.nextLine();
            
            if (nome.equalsIgnoreCase("FIM")) {
                System.out.println("\n\n***** Inscrições FINALIZADAS com sucesso! *****");
                break;
            }
            
            System.out.print("Informe a altura da " + nome + ": ");
            float altura = Float.parseFloat(entrada.nextLine());

            if (altura > maiorAlturaA) {
                maiorAlturaB = maiorAlturaA;
                maiorAlturaA = altura;
                listaAlturas.add(maiorAlturaA);
            } else if (altura == maiorAlturaA) {
                maiorAlturaA = altura;
                listaAlturas.add(maiorAlturaA);
            } else if (altura > maiorAlturaB && altura != maiorAlturaA) {
                maiorAlturaB = altura;
                listaAlturas.add(maiorAlturaB);
            } else if (altura == maiorAlturaB) {
                maiorAlturaB = altura;
                listaAlturas.add(maiorAlturaB);
            }
             
        } while (!nome.equalsIgnoreCase("FIM"));
        
        for (Float altura : listaAlturas) {
            if (altura == maiorAlturaA || altura == maiorAlturaB) {
                contadorMaioresAlturas++;
            }
        }
        
        
        System.out.println("\n\nAs duas maiores alturas de inscritas foram: " + maiorAlturaA + " e " 
                            + maiorAlturaB + " e um total de " + contadorMaioresAlturas + " inscritas possuem essas alturas.");
        
    }
    
}
