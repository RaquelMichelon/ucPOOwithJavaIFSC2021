/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploinstrucoescondicionaisimc;

import javax.swing.JOptionPane;

/**
 *
 * @author raqueldarellimichelon
 */
public class ExemploInstrucoesCondicionaisImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o seu nome: "); // esse nao precisa fazer parse, pois retorna uma string e o nome eh uma string
        
        float peso = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o seu peso: "));
        
        float altura = Float.parseFloat(
                JOptionPane.showInputDialog("Informe a sua altura: "));
        
        float imc = peso / (altura * altura);
        
        //JOptionPane.showMessageDialog(null, nome + " seu IMC é " + imc);
        
        

        //classificacao do IMC
        String classificacao = "";
        
//        if (imc < 16) {
//            classificacao = "Magreza grave";
//        } else if (imc < 17) {
//            classificacao = "Magreza moderada";
//        } else if (imc < 18.5) {
//            classificacao = "Magreza leve";
//        } else if (imc < 25) {
//            classificacao = "Saudável";
//        } else if (imc < 30) {
//            classificacao = "Sobrepeso";
//        } else if (imc < 35) {
//            classificacao = "Obesidade Grau I";
//        } else if (imc < 40) {
//            classificacao = "Obesidade Grau II";
//        } else {
//            classificacao = "Obesidade Grau III";
//        }

        //else if mais enxuto sem as chaves --> pq cada condicao soh tem uma instrucao a ser executada
        
        if (imc < 16)           classificacao = "Magreza grave";
        else if (imc < 17)      classificacao = "Magreza moderada";
        else if (imc < 18.5)    classificacao = "Magreza leve";
        else if (imc < 25)      classificacao = "Saudável";
        else if (imc < 30)      classificacao = "Sobrepeso";
        else if (imc < 35)      classificacao = "Obesidade Grau I";
        else if (imc < 40)       classificacao = "Obesidade Grau II";
        else                    classificacao = "Obesidade Grau III";
        
        
        JOptionPane.showMessageDialog(null, nome + ", seu IMC é " + Math.round(imc) + "\n "
                + "e a classificação é: " + classificacao);

        //Switch case ... escolha caso
        //ver em outro projeto
      
        
    }
    
}
