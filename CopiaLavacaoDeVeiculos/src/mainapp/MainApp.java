/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

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
        Marca marca1 = new Marca();
        Modelo modelo1 = new Modelo();
        Veiculo veiculo1 = new Veiculo();
        
        System.out.println("*** LAVAÇÃO DE VEÍCULOS ***");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID da marca: ");
        marca1.setIdMarca(Integer.parseInt(entrada.next()));
        
        System.out.println("Digite o nome da marca: ");
        marca1.setNome(entrada.next());

        System.out.println("Digite o Id do Modelo: ");
        modelo1.setIdModelo(Integer.parseInt(entrada.next()));
        
        System.out.println("Digite a descrição do modelo: ");
        modelo1.setDescricao(entrada.next());
        
        modelo1.setMarca(marca1);
        
        System.out.println("Digite o Id do Veiculo: ");
        veiculo1.setIdVeiculo(Integer.parseInt(entrada.next()));
        
        System.out.println("Digite a placa do Veículo: ");
        veiculo1.setPlaca(entrada.next());

        veiculo1.setModelo(modelo1);

        System.out.println("\n\n**** Dados do veículo ****\n" + veiculo1.getDados() + "\n");

    }
    
    public static void cadastrarMarca(int idMarca, String nome) {
        
    }
    
}
