
import java.util.Scanner;

/*
 * Metodo recursivo del juego Fribonacci
 */

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
        System.out.println("Incerte la posicion: ");
        int x = sCap.nextInt();
        System.out.println(fFrib(x));
        
    }
    public static int fFrib(int x){
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            return fFrib(x - 1) + fFrib(x - 2);
        }
    }
    
}
