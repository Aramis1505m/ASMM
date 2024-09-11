
package asmm;

import java.util.Scanner;

public class ASMM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numero1 = 0;
        int Numero2 = 0;
        int Resultado;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        Numero1 = reader.nextInt();
        
        System.out.println("Introduce el Segundo numero:");
        Numero2 = reader.nextInt();
        
        Resultado = Numero1+Numero2;
        System.out.println("La suma es " + Numero1+" + "+Numero2+" = "+Resultado);
        reader.close();
        
        
        
    }
    
}
