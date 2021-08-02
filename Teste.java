//Exe02_Aula14
package Exe02Heranca;

/**
 *
 * @author agton
 */
public class Teste {

    
    public static void main(String[] args) {
        //double total = 0;
        Produto[] produtos = new Produto[3];
        
        produtos[0] = new Produto("Produto 1", 10);
        produtos[1] = new Peresivel("Produto 2", 20);
        produtos[2] = new NaoPeresivel("Produto 3", 5);
        double total = 0;
        for(int i=0; i < produtos.length; i++) {
            total += produtos[i].clacular(5);
        }
        System.out.println("O total é: " + total);
        
    }
    
}
