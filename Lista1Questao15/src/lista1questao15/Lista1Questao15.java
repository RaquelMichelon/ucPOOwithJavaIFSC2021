package lista1questao15;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//um programa para
//atribuir assentos em cada vôo do único avião da companhia (capacidade: 10 assentos).
//Seu programa deve exibir o seguinte menu de alternativas:
//Pressione 1 para “Primeira Classe”
//Pressione 2 para “Classe Executiva”
//Se a pessoa digitar 1, seu programa deve atribuir um assento na Primeira Classe (assentos 1-5). Se a
//pessoa digitar 2, seu programa deve atribuir um assento na Classe Executiva (assentos 6-10). Seu
//programa, então, deve imprimir um ticket de embarque indicando o número de assento da pessoa e se ele
//está na Primeira Classe ou Classe Executiva do avião.

//Utilize um array unidimensional de tamanho 10 para representar o gráfico de assentos do avião. Inicialize
//todos os elementos do array com 0 para indicar que todos os assentos estão vazios. À medida que cada
//assento é atribuído, configure os elementos correspondentes do array com 1 para indicar que o assento
//não está mais disponível.

//Naturalmente, seu programa nunca deve atribuir um assento que já foi atribuído. 

//Quando a Primeira Classe
//estiver lotada, seu programa deve solicitar à pessoa se é aceitável ser colocado na Classe Executiva (e
//vice-versa). Se for, faça a atribuição apropriada de assento. Se não for, imprima a mensagem “Aguarde
//o próximo vôo!!!”.


/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao15 {
    public static Scanner entrada = new Scanner(System.in);
    public static String resposta;
    public static int[] assentos = new int[10];
    public static int assentoParaReservar;
    public static String classe;
    public static int lotacaoPrimeiraClasse = 0;
    public static int lotacaoClasseExecutiva = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** COMPRA DE PASSAGENS PARA O VOO 1207 *****");
        Arrays.fill(assentos, 0);
        menu(assentos);      
    }
    
    public static int opcoesReserva() {
        System.out.println("\n\nOpções de Reserva\n");
        System.out.println("Pressione 1 para Primeira Classe");
        System.out.println("Pressione 2 para Classe executiva");
        System.out.println("Pressione 3 para Mostrar assentos disponíveis");
        System.out.println("Pressione 0 para Sair");
        System.out.print("\nOpção: ");
        int opcao = entrada.nextInt();
        return opcao;
    }
    
    public static void menu(int[] assentos) {
        int opcao = 0;
        do {
            opcao = opcoesReserva();
            switch (opcao) {
                case 1:
                    //confere se há lugares na primeira classe
                    if (lotacaoPrimeiraClasse < 5) {
                        classe = "Primeira Classe";
                        System.out.print("Informe o número do assento que deseja reservar: ");
                        assentoParaReservar = Integer.parseInt(entrada.next());
                        reservarPrimeiraClasse(assentos, assentoParaReservar);
                        break;
                    //caso a primeira classe esteja lotada
                    } else {
                        System.out.println("A Primeira Classe está lotada! Deseja fazer uma reserva na Classe Executiva? [S]im / [N]ão");
                        resposta = entrada.next();
                        if (resposta.equalsIgnoreCase("s")) {
                            classe = "Classe Executiva";
                            atribuirAssentoExecutiva(assentos, assentoParaReservar);
                            break;
                        } else {
                            System.out.println("Aguarde pelo próximo voo!!!");
                            break;
                        }
                    }
                    
                case 2:
                    //confere se há lugares na classe executiva
                    if (lotacaoClasseExecutiva < 5) {
                        classe = "Classe Executiva";
                        System.out.print("Informe o número do assento que deseja reservar: ");
                        assentoParaReservar = Integer.parseInt(entrada.next());
                        reservarClasseExecutiva(assentos, assentoParaReservar);
                        break;
                    //caso a classe executiva esteja lotada
                    } else {
                        System.out.println("A Classe executiva está lotada! Deseja fazer uma reserva na Primeira Classe? [S]im / [N]ão");
                        resposta = entrada.next();
                        if (resposta.equalsIgnoreCase("s")) {
                            classe = "Primeira Classe";
                            atribuirAssentoPrimeiraClasse(assentos, assentoParaReservar);
                            break;
                        } else {
                            System.out.println("Aguarde pelo próximo voo!!!");
                            break;
                        }
                    }
                case 3:
                    mostrarAssentos(assentos);
                    break;
                case 0:
                    System.out.println("\n\nFinalizando o programa!!!");
                    break;  
                default:
                    System.out.println("\n\nOpção inválida!!!");
            }
        } while (opcao != 0);
    }
    
    public static void reservar(int[] assentos, int i) {
         //a variavel de iteração é igual ao local do assento
        if (assentoParaReservar - 1 == i) {
                if (assentos[i] == 0) {
                    //o assento está vazio, entao reserve
                    assentos[i] = 1;
                    imprimirTicket(assentos, assentoParaReservar);
                } else {
                    System.out.println("\n **** O assento já está ocupado! Selecione um novo assento! ****");
                } 
            }
    }
    
    public static void reservarPrimeiraClasse(int[] assentos, int assentoParaReservar) {
        if (assentoParaReservar < 6) {
          for (int i = 0; i < 5; i++) {
           reservar(assentos, i);
        }  
        } else {
            System.out.println("Os assentos da Primeira Classe são de 1 a 5.");
        }
        lotacaoPrimeiraClasse++;   
    }
    
    public static void reservarClasseExecutiva(int[] assentos, int assentoParaReservar) {
        if (assentoParaReservar < 6) {
            System.out.println("Os assentos da Classe Executiva são de 6 a 10.");
        } else {
            for (int i = 4; i < assentos.length; i++) {
            reservar(assentos, i);
            }
        } 
        lotacaoClasseExecutiva++;
    }
    
    public static void imprimirTicket(int[] assentos, int assentoParaReservar) {
        System.out.println("\n ----------------------------------------------------------------");
        System.out.println("-                                                                 -");
        System.out.println("-                                                                 -");
        System.out.println("-                     Ticket de Embarque:                         -\n");
        System.out.println("           Assento n." + assentoParaReservar + " RESERVADO na " + classe);
        System.out.println("-                                                                 -");
        System.out.println("-                                                                 -");
        System.out.println("\n ----------------------------------------------------------------");
    }
    
    public static void mostrarAssentos(int[] assentos) {
        System.out.println("Assento n. | Situação");
        for (int assento = 0; assento < assentos.length; assento++) {
            if (assentos[assento] == 0) {
               System.out.println((assento + 1) + ".............Livre"); 
            } else {
                System.out.println((assento + 1) + "............Ocupado");
            }
        }
        
    }
    
    public static void atribuirAssentoExecutiva(int[] assentos, int assentoParaReservar) {
        for (int i = 4; i < assentos.length; i++) {
            if (assentos[i] == 0) {
                //o assento está vazio, entao reserve
                assentos[i] = 1;
                assentoParaReservar = i+1;
                imprimirTicket(assentos, assentoParaReservar);
                break;
            }     
        }
    }
    
    public static void atribuirAssentoPrimeiraClasse(int[] assentos, int assentoParaReservar) {
        for (int i = 0; i < 5; i++) {
            if (assentos[i] == 0) {
                //o assento está vazio, entao reserve
                assentos[i] = 1;
                assentoParaReservar = i+1;
                imprimirTicket(assentos, assentoParaReservar);
                break;
            }     
        }
    }
    
}
