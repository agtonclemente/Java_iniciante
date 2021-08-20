
package InterFaceEx;

/**
 *
 * @author agton
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prato p1 = new Prato();
        Pessoa.falar(p1);
        
        Sobremesa s = new Sobremesa();
        Pessoa.falar(s);
        
         /*polimorfismo.Mulher m1 = new polimorfismo.Mulher();
        polimorfismo.Pessoa.falar(m1);

        polimorfismo.Homem h1 = new polimorfismo.Homem();
        polimorfismo.Pessoa.falar(h1);

        polimorfismo.Crianca c = new polimorfismo.Crianca();
        polimorfismo.Pessoa.falar(c);*/
        
    }
    
}
