//Aula_14_Heranca_Java
package aula14;

/**
 *
 * @author agton
 */
public class Aula14 {
    public static void main(String[] args) {
        //Empregado empregado = new Empregado();
        Comercial cl = new Comercial(10, "Agton", 41, 2000);
        String Zé = null;
        Distribuidor dl = new Distribuidor ("Zona 1 ", Zé, 23, 1220);
        
        cl.plus();
        dl.plus();
        System.out.println(cl);
        System.out.println(dl);
    
    
    
    
    }
    
}
