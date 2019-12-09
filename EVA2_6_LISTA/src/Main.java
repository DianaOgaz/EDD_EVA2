/*
 * introduccion a listas.
 * Los eslabones de una lista son nodos y son los más importante de ellas.
 * Se componen de dos cosas: el dato que almacena y su direccion
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
       Nodo nObj1 = new Nodo();
        nObj1.iVal = 100;
        nObj1.siguiente = new Nodo();//objeto que se crea y se suda
        nObj1.siguiente.iVal = 200; //Se modifica el valor del nodo siguiente
        nObj1.siguiente.siguiente = new Nodo();
        nObj1.siguiente.siguiente.iVal = 300;
        System.out.println(nObj1.iVal);
        System.out.println(nObj1.siguiente.iVal);
        System.out.println(nObj1.siguiente.siguiente.iVal);
    }
    
}
class Nodo{
    //dato a almacenas
    int iVal;
    Nodo siguiente;
}