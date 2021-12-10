/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao11;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        11. Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada
//        cidade. Para isso, são fornecidos os seguintes dados:
//        • Preço do KWh consumido;
//        • Número do consumidor;
//        • Quantidade de KWh consumidos durante o mês;
//        • Código do tipo de consumidor (residencial, comercial, industrial).
//        Fazer um programa que:
//        • Leia os dados descritos acima;
//        • Calcule:
//        ❖ Para cada consumidor, o total a pagar;
//        ❖ O maior consumo verificado;
//        ❖ O menor consumo verificado;
//        ❖ O total de consumo para cada um dos três tipos de consumidores;
//        ❖ A média geral de consumo
//        • Escreva:
//        ❖ Para cada consumidor, o seu número e o total a pagar
//        ❖ O que foi calculado nos itens anteriores.
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        String resposta;
        float maiorConsumo = Float.MIN_VALUE, menorConsumo = Float.MAX_VALUE;
        float acumuladorConsumoA = 0.0f;
        float acumuladorConsumoB = 0.0f;
        float acumuladorConsumoC = 0.0f;
        int acumuladorIndividual = 0;
        float mediaGeral;
        
        System.out.println("***** CONSUMO MENSAL DE ENERGIA ELÉTRICA *****");

        
        do {
            System.out.println("\n------ DADOS INDIVIDUAIS DE CONSUMO DE ENERGIA ELÉTRICA ------");
            System.out.print("\nInforme o preço do KWh consumido: R$");
            float precoKwh = Float.parseFloat(entrada.nextLine());
            
            System.out.print("Informe o número do consumidor: ");
            int consumidor = Integer.parseInt(entrada.nextLine());
            
            System.out.print("Informe a quantidade KWh consumidos durante o mês: ");
            float consumo = Float.parseFloat(entrada.nextLine());
            
            int codigo;
            do {
                System.out.print("Infome o código do tipo de consumidor [1] residencial [2] comercial [3] industrial : ");
                codigo = Integer.parseInt(entrada.nextLine());
                switch (codigo) {
                    case 1:
                        acumuladorConsumoA += consumo; 
                        break;
                    case 2:
                        acumuladorConsumoB += consumo;
                        break;
                    case 3:
                        acumuladorConsumoC += consumo;
                        break;
                    default: 
                        System.out.println("Código informado é inválido!");
                }
            } while (codigo != 1 && codigo != 2 && codigo != 3);
            
            
            
            float total = consumo * precoKwh;
            
            System.out.println("\nO consumidor " + consumidor + " pagará um total de R$" + df.format(total));
           

            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
            } 
            
            if (consumo < menorConsumo) {
                menorConsumo = consumo;
            }
            
            acumuladorIndividual++;
            mediaGeral = (acumuladorConsumoA + acumuladorConsumoB + acumuladorConsumoC) / acumuladorIndividual;
            
            System.out.print("\nDeseja inserir mais dados [S]im / [N]ão ? ");
            resposta = entrada.nextLine();
            
        } while (resposta.equalsIgnoreCase("S"));
        
        System.out.println("\n ***********************************************");
        System.out.println("\n            RELATÓRIO DE CONSUMO            ");
        System.out.println("\n ***********************************************");
        System.out.println("\nO MAIOR consumo verificado foi de " + maiorConsumo + " KWh");
        System.out.println("O MENOR consumo verificado foi de " + menorConsumo + " KWh");
        System.out.println("O total de consumo RESIDENCIAL foi de " + acumuladorConsumoA + " KWh");
        System.out.println("O total de consumo COMERCIAL foi de " + acumuladorConsumoB + " KWh");
        System.out.println("O total de consumo INDUSTRIAL foi de " + acumuladorConsumoC + " KWh");
        System.out.println("A MÉDIA GERAL verificada foi de " + df.format(mediaGeral) + " KWh");
    }
    
}
