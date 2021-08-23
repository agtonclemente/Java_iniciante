/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheiros;

import java.io.File;

/**
 *
 * @author agton
 */
public class ApagarFich {
    String nomeFicheiro = "C:" + File.pathSeparator + "teste.txt";

    File fich = new File(nomeFicheiro);
    boolean existe = fich.exists();
    if (existe) {
            System.out.println("o ficheiro existe");
    }

    
        else{
            System.out.println("o ficheiro não existe");
    }
    if (existe) {
    fich.delete();
        System.out.println("Ficheiro" + fich.getPath() + "foi eliminado");
    }
    //System.out.println(nomeFicheiro + "existe?" + fich.exists());
        
}
