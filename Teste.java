//Teste
package Contato;

import java.util.Scanner;

/**
 *
 * @author agton
 */
public class Teste {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean sair = false;
        
        while (!sair) {
            System.out.println("1 - Inserir contato: ");
            System.out.println("2 - Listar contato: ");
            System.out.println("3 - Procurar contato: ");
            System.out.println("4 - Existe contato: ");
            System.out.println("5 - Eliminar contato: ");
            System.out.println("6 - Espaço disponível: ");
            System.out.println("7 - Sair: ");  
            
            try {
                System.out.println("Escolha uma das opções: ");
                opcao = scan.nextInt();
                
                switch (opcao) {
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    case 6:
                    break;
                    case 7: 
                    break;
                    default:System.out.println("Insira números entre 1 e 7 ");
                }
                
                catch (Exception e) {
                        System.out.println("Insira um número: ");
                        scan.next();
                        }
            }
        }
        
        
        
        
        
        
    }
    
}
