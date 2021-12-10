/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisching
 */
public class Categoria {
    public String descricao;
    public String observacao;
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Categoria..: " + descricao).append("\n");
        sb.append("Observacao.: " + observacao).append("\n");
        return sb.toString();
    }
}
