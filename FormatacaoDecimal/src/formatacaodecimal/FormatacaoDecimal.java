/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formatacaodecimal;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class FormatacaoDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Idade: ");
        int idade = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();

        
        System.out.print("Número: ");
        int numero = Integer.parseInt(entrada.nextLine());

        
        System.out.print("Renda: ");
        float renda = Float.parseFloat(entrada.nextLine());
        
        System.out.println("Despesas do mês: ");
        float despesas = 0.0F;
        try {
            despesas = df.parse(entrada.nextLine()).floatValue();
        } catch (ParseException ex) {
            System.out.println("Entrada de dados inválida: formato correto 9.999,99");
        }
        
        System.out.println("Nome: " + nome + "\tIdade: " + idade + "\tEndereço: " + endereco + "\tNúmero: " + numero + "\tRenda: " + df.format(renda));
        System.out.println("\tOperação: " + df.format(idade + numero));
        System.out.println("\tUso do float com entrada formatada: " + despesas);

    }
    
}
