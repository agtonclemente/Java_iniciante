//Enviar_Formadora_Celina
package aula08;
import java.util.Scanner;

public class ExEnviarCelina {

    
    public static void main(String[] args) {
        double milhas;
        double km = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira as milhas: ");
        milhas = scan.nextDouble();
        
        milhas = 1.609 * km;
        
        
        System.out.printf("Quilómetros em milhas: " + km);
        System.out.println();
        double milhasNauticas = 1.852 * km;
        System.out.println("Quilómetro em milhas náuticas: " + milhasNauticas);
        System.out.println("12.09 milhas náuticas corresponde a 22.224 km");
        
                
        
       
    }
    
}
