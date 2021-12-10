/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplooperadorcondicionalternario;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class ExemploOperadorCondicionalTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();
//        if (idade >= 18) {
//            System.out.println("Maior de idade!");
//        } else {
//            System.out.println("Menor de idade!");
//        }
        
        //operador condicional ternario
        System.out.println("Você é " + (idade >= 18 ? "MAIOR" : "MENOR") + " de idade.");
        
        //fases da vida
        //infancia - zero a 11
        //adolescencia - 12 a 20
        //adulto - 21 a 65
        //idoso - acima de 66
        System.out.println("Sua fase da vida é " 
                + (idade < 12 ? "Infância" : (idade < 20 ? "Adolescência" : (idade < 65 ? "Adulta" : "Velhice" ))));
    }
    
}
