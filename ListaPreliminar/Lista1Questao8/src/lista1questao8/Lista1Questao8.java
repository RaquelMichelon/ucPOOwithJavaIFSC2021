/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
//        mandou digitar cada mercadoria com o nome, preço de compra preço de venda das mercadorias. Fazer
//        um programa que:
//        • Determine e escreva quantas mercadorias proporcionam:
//        ❖ Lucro menor 10 %;
//        ❖ Lucro entre 10% e 20%;
//        ❖ Lucro maior que 20%.
//        • Determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o
//        lucro total.
        DecimalFormat df = new DecimalFormat("0.00");
        String resposta;
        Scanner entrada = new Scanner(System.in);
        int contadorMenosDez = 0;
        int contadorAteVinte = 0;
        int contadorMaisVinte = 0;
        float somaPrecoCompra = 0.0f;
        float somaPrecoVenda = 0.0f;
        float somaLucro = 0.0f;
        
        do {
            
            System.out.print("Informe o nome da mercadoria: ");
            String nomeMercadoria = entrada.nextLine();
            
            System.out.print("Informe o preço de compra desta mercadoria: R$ ");
            float precoCompra = Float.parseFloat(entrada.nextLine());
            somaPrecoCompra += precoCompra;
            
            System.out.print("Informe o preço de venda desta mercadoria: R$ ");
            float precoVenda = Float.parseFloat(entrada.nextLine());
            somaPrecoVenda += precoVenda;
            
            float lucro = precoVenda - precoCompra;
            somaLucro += lucro;
            float calculoLucro = (precoVenda * 100) / precoCompra;
            float percentualLucro = calculoLucro - 100;
            int percentualLucroInteiro = (int)percentualLucro;
            
            if (percentualLucroInteiro < 10) {
                contadorMenosDez++;
            } else if (percentualLucroInteiro <= 20) {
                contadorAteVinte++;
            } else {
                contadorMaisVinte++;
            }
            
            System.out.print("Deseja digitar dados de mais uma mercadoria? (s/n)");
            resposta = entrada.nextLine();
            

        } while (resposta.equalsIgnoreCase("s"));
        
        System.out.println("\n--------\n");
        System.out.println(contadorMenosDez + " mercadoria(s) apresenta(m) lucro inferior a 10%");
        System.out.println(contadorAteVinte + " mercadoria(s) apresenta(m) lucro entre 10% e 20%");
        System.out.println(contadorMaisVinte + " mercadoria(s) apresenta(m) lucro superior a 20%");
        System.out.println("\n--------");
        System.out.println("\nValor TOTAL de COMPRA: R$" + df.format(somaPrecoCompra));
        System.out.println("Valor TOTAL de VENDA: R$" + df.format(somaPrecoVenda));
        System.out.println("Valor TOTAL de LUCRO: R$" + df.format(somaLucro));
        System.out.println("\n--------");
        
    }
    
}
