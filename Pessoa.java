//SuperClasse_Pessoa
package polimorfismo;

/**
 *
 * @author agton
 */
public abstract class Pessoa {
    public abstract void comunicar();
    static void falar(Pessoa p) {
        p.comunicar();
    }
    
    
}
