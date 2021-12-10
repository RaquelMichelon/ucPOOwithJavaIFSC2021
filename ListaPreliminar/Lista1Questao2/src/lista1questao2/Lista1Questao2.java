/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao2;

import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um aplicativo em Java que lê uma entrada do usuário definindo o raio de um círculo e que imprime
//        o diâmetro, a circunferência e a área do círculo. Utilize o valor constante 3,14159 para  (PI). Nota: você
//        também pode utilizar a constante Math.PI predefinida para o valor de . Essa constante é mais precisa
//        que o valor 3,14159. A classe Math é definida no pacote java.lang. Utilize as seguintes fórmulas (onde r
//        é o raio): diâmetro = 2 * r, circunferência = 2 * r, área =  * r2
           

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        
        float raio = entrada.nextFloat();
        
        float diametro = 2 * raio;
        float pi = (float) Math.PI; //converter o pi que eh do tipo double para float
        float circunferencia = (2 * pi) * raio;
        float area = pi * (raio * raio);
        
        System.out.println("Dado o raio informado... \n DIÂMETRO do círculo: " + diametro 
                + "\n Valor da CIRCUNFERÊNCIA: " + circunferencia 
                + "\n ÁREA: " + area);
        
    }
    
}
