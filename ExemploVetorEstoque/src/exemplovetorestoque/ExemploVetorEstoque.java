/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovetorestoque;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class ExemploVetorEstoque {

    public static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] estoque = new int[10];
        menu(estoque);
    }

    public static int opcoesMenu() {
        System.out.println("1 - Inicializar o estoque");
        System.out.println("2 - Mostrar o estoque");
        System.out.println("3 - Retirar produto do estoque");
        System.out.println("4 - Repor produto no estoque");
        System.out.println("5 - Pesquisar produto");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        int opcao = entrada.nextInt();
        return opcao;
    }

    /**
     * menu de opções do programa
     *
     * @param estoque
     */
    public static void menu(int[] estoque) {
        int opcao = 0;
        do {
            opcao = opcoesMenu();
            switch (opcao) {
                case 1:
                    inicializar(estoque);
                    break;
                case 2:
                    mostrar(estoque);
                    break;
                case 3:
                    System.out.println("Informe o código do produto (códigos válidos [1 a "
                            + (estoque.length) + "]):");
                    int codigoProduto = entrada.nextInt();
                    System.out.println("Informe a quantidade de produto a ser retirada: ");
                    int quantidade = entrada.nextInt();
                    retirarProduto(estoque, codigoProduto, quantidade);
                    break;
                case 4:
                    System.out.println("Informe o código do produto (códigos válidos [1 a "
                            + (estoque.length) + "]):");
                    codigoProduto = entrada.nextInt();
                    System.out.println("Informe a quantidade de produto a repor: ");
                    quantidade = entrada.nextInt();
                    reporProduto(estoque, codigoProduto, quantidade);
                    break;
                case 5:
                    System.out.println("Informe o código do produto (códigos válidos [1 a "
                            + (estoque.length) + "]):");
                    codigoProduto = entrada.nextInt();
                    pesquisarProduto(estoque, codigoProduto);
                    break;
                case 0:
                    System.out.println("Finalizando o programa!!!");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 0);
    }

    /**
     * Método para inicializar o estoque
     *
     * @param estoque
     */
    public static void inicializar(int[] estoque) {
        Random numero = new Random();

        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = numero.nextInt(100);
        }
    }

    /**
     * Método para mostrar o conteúdo do estoque
     *
     * @param estoque
     */
    public static void mostrar(int[] estoque) {
        System.out.println("**** CONTEUDO DO ESTOQUE ****");
        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + estoque[i]);
        }
    }
    
    /**
     * Método para retirar o produto do estoque
     * 
     * @param estoque
     * @param codigoProduto
     * @param quantidade 
     */
    private static void retirarProduto(int[] estoque, int codigoProduto, int quantidade) {
        if (codigoProduto < 1 || codigoProduto > 10) {
            System.out.println("Produto inválido!!!");
            return;
        }
        if (quantidade > estoque[codigoProduto - 1]) {
            System.out.println("Quantidade de produtos insuficiente no estoque!!!");
            return;
        }
        estoque[codigoProduto - 1] -= quantidade;
    }
    
    /**
     * Método para repor produto no estoque
     * @param estoque
     * @param codigoProduto
     * @param quantidade 
     */
    private static void reporProduto(int[] estoque, int codigoProduto, int quantidade) {
        if (codigoProduto < 1 || codigoProduto > 10) {
            System.out.println("Produto inválido!!!");
            return;
        }
        if (quantidade > estoque[codigoProduto - 1]) {
            System.out.println("Quantidade de produtos insuficiente no estoque!!!");
            return;
        }
        
        
        if (estoque[codigoProduto - 1] + quantidade > 100) {
            System.out.println("Quantidade de produtos ultrapassa o limite do estoque!!!");
        } else {
            estoque[codigoProduto - 1] += quantidade;
            System.out.println("Quantidade de produtos reposta com sucesso no estoque!!!");
        }


    }
    
    /**
     * Método para pesquisar e mostrar um produto do estoque
     * @param estoque
     * @param codigoProduto 
     */
    private static void pesquisarProduto(int[] estoque, int codigoProduto) {
        for (int i = 0; i < estoque.length; i++) {
            if (i+1 == codigoProduto) {
                System.out.println("Produto Pesquisado: " + (i + 1) + "; \n Quantidade em estoque: " + estoque[i]);  
            }
            
        }
    }
//        private static void pesquisarProduto(int[] estoque, int codigoProduto) {
//            
//                System.out.println("Produto Pesquisado: " + codigoProduto + "; \n Quantidade em estoque: " + estoque[codigoProduto - 1]);  
//
//    }

}
