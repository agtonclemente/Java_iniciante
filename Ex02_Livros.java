//Ex02_Aula02_Classes_Livros
package aula09;

public class Ex02_Livros {

    
    public static void main(String[] args) {
        Livros livro = new Livros();
        
        livro.anoPublicacao = 2021;
        livro.autor = "Salomão";
        livro.editora = "Júpter Editora";
        livro.numPaginas = 200555;
        livro.preco = 500;
        livro.titulo = "As Palavras Nunca Ditas";
        
        System.out.println(livro.anoPublicacao);
        System.out.println(livro.autor);
        System.out.println(livro.editora);
        System.out.println(livro.numPaginas);
        System.out.println(livro.preco);
        System.out.println(livro.titulo);
        
    }
    
}
