/*
 * Utilizacion de paquetes de java que contienen los metodos de listas ya implementados. 
 */
package eva2_14_collections;

import java.util.LinkedList;

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> iLista = new LinkedList<String>();
        iLista.add("Holi");
        iLista.add("");
        iLista.add("Mundo");
        iLista.add("");
        iLista.add("Cruel");
        iLista.addFirst("XXXX");
        System.out.println(iLista);
         
        for (String string : iLista) {
            System.out.print(string + " - ");
        }
        System.out.println("Elementos almacenados: " + iLista.size());
        iLista.remove(5);
        System.out.println(iLista);
    }
    
}
