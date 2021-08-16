
package excecoes;

/**
 *
 * @author agton
 */
public class multiCatch {
    public static void main(String[] args) {
        int[] numero = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};
        try {
            for (int i = 0; i < numero.length; i++) {
                System.out.println(numero[i] + "/" + denominador[i] + "=" + (numero[i] / denominador[i]));
            }

        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero");
        } catch (Throwable ex) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Esta linha é sempre executada após o try ou catch");
        }
        
    }
    
}
