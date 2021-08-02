//NomeUtilizadorSenha
package aula06;

import java.util.Scanner;


public class NomeUtilizadorSenha {

    
    public static void main(String[] args) {
        boolean infoValidas = false;
        String nomeUser;
        String senha;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Nome de utilizador: ");
            nomeUser = input.next();
            System.out.println("Senha: ");
            senha = input.next();
            if (nomeUser.equals(senha)) {
                System.out.println("Senha igual ao nome de utilizador, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e nome de utilizador válidos.");
            }
            
        } while (!infoValidas);
        
    }
    
}
