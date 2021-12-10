/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mpisc
 */

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String areaConhecimento;

    /**
     * método construtor padrão - criado automaticamente
     * mas, tem exceções...
     */
//    public Curso() {
//        this.nome = null;
//        this.cargaHoraria = 0;
//        this.areaConhecimento = null;
//    }
    
    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(String nome, int cargaHoraria, String areaConhecimento) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.areaConhecimento = areaConhecimento;
    }

    
    /**
     * Método que retorna o valor do atributo nome
     * @return String
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }
    
    
}
