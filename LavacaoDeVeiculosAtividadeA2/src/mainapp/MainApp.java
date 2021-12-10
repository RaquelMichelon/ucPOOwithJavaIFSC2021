/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.Veiculo;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("*** LAVAÇÃO DE VEÍCULOS ***\n");

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Digite o nome da marca: ");
        Marca marca1 = new Marca(entrada.nextLine());
        marca1.setIdMarca(1);
        

        System.out.print("Digite o modelo do veículo: ");
        Modelo modelo1 = new Modelo(entrada.nextLine(), marca1);
        modelo1.setIdModelo(1);
        
        
        System.out.print("Digite a cor do Veículo: ");
        Cor cor1 = new Cor(entrada.nextLine());
        cor1.setIdCor(1);
        
                
        System.out.print("Digite a placa do Veículo: ");
        Veiculo veiculo1 = new Veiculo(entrada.nextLine(), modelo1);
        veiculo1.setIdVeiculo(1);
        veiculo1.setCor(cor1);
        System.out.print("Digite as observações sobre o Veículo: ");
        veiculo1.setObservacoes(entrada.nextLine());


        System.out.println("\n\n**** Dados do veículo ****\n" + veiculo1.getDados() + "\n");
        
        
        System.out.print("Digite o nome da marca: ");
        Marca marca2 = new Marca(entrada.nextLine());
        marca2.setIdMarca(2);
        

        System.out.print("Digite o modelo do veículo: ");
        Modelo modelo2 = new Modelo(entrada.nextLine(), marca2);
        modelo2.setIdModelo(2);
        
        
        System.out.print("Digite a cor do Veículo: ");
        Cor cor2 = new Cor(entrada.nextLine());
        cor2.setIdCor(2);
        
                
        System.out.print("Digite a placa do Veículo: ");
        Veiculo veiculo2 = new Veiculo(entrada.nextLine(), modelo2);
        veiculo2.setIdVeiculo(2);
        veiculo2.setCor(cor2);
        System.out.print("Digite as observações sobre o Veículo: ");
        veiculo2.setObservacoes(entrada.nextLine());


        System.out.println("\n\n**** Dados do veículo ****\n" + veiculo2.getDados() + "\n");

    }
    
}
