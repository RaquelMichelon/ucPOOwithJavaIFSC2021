/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploentradadados;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raqueldarellimichelon
 */
public class ExemploEntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        System.out.print("Informe o seu nome: ");
        nome = entrada.nextLine();
        
        int idade;
        //System.out.print("Informe a sua idade: ");
        //idade = Integer.parseInt(entrada.nextLine()); //em vez de entrada.nextInt()
        
        float salario;
        System.out.print("Informe a sua renda: ");
        salario = Float.parseFloat(entrada.nextLine()); //em vez de entrada.nextFloat()
        
        //JOptionPane
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe novamente a idade: "));
        
        
        System.out.println("**** Dados do usuário ****");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Renda: " + salario);
        
        
    }
    
}
