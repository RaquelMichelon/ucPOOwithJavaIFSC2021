/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao7;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Desenvolva um aplicativo Java que determine o salário bruto de cada um de n empregados. A empresa
//        paga “hora normal” pelas primeiras 40 horas trabalhadas por cada empregado e “horas extras” com 50%
//        de gratificação para todas as horas trabalhadas além de 40 horas. Você recebe uma relação dos
//        empregados da empresa, o número de horas trabalhadas por cada empregado na última semana e o
//        salário-hora de cada empregado. Seu programa deve ler essas informações para cada empregado e deve
//        determinar e exibir o salário bruto do empregado. Utilize diálogo para entrada dos dados. O programa deve
//        finalizar quando todos os cálculos forem realizados, mostrando o total pago em salário para todos os
//        empregados.
        DecimalFormat df = new DecimalFormat("0.00");

        String resposta;
        double totalSalarioBruto = 0.0;
        
        do {
            String nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        
            int horasTrabalhadas = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas por " + nome + ": "));
            
            float salarioPorHora = Float.parseFloat(
                        JOptionPane.showInputDialog("Informe o valor do salário por hora de " + nome + ": "));
            
            float calculoSalario = horasTrabalhadas * salarioPorHora;
            
            if (horasTrabalhadas > 40) {
                int horaExtra = horasTrabalhadas - 40;
                double calculoSalarioExtra = horaExtra * (salarioPorHora * 0.50);
                calculoSalario += calculoSalarioExtra;
            }
            
            totalSalarioBruto += calculoSalario;
            
            JOptionPane.showMessageDialog(null, "O salário bruto da semana do(a) funcionário(a) " + nome + " é de: R$" + df.format(calculoSalario));

                        
            resposta = JOptionPane.showInputDialog("Deseja digitar dados de um novo funcionário? (s/n)");
            

        } while (resposta.equalsIgnoreCase("s"));
        
//        System.out.println("\n--------");
//        System.out.println("\nO TOTAL PAGO EM SALÁRIO FOI DE: R$" + df.format(totalSalarioBruto));
//        System.out.println("\n--------");
        
        JOptionPane.showMessageDialog(null, "\nO TOTAL PAGO EM SALÁRIO FOI DE: R$" + df.format(totalSalarioBruto));
    }
    
}
