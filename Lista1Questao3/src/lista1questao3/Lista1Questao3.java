/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao3;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Faça um programa que permite ler três valores para os lados de um triângulo, considerando lados como:
//        A, B e C. Verificar se os lados fornecidos formam um realmente um triângulo, e se for esta condição
//        verdadeira, deverá ser indicado qual tipo de triângulo foi formado: isósceles, escaleno ou equilátero.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro número: ");
        int ladoA = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Digite o valor do segundo número: ");
        int ladoB = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite o valor do terceiro número: ");
        int ladoC = Integer.parseInt(entrada.nextLine());
        
        boolean isTriangle = ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoB) && ladoC < (ladoA + ladoB);
        
                
        if(isTriangle) {
            System.out.println("\nOk! Os números digitados formam um triângulo!\n");
            
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Como todos os lados são iguais, este é um triângulo EQUILÁTERO\n");
            } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Como há dois lados iguais, este é um triângulo ISÓSCELES\n");
            } else {
                System.out.println("Como todos os lados são diferentes, este é um triângulo ESCALENO\n");
            } 
        } else {
            System.out.println("Ops! Os valores digitados não formam um triângulo!");
        }
   
    }
    
}
