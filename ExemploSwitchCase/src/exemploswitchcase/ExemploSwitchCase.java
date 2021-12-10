/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploswitchcase;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class ExemploSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // avaliar condicoes do tipo char ou inteiros (byte, int, short, long)
        
        //dado o numero do mes, o programa exibe o mes por extenso
        
        Scanner entrada = new Scanner(System.in);
        int mes;
        
        do {
            System.out.println("Informe o mes em formato numerico: ");
            mes = entrada.nextInt();
            switch (mes) {
            case 1: 
                System.out.println("Janeiro"); 
                break;
            case 2: 
                System.out.println("Fevereiro"); 
                break;
            case 3: 
                System.out.println("Março"); 
                break;
            case 4: 
                System.out.println("Abril"); 
                break; 
            case 5: 
                System.out.println("Maio"); 
                break;
            case 6: 
                System.out.println("Junho"); 
                break;
            case 7: 
                System.out.println("Julho"); 
                break;  
            case 8: 
                System.out.println("Agosto"); 
                break;
            case 9: 
                System.out.println("Setembro"); 
                break;
            case 10: 
                System.out.println("Outubro"); 
                break;
            case 11: 
                System.out.println("Novembro"); 
                break;
            case 12: 
                System.out.println("Dezembro"); 
                break;
            default: 
                System.out.println("Mês informado é inválido!");
            }
            
        } while(mes > 1 || mes < 12);
    
    }
    
}
