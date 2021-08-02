//Exe04_Aula09_LivroDaBiblioteca
package aula09;


public class Ex04_Aula09 {

    
    public static void main(String[] args) {
        LivroDaBiblioteca livro = new LivroDaBiblioteca();
        
        livro.autor = "Hugo Andrada";
        livro.categoria = "Terrorismo";
        livro.editora = "Abraão";
        livro.nome = "Tetelestai";
        livro.preco = 1;
        livro.estado = true;
        System.out.println(livro.autor);
        System.out.println(livro.categoria);
        System.out.println(livro.editora);
        
        
    }
    
}
