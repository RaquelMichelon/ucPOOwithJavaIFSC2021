/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public class Livro {
    
    public String titulo;
    public int paginas;
    public String isbn;
    
    public Autor autor;
    public Editora editora;
    
    
    public String getDadosLivro() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título......: ").append(titulo).append("\n");
        sb.append("Autor........: ").append(autor.nome).append("\n");
        sb.append("Editora.......: ").append(editora.nome).append("\n");
        sb.append("Cidade.......: ").append(editora.cidade.nome).append("\n");
        sb.append("N. de Páginas.......: ").append(paginas).append("\n");
        sb.append("ISBN.......: ").append(isbn).append("\n");
        return sb.toString();
    }
    
}
