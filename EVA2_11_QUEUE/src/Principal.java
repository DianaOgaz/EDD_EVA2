
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * La representacion de una lista en modo queue. 
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // agregar . al final
        //quitar . al inicio
        //leer. al inicio
        Pila miPila = new Pila();
        miPila.agregar(new Nodo(100));
        miPila.agregar(new Nodo(200));
        miPila.agregar(new Nodo(300));
        miPila.agregar(new Nodo(400));
        miPila.print();
        System.out.println("Cima de la pila " + miPila.leer());
        try {
            System.out.println("Cima de la pila " + miPila.quitar());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miPila.print();
    }
    
}
