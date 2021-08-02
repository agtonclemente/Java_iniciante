//Array
package aula07;


public class Array {

   
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        int o = 0;
        temperaturas[o] = 33.7;
        temperaturas[1] = 32;
        temperaturas[2] = 31.5;
        temperaturas[3] = 34;
        temperaturas[4] = 36;
        System.out.println("O valor da temperatura do dia 3: " + temperaturas[2]);
        System.out.println("O tamanho do array: " + temperaturas.length);
        System.out.println("Valores do array: ");
        for (int i=0; i<temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + "é: " + temperaturas);
            
        }
        for (double temp : temperaturas) [
        System.out.println(temp);
        ]
        
        
    }
    
}
