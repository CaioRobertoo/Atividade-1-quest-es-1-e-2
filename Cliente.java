public class Cliente {
    String nome;
    String email;
    String telefone;

    
    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    
    void comprarLivro(String titulo) {
        System.out.println(nome + " comprou o livro: " + titulo);
    }
}
