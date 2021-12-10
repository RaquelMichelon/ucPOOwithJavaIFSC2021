/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao12;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao12 {
    public static Scanner entrada = new Scanner(System.in);
    public static int valorA;
    public static int valorB;
    public static int valorC;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        menu(valorA, valorB, valorC);
    }


    public static int opcoesMenu() {
    System.out.println("1 - Inserir os dados de entrada");
    System.out.println("2 - Área do trapézio");
    System.out.println("3 - Área do quadrado");
    System.out.println("4 - Área da superfície do cubo");
    System.out.println("5 - Sair");
    System.out.print("Opção: ");
    int opcao = entrada.nextInt();
    return opcao;
    }
        
        /**
         * Menu de opções do programa
         * @param valorA
         * @param valorB
         * @param valorC 
         */
    public static void menu(int valorA, int valorB, int valorC) {
        int opcao = 0;
        do {
            opcao = opcoesMenu();
            switch (opcao) {
                case 1:
                    inserir(Lista1Questao12.valorA, Lista1Questao12.valorB, Lista1Questao12.valorC);
                    break;
                case 2:
                    calcularAreaTrapezio(Lista1Questao12.valorA, Lista1Questao12.valorB, Lista1Questao12.valorC);
                    break;
                case 3:
                    calcularAreaQuadrado(Lista1Questao12.valorB);
                    break;
                case 4:
                    calcularAreaCubo(Lista1Questao12.valorC);
                    break;
                case 5:
                    System.out.println("Finalizando o programa!!!");
                    break;   
                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 5);
    }
        
        public static void inserir(int valorA, int valorB, int valorC) {
            System.out.println("Informe o valor de A: ");
            Lista1Questao12.valorA = entrada.nextInt();
            System.out.println("Informe o valor de B: ");
            Lista1Questao12.valorB = entrada.nextInt();
            System.out.println("Informe o valor de C: ");
            Lista1Questao12.valorC = entrada.nextInt();           
        }
        
        public static void calcularAreaTrapezio(int valorA, int valorB, int valorC) {
            float areaTrapezio = ((valorA + valorB) / 2) * valorC;
            System.out.println("A área do trapézio é: " + areaTrapezio);
        }
        
        public static void calcularAreaQuadrado(int valorB) {
            float areaQuadrado = valorB * valorB;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        }
        
        public static void calcularAreaCubo(int valorC) {
            float areaCubo = 6 * (valorC * valorC);
            System.out.println("A área da superfície do cubo é: " + areaCubo);
        }

}

