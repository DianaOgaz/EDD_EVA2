/*
 * Metodo recursivo para identificar un numero primo
 */
package eva2_5_primos;

import java.util.Scanner;

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sCap = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        int x = sCap.nextInt();          
        if(esPrim(x))
        System.out.println("Es primo");
        else
        System.out.println("No es primo");
    }
    public static boolean esPrim(int x){
        boolean resu = false;
        for (int i = 2; i < x; i++) {
            if ((x % 1)==0) {
            resu = true;
            break;
            }
        }
        return resu;
    }
    
}
