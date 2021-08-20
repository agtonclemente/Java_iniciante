
package InterFaceEx;

/**
 *
 * @author agton
 */
public class Prato extends Comida implements Inter1{

    @Override
    public void comunicar() {
        System.out.println("Delicioso!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
