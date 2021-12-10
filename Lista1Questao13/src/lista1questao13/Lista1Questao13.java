/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao13 {
    public static DecimalFormat df = new DecimalFormat("0.00");
    public static Scanner entrada = new Scanner(System.in);
    public static String resposta;
    public static long diferenca;
    public static double taxaEstacionamento;
    public static double totalRecibos = 0.0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Um estacionamento cobra uma taxa mínima de R$ 2,00 para estacionar por até três horas. Um adicional
//        de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A taxa máxima
//        para qualquer dado período de 24 horas é R$ 10,00. Pressuponha que nenhum carro fica estacionado por
//        mais de 24 horas por vez. Escreva um programa que calcula e exibe a taxa de estacionamento para cada
//        cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos. O
//        programa deve utilizar o método calcularTaxa para determinar a taxa para cada cliente.
        System.out.println("***** CÁLCULO DE TAXA ESTACIONAMENTO *****");
        do {
            System.out.print("\nInforme o horário de ENTRADA do cliente no estacionamento [hh:mm:ss]: ");
            String horaEntrada = entrada.next();
            System.out.print("\nInforme o horário de SAÍDA do cliente no estacionamento [hh:mm:ss]: ");
            String horaSaida = entrada.next();

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            try {
                Date hora1 = sdf.parse(horaEntrada); //o metodo parse tem a possibilidade de lançar uma exceção
                Date hora2 = sdf.parse(horaSaida);
                diferenca = hora2.getTime() - hora1.getTime();
                
                calcularTaxa(diferenca);
            
                totalRecibos += taxaEstacionamento;
  
            } catch (Exception e) {
                System.out.println("Os dados informados estão em formato inválido! Tente novamente!"  );;
            }
            

            System.out.print("\nDeseja inserir dados para novo cálculo [S]im / [N]ão ? ");
            resposta = entrada.next();
            
        } while (resposta.equalsIgnoreCase("S"));
        
        System.out.println("\n ***********************************************");
        System.out.println("\nO valor total dos recibos foi de R$ " + df.format(totalRecibos));    
        System.out.println("\n ***********************************************");
    }
    
    /**
     * Metodo para calcular taxa a ser paga de acordo com quantidade de horas no estacionamento
     * @param diferenca 
     */
    public static void calcularTaxa(long diferenca) {
        //caso haja virada de um dia para outro
        if (diferenca < 0) {
            long ajustaHora = 24 - (diferenca / -3600000);
            diferenca = ajustaHora * 3600000;
        }
        
        if (diferenca <= 10800000) {
                //ate 3h taxa de 2 reais
                taxaEstacionamento = 2;
            } else {
                //acima de 3h
                long horaExtra = (diferenca - 10800000) / 3600000;
                taxaEstacionamento = 2 + (horaExtra * 0.50);

                if (taxaEstacionamento > 10) {
                    //valor maximo cobrado ao dia
                    taxaEstacionamento = 10;
                }    
            }
        System.out.println("\n ***********************************************");
        System.out.println("\nTaxa de estacionamento: R$ " + df.format(taxaEstacionamento));
        System.out.println("\n ***********************************************");
    }
   
}
