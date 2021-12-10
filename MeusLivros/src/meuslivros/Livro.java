package meuslivros;

public class Livro {
    public String titulo;
    public int paginas;
    public String isbn;
    public Autor autor;
    public Editora editora;
    
    public String getDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("Título......: ").append(titulo).append("\n");
        sb.append("Páginas.....: ").append(paginas).append("\n");
        sb.append("ISBN........: ").append(isbn).append("\n");
        sb.append(autor.getDados()).append("\n");
        sb.append(editora.getDados()).append("\n");
        return sb.toString();
    }
}
