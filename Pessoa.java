//SuperClasse_Pessoa
package InterFaceEx;

import polimorfismo.*;

/**
 *
 * @author agton
 */
public abstract class Pessoa implements Inter1{

    static void falar(Prato p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void falar(Sobremesa s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public abstract void comunicar();
    static void falar(Pessoa p) {
        p.comunicar();
    }
    
    
}
