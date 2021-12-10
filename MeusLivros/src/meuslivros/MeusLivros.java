package meuslivros;

public class MeusLivros {

    public static void main(String[] args) {
        Autor  a1 = new Autor();
        a1.nome = "João Velasquez";
        a1.contato = "joao@livro.com";
        
        Cidade cidade1 = new Cidade();
        cidade1.nome = "Brunópolis";
        cidade1.uf = "Santa Catarina";
        
        Editora editora1 = new Editora();
        editora1.nome = "Publicações Clássicas";
        editora1.telefone = "5548999887766";
        editora1.endereco = "Avenida Rio Branco, 166";
        editora1.cidade = cidade1;
        
        Livro livro1 = new Livro();
        livro1.titulo = "A felicidade existe?";
        livro1.paginas = 132;
        livro1.isbn = "978-3-16-148410-0";
        livro1.autor = a1;
        livro1.editora = editora1;
        
        print(livro1);
    }
    
    public static void print(Livro l){
        System.out.println(l.getDados());
    }
}
