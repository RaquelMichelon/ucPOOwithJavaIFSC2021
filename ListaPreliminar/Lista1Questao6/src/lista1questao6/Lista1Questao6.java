/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao6;

import javax.swing.JOptionPane;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a
        //quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que
        //receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
        //para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada
        //tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos
        //até esse ponto. Todos os cálculos de médias devem produzir resultados de ponto flutuante. Utilize um
        //diálogo de entrada para obter os dados do usuário.
        
        int quilometragemAcumulada = 0;
        int litrosGasolina;
        int consumoGasolina = 0;
        String resposta = "s";
        float kmPorLitro;
        
        do {
            int quilometragem = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe a quilometragem dirigida: "));
        
            litrosGasolina = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe os litros de gasolina consumidos para cada tanque cheio: "));
            
            consumoGasolina += litrosGasolina;
            
            kmPorLitro = quilometragem / litrosGasolina;
            
            JOptionPane.showMessageDialog(null, "\nO consumo para um tanque cheio foi de: " + kmPorLitro + " Km/l");
            
            quilometragemAcumulada += quilometragem;
                        
            resposta = JOptionPane.showInputDialog("Deseja digitar dados de um novo monitoramento? (s/n)");
            

        } while (resposta.equalsIgnoreCase("s"));
        
        
        JOptionPane.showMessageDialog(null, "\nA quilometragem Total rodada foi de: " 
                + quilometragemAcumulada + " Km." + "\nA soma total de litros de combustível consumidos foi de: " 
                + consumoGasolina + " litros de gasolina.");
    }
    
}
