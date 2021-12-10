package meuslivros;

public class Cidade {
    public String nome;
    public String uf;
    
    public String getDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cidade.......: ").append(nome).append("\n");
        sb.append("Estado.....: ").append(uf).append("\n");
        return sb.toString();
    }
}
