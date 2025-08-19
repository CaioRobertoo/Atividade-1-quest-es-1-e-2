public class Livro {
    
    String titulo;
    String autor;
    double preco;

    
    void exibirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preco: R$ " + preco);
    }

   
    void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * porcentagem / 100);
    }
}
