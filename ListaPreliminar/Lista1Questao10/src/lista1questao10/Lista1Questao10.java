/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1questao10;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class Lista1Questao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        10. Uma Universidade deseja fazer um levantamento a respeito de seu concurso vestibular. Para cada curso
//        é fornecido o seguinte conjunto de valores:
//        • Um código do curso;
//        • Número de vagas;
//        • Número de candidatos do sexo masculino;
//        • Número de candidatos do sexo feminino.
//        Fazer um programa que:
//        • Calcule e escreva, para cada curso, o número de candidatos por vaga e a percentagem de
//        candidatos do sexo feminino (escreva também o código correspondente do curso);
//        • Determine o maior número de candidatos por vaga e escreva esse número juntamente com o código
//        do curso correspondente (supor que não haja empate);
//        • Calcule e escreva o total de candidatos.
          DecimalFormat df = new DecimalFormat("0.00");
          System.out.println("***** RESULTADOS VESTIBULAR *****");
          String resposta;
          Scanner entrada = new Scanner(System.in);
          float maiorCandidatoVaga = Float.MIN_VALUE;
          int codigoMaiorCandidatoVaga = 0;
          int totalCandidatos = 0;
          
          do {
              
              System.out.print("\n\nInforme o nome do curso: ");
              String nomeCurso = entrada.nextLine();
              
              System.out.print("Informe o código do curso de " + nomeCurso + ": [apenas números] ");
              int codigoCurso = Integer.parseInt(entrada.nextLine());
              
              System.out.print("Informe o número de vagas do curso " + nomeCurso + ": ");
              int numeroVagasCurso = Integer.parseInt(entrada.nextLine());
              
              System.out.print("Informe o número de candidatos MASCULINOS do curso " + nomeCurso + ": ");
              int candidatosMasc = Integer.parseInt(entrada.nextLine());
              
              System.out.print("Informe o número de candidatos FEMININOS do curso " + nomeCurso + ": ");
              int candidatosFem = Integer.parseInt(entrada.nextLine());
              
              int totalCandidatosCurso = candidatosFem + candidatosMasc;
              float candidatosPorVaga = totalCandidatosCurso / numeroVagasCurso;
              float percentualFem = (candidatosFem * 100) / totalCandidatosCurso;
              
              System.out.println("\n ***********************************************");
              System.out.println("\nCódigo do Curso: " + codigoCurso);
              System.out.println("Número de candidatos por vaga do curso " + nomeCurso + " é: " + df.format(candidatosPorVaga));
              System.out.println("O percentual de candidatos femininos para o curso " + nomeCurso + " é: " + df.format(percentualFem) + "%");
              
              if (candidatosPorVaga > maiorCandidatoVaga) {
                  maiorCandidatoVaga = candidatosPorVaga;
                  codigoMaiorCandidatoVaga = codigoCurso;
              }
              
              totalCandidatos += totalCandidatosCurso;

              System.out.print("\n\nDeseja digitar dados de mais um curso? [S]im/[N]ão: ");
              resposta = entrada.nextLine();
            

        } while (resposta.equalsIgnoreCase("s"));
          
          System.out.println("\n ***********************************************");
          System.out.println("\n RESUMO DO VESTIBULAR");
          System.out.println("\n ***** Curso com maior candidato por vaga *****");
          System.out.println("Código do curso:" + codigoMaiorCandidatoVaga);
          System.out.println("Relação candidato/vaga: " + df.format(maiorCandidatoVaga));
          System.out.println("\n ***********************************************");
          System.out.println("\nTOTAL DE CANDIDATOS INSCRITOS NO VESTIBULAR: " + totalCandidatos);
          System.out.println("\n ***********************************************");

          

    }
    
}
