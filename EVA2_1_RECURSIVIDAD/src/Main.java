
import java.util.Scanner;

/*
 * Imprmenbtacion de recursividad utilizando un metodo que se llamará a si mismo
 * haciendolo recursivo, similar al uso de un for falso.
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
        Scanner sInput = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        int iVal = sInput.nextInt();
        System.out.println("");
        forFalso(iVal);
        //forFalsoR(iValx);
    }
    // Desde el numero que te pide al 1
    public static void forFalso(int iVal){ //Se resuelve una pequeña parte del problema
        System.out.print(iVal + "-");
        System.out.println("");
        if (iVal > 1) { //Detener recursividad 
        forFalso(iVal - 1); //Llamada de la funcion dentro de la misma funcion.    
        }
        
 
    }
    //Desde 1 al numero que te pide
    public static void forFalsoR(int iValx, int iVal){
        iValx = 1;
        System.out.println(iValx + "-");
        if (iVal > iValx){
           // forFalsoR(1 + iValx);
            
        }
    }
    
}
