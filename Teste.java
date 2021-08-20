
package polimorfismo;

/**
 *
 * @author agton
 */
public class Teste {

    public static void main(String[] args) {
        Mulher m1 = new Mulher();
        Pessoa.falar(m1);
        
        Homem h1 = new Homem();
        Pessoa.falar(h1);
        
        Crianca c = new Crianca();
        Pessoa.falar(c);
        
        
    }
    
}
