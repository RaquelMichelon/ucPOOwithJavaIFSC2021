package meuslivros;

public class Autor {
    public String nome;
    public String contato;
    
    public String getDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor......: " + nome).append("\n");
        sb.append("Contato....: " + contato).append("\n");
        return sb.toString();
    }
}
