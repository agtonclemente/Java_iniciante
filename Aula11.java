//Aula_11_Exe_Avaliação02_Fundamentos
package aula11;

/**
 *
 * @author agton
 */
import java.io.InputStream;
import java.util.Scanner;
import java.util.Calendar;
public class Aula11 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        int altura, peso;
        double imc, altura;
        
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        Calendar calendario = Calendar.getInstance();
        ano_atual = calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        System.out.println("Digite o endereco:");
        endereco = entrada.next();
        System.out.println("Digite seu telefone:");
        telefone = entrada.nextInt();
        System.out.println("Para calcular o IMC, digite sua altura:");
        altura = entrada.nextFloat();
        System.out.println("Para calcular o IMC, digite seu peso");
        peso = entrada.nextInt();
        imc = peso / (altura * 2);
        System.out.printf("Sua idade" + idade + "\ n");
        System.out.printf("Voce nasceu em" + ano_nascimento + "\ n");
        System.out.printf("Voce mora em" + endereco + "\ n");
        System.out.printf("Seu telefone" + telefone + "\ n");
        System.out.printf("Resultado do calculo IMC:" + imc + "\ n");
        if (imc < 18,5)
            System.out.println("Abaixo do peso ideal, vamos melhorar!");
        senão
        if ((imc > 18,5) && (imc<
        24,9))
                System.out.println("Voce esta no peso ideal, parabens!");
        senão
        if ((imc > 25,0) && (imc<
        29,9))
                    System.out.println("Voce está com excesso de peso, vamos melhorar!");
        senão
        if ((imc > 30,0) && (imc<
        34,9))
                    System.out.println("Obesidade Classe I, cuidado!");
        senão
        if ((imc > 35,0) && (imc<
        39,9))
                            System.out.println("Obesidade Classe II, ainda temos como mudar isso!");
        senão 
        if (imc > = 40) {
            System.out.println("Obesidade Classe III, obtenha ajuda, nada está perdido!");
        }

        System.out.println("Obrigado :)");

       
    }

    private static void Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
