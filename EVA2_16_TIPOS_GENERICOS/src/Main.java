/*
 * Tipos de datos para nodos.
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
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("Hola mundo curel");

    }
    
}
class Nodo<T> {
    private T valor;
    Nodo siguiente;
    Nodo previo;

    public Nodo(T valor) {
        this.valor = valor;
    }

    public Nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}