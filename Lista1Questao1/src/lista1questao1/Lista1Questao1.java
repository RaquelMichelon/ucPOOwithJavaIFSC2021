/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Escreva um aplicativo em Java que lê três inteiros digitados pelo usuário e exibe a soma, a média, o
//        produto, o maior e o menor desses números em um diálogo de mensagem de informação. Nota: o cálculo
//        da média nesse exercício deve resultar em uma representação da média na forma de inteiro. Então, se a
//        soma dos valores é 7, a média será 2 e não 2,3333..
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Digite o segundo número: ");
        int n2 = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Digite o terceiro número: ");
        int n3 = Integer.parseInt(entrada.nextLine());
        
        int soma = n1 + n2 + n3;
        int media = soma / 3;
        int produto = n1 * n2 * n3;
        
        //na condicao, mantive > ou = para o caso de aparecerem um ou mais numeros repetidos
        int maior = (n1 >= n2 && n1 >= n3 ? n1 : (n2 >= n3 && n2 >= n1 ? n2 : n3));
        int menor = (n1 <= n2 && n1 <= n3 ? n1 : (n2 <= n3 && n2 <= n1 ? n2 : n3));

        JOptionPane.showMessageDialog(null, "A soma dos três números informados é: " + soma 
                + "; \n A média dos três números informados é: " + media 
                + "; \n O produto dos três números informados é: " + produto 
                + "; \n O maior número informado foi: " + maior 
                + "; \n O menor número informado foi: " + menor + ";");

    }
    
}
