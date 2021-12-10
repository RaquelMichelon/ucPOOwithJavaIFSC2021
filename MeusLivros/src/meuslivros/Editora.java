package meuslivros;

public class Editora {
    public String nome;
    public String telefone;
    public String endereco;
    public Cidade cidade;
    
    public String getDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("Editora....: " + nome).append("\n");
        sb.append("Telefone...: " + telefone).append("\n");
        sb.append("Endereço...: " + endereco).append("\n");
        sb.append(cidade.getDados()).append("\n");
        return sb.toString();
    }
}
