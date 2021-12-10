/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

import entity.Categoria;
import entity.Produto;

/**
 *
 * @author mpisching
 */
public class MainApp {
    public static void main(String[] args) {
        Categoria c1 = new Categoria();
        c1.descricao = "Limpeza";
        c1.observacao = "Produto utilizado para limpeza";
        Categoria c2 = new Categoria();
        c2.descricao = "Bebidas";
        c2.observacao = "qualquer coisa";
        Categoria c3 = new Categoria();
        c3.descricao = "Higiene";
        c3.observacao = "Produto de higiene";
        
        System.out.println(c1.getDados());
        System.out.println(c2.getDados());
        
        Produto p1 = new Produto();
        p1.codigo = 1000;
        p1.nome = "Refrigerante";
        p1.valor = 4.00;
        p1.categoria = c2;
        Produto p2 = new Produto();
        p2.codigo = 1001;
        p2.nome = "Suco de uva";
        p2.valor = 11.00;
        p2.categoria = c2;
        Produto p3 = new Produto();
        p3.codigo = 1002;
        p3.nome = "Detergente";
        p3.valor = 2.00;
        p3.categoria = c1;
        Produto p4 = new Produto();
        p4.codigo = 1003;
        p4.nome = "Agua sanitária";
        p4.valor = 5.00;
        p4.categoria = c1;
        Produto p5 = new Produto();
        p5.codigo = 1004;
        p5.nome = "Sabonete";
        p5.valor = 3.00;
        p5.categoria = c3;
        
        print(p1);
        print(p2);
        print(p3);
        print(p4);
        print(p5);
        
    }
    
    private static void print(Produto p) {
        System.out.println(p.getDados(false));
        System.out.println("Categoria: " + p.categoria.descricao);
    }
}
