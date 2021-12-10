/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Escreva um programa que solicita o total gasto pelo cliente de uma loja, imprime as opções de pagamento,
//solicita a opção desejada e imprime o valor total das parcelas (quando houverem).
//Opções:
//
//1. a vista com 10% de desconto
//2. em duas vezes (preço da etiqueta)
//3. de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$
//100,00).
//
//OBS: Fazer um método que imprime o menu de opções e solicita a opção desejada. Este método deverá
//retornar a opção escolhida e, a partir dela, o programa principal deve verifica-la (por meio de uma instrução
//switch) para então ativar o método correspondente (um método para cada opção) para calcular o valor do
//produto e parcelas.
package lista1questao14;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao14 {
    public static Scanner entrada = new Scanner(System.in);
    public static Float valorTotal;
    public static DecimalFormat df = new DecimalFormat("0.00");



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("\nInforme o valor total da compra: R$");
        valorTotal = Float.parseFloat(entrada.nextLine());
        menu(valorTotal);
   
    }
    
    public static int opcoesPagamento() {
    System.out.println("\n\nOpções de Pagamento\n");
    System.out.println("1 - A vista com 10% de desconto");
    System.out.println("2 - Em 2X (preço da etiqueta)");
    System.out.println("3 - de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$100,00)");
    System.out.println("4 - Sair");
    System.out.print("\nOpção: ");
    int opcao = entrada.nextInt();
    return opcao;
    }
    
    public static void menu(float valorTotal) {
    int opcao = 0;
    do {
        opcao = opcoesPagamento();
        switch (opcao) {
            case 1:
                aVista(Lista1Questao14.valorTotal);
                break;
            case 2:
                duasVezes(Lista1Questao14.valorTotal);
                break;
            case 3:
                maisVezes(Lista1Questao14.valorTotal);
                break;
            case 4:
                System.out.println("\n\nFinalizando o programa!!!");
                System.exit(0);   
            default:
                System.out.println("\n\nOpção inválida!!!");
        }
    } while (opcao != 0);
    }
    
    public static void aVista(float valorTotal) {
        double valorComDesconto = valorTotal - (valorTotal * 0.10);
        System.out.println("\n\nValor da Compra [à Vista com desconto de 10%]: R$" + df.format(valorComDesconto));
    }
    
    public static void duasVezes(float valorTotal) {
        double valorPorParcela = valorTotal / 2;
        System.out.println("\n\nValor da Compra [2X sem desconto]: R$" + df.format(valorTotal));
        System.out.println("Valor da Parcela 1: R$" + df.format(valorPorParcela));
        System.out.println("Valor da Parcela 2: R$" + df.format(valorPorParcela));
    }
    
    public static void maisVezes(float valorTotal) {
        if (valorTotal <= 100) {
            System.out.println("\n\nOpção de pagamento inválida!!! O valor da compra precisa ser superior a R$ 100,00");
            return;
        }
        
        System.out.print("\n\nEm quantas parcelas deseja realizar o pagamento? [Opções válidas: de 3 a 10]");
        int resposta = entrada.nextInt();
        
        double valorTotalComJuros = valorTotal + (valorTotal * 0.03 * resposta);
        double valorPorParcela = valorTotalComJuros / resposta;
        
        System.out.println("\n\nValor Total da Compra parcelada em " + resposta + " X :" + df.format(valorTotalComJuros));
        System.out.println("Valor de cada uma das " + resposta + " parcelas :" + df.format(valorPorParcela));           
    }
    
}
