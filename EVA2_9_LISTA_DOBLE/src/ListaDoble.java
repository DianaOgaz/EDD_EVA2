/*
 * Creacion de lista doblemente enlazada (linked list), la cual consiste que un nodo 
 *puede apuntar a varios nodos. 
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class ListaDoble {
    
    
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble(){
        this.inicio = null;
        this.fin = null;
    }
    public boolean isEmpty(){
        if (inicio == null)
        return true;
        else 
        return false;
}
    
    // al final de la lista
    public void add(Nodo nuevo){
        if(isEmpty()){
        inicio = nuevo;
        fin = nuevo;
    }else{
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
            }
        
    }
    public void printBack(){
    Nodo temp = fin;
    while(temp != null){
            System.out.print( temp.getiVal() +  " - "  );
            temp = temp.getAnterior();
            
        }
    System.out.println();
}
    public int size(){
    int iCont = 0;
    Nodo temp = inicio;
    while(temp != null){
            iCont++;
            temp = temp.getSiguiente();  
        }
    return iCont;
}
public void clear (){ //Vaciar la lista 
    inicio = null;
    fin = null;
}
public int findAt(int pos){
    //verificar
    int iCont = 0;   
       Nodo temp = inicio;
        while(iCont < pos){
        temp = temp.getSiguiente();
        iCont++;
    }
return temp.getiVal();
}
}
