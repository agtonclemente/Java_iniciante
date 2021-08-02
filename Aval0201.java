//Avaliação_Idade_Turma
package aula11;

/**
 *
 * @author agton
 */
import  java.util.Scanner ;
public class Aval0201 {

    
    public static void main(String[] args) {
        
        Scanner entrada =  new  Scanner (System.in);
        
        int idade, cont;
        
        Sistema.out.println(" Digite uma idade: ");
        idade = entrada.nextInt();

        if (idade > 60) {
            System.out.println("Idosa.");
        }
        if ((idade > = 0) && (idade <= 25)) {
            System.out.println("Jovem.");

        }

        if ((idade >= 26) && (idade <= 60)) {
             System.out.println("Adulta.");
        }
        
           
            
           
    }
    
}
