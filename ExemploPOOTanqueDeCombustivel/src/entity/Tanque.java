/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mpisching
 */
public class Tanque {
    private int capacidade;
    private String fabricante;
    private String material;
    private int reserva;
    private int quantidadeAtual;
    
    public int obterCapacidade() {
        return capacidade;
    }
    
    public void definirCapacidade(int c) {
        capacidade = c;
    } 
    
    public void definirReserva(int r) {
        reserva = r;
    }
    
    public int obterReserva() {
        return reserva;
    }
    
    public int obterQuantidadeAtual() {
        return quantidadeAtual;
    }
    
    public void abastecer(int qtd) {
        //this.quantidadeAtual = this.quantidadeAtual + qtd;
        
        if ((quantidadeAtual + qtd) > capacidade) {
            System.out.println("a quantidade é superior a capacidade do tanque");
        } else {
            this.quantidadeAtual += qtd;
        }
    }
    
    public void consumir(int qtd) {
        
        if ((quantidadeAtual - qtd) < 0) {
            System.out.println("não há combustível suficiente");
        } else {
            this.quantidadeAtual -= qtd;
        }
    }
    
    /**
     * O método getDados retorna as informações dos atributos capacidade, reserva e qtdAtual....
     * @return 
     */
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Capacidade.....: ").append(capacidade).append("\n");
        sb.append("Reserva........: ").append(reserva).append("\n");
        sb.append("Qtd Atual......: ").append(quantidadeAtual).append("\n");
        return sb.toString();
    }
}
