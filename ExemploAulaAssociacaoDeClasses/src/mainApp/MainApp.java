/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import entity.Autor;
import entity.Cidade;
import entity.Editora;
import entity.Livro;

/**
 *
 * @author raqueldarellimichelon
 */
public class MainApp {
    public static void main(String[] args) {
        
        Autor a1 = new Autor();
        a1.nome = "Machado de Assis";
        a1.contato = "noalem@gmail.com";
        
        Autor a2 = new Autor();
        a2.nome = "Clarice Lispector";
        a2.contato = "maisnoalemainda@gmail.com";
        
        Cidade c1 = new Cidade();
        c1.nome = "Rio de Janeiro";
        c1.uf = "RJ";
        
        Cidade c2 = new Cidade();
        c2.nome = "São Paulo";
        c2.uf = "SP";
        
        Editora e1 = new Editora();
        e1.nome = "LPM";
        e1.fone = "0800 644 4001";
        e1.endereco = "Avenida Dom Pedro II, 88";
        e1.cidade = c1;
        
        Editora e2 = new Editora();
        e2.nome = "Editora 34";
        e2.fone = "0200 988 9000";
        e2.endereco = "Avenida Paulista,34";
        e2.cidade = c2;
        
        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.isbn = "8123460182634";
        l1.paginas = 233;
        l1.autor = a1;
        l1.editora = e1;
        
        Livro l2 = new Livro();
        l2.titulo = "Água Viva";
        l2.isbn = "1937938475";
        l2.paginas = 98;
        l2.autor = a2;
        l2.editora = e1;
        
        Livro l3 = new Livro();
        l3.titulo = "De amor e amizade";
        l3.isbn = "1937981734";
        l3.paginas = 79;
        l3.autor = a2;
        l3.editora = e2;
    
//        print(l1);
//        print(l2);
//        print(l3);
        
        System.out.println("Dados do livro \n" + "Título: " 
                + l1.titulo + " \nISBN: " +  l1.isbn + "\nAutor: " 
                + l1.autor.nome + "\n" + l1.paginas + "pg. \nEditora: " 
                + l1.editora.nome);
    }
    
    
    
    private static void print(Livro l) {
        System.out.println(l.getDadosLivro());
    }
}

//sb.append("Cidade......: ").append(nome).append("\n"); Append para evitar concatenação
