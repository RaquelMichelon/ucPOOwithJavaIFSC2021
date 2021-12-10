/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploassociacao;

import entity.Curso;
import entity.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class ExemploAssociacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        Curso curso1 = new Curso("Tec. Desenvolvimento de Sistemas"); //instanciação de classe - criação dos objetos
        
        //curso1.setNome("Tec. Desenvolvimento de Sistemas");
        curso1.setAreaConhecimento("Ciências Exatas e da Terra");
        curso1.setCargaHoraria(1100);
        
        Curso curso2 = new Curso("Tec em Enfermagem", 1200);
//        curso2.setNome("Tec em Enfermagem");
//        curso2.setAreaConhecimento("Saúde");
        curso2.setCargaHoraria(1200);
        
        Curso curso3 = new Curso("CST em GTI", 2400, "Ciências Exatas e da Terra");
//        curso3.setNome("CST em GTI");
//        curso3.setAreaConhecimento("Ciências Exatas e da Terra");
//        curso3.setCargaHoraria(2400);
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.get(0).setNome("Tec. Subsequente em Desenvolvimento de Sistemas");
        cursos.get(0);
        //veiculo.getModelo().getMarca().getNome();
       /// System.out.println("Situacao da lista: " + cursos.isEmpty());
        if (cursos.isEmpty()) {
            System.out.println("A lista de dados está vazia...");
        } else {
            for (Curso c: cursos) {
                System.out.println("Curso: " + c.getNome());
            }
        }
        
        
        Disciplina disciplina1 = new Disciplina("POO", curso1);
//        disciplina1.setNome("POO");
        disciplina1.setCargaHoraria(160);
//        disciplina1.setCurso(curso1);
        
        
        Disciplina disciplina2 = new Disciplina("BD", curso1, 80);
//        disciplina2.setNome("BD");
//        disciplina2.setCargaHoraria(80);
//        disciplina2.setCurso(curso1);
        
        print(disciplina1);
        print(disciplina2);        
       //print(disciplina3);        
    }
    
    public static void print(Disciplina d) {
        System.out.println("Dados da disciplina");
        System.out.println(d.getDados());
    }
    
}
