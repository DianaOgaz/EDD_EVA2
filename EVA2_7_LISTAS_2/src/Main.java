/*
 * Creacion de listas a base de nodos hasta que se termine llegando a null.
 * Se utilizan listas cuando no sabes cuantos elementos se quieren almacenar.
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
        Nodo nodo1, nodo2, nodo3;
        nodo1 = new Nodo(32);
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        
        Nodo temp = nodo1; //Se mueve entre los eslabones
        while(temp != null){
            System.out.print( temp.getiVal() +  " - "  );
            temp = temp.getSiguiente();
            
        }
        
    }
    
}
class Nodo {
    private int iVal;
    private Nodo Siguiente; //Varaible que nos dice lo que haremos
    
  public Nodo() { //El final de la lista reprecenta null
        this.Siguiente = null;

    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        this.Siguiente = null; //SIEMPRE VA 
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

  
    
    
}
