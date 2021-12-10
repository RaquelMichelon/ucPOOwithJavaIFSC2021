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
public class Produto {
    public int codigo;
    public String nome;
    public double valor;
    public Categoria categoria;//associação de classes
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código......: ").append(codigo).append("\n");
        sb.append("Nome........: ").append(nome).append("\n");
        sb.append("Valor.......: ").append(valor).append("\n");
        sb.append(categoria.getDados()).append("\n");
        return sb.toString();
    }
    
    public String getDados(boolean obs) {
        if (obs) {
            return getDados();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Código......: ").append(codigo).append("\n");
            sb.append("Nome........: ").append(nome).append("\n");
            sb.append("Valor.......: ").append(valor).append("\n");
            sb.append("Categoria...: ").append(categoria.descricao).append("\n");
            return sb.toString();
        }
    }
}
