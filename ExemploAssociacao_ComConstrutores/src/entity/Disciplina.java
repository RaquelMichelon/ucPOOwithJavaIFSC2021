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
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Curso curso;//associação de classe
    
    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }
    
    public Disciplina(String nome, Curso curso, int cargaHoraria) {
        this.nome = nome;
        this.curso = curso;
        this.cargaHoraria = cargaHoraria;
    }

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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Carga horaria: ").append(cargaHoraria).append("\n");
        sb.append("Curso: ").append(curso.getNome());
        return sb.toString();
    }
}
