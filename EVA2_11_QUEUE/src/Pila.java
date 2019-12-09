
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Pila {
    private Nodo inicio;
    private Nodo fin;

    public Pila() {
        this.inicio = null;
        this.fin=null;
    }
    //Devuelve true si la lista esta vacia
    public boolean isEmpty (){
        if(inicio == null)
            return true;
        else
            return false;
    }
    //Agregar un nodo al final de la lista
        public void add(Nodo nuevo){
            //Primero verificar si la lista esta vacia
            if (isEmpty()) {
                inicio = nuevo;
                fin = nuevo;
            }else {
                /*Nodo temp = inicio;
                while (temp.getSiguiente() != null){
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(nuevo);*/
                fin.setSiguiente(nuevo);
                fin=nuevo;
            }
        }
            //agregar uno al inicio
            public  void  addBegin (Nodo nuevo){
                 if (isEmpty()) {
                inicio = nuevo;
                fin = nuevo;
                } else {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                }
            }
    //imprimir lista
    public void print(){
         Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
        temp = temp.getSiguiente();
        }
        System.out.println();
    }
    //cantidad de elementos en la lista
    public int size(){
         int iCont = 0;
         Nodo temp = inicio;
        while(temp != null){
        iCont++;
        temp = temp.getSiguiente();
        }
        return iCont;
    }
        public void insertAt (int pos,Nodo nuevo) {
            
            if (pos ==0){
                addBegin(nuevo);
            }else {
                if (isEmpty()) {
                    inicio = nuevo;
                    fin = nuevo;
                }else{
                    Nodo temp = inicio;
                     int pos2 = 0;
                    while (pos2 < (pos-1)){
                        pos2++;
                    temp = temp.getSiguiente();   
                    }
                        nuevo.setSiguiente(temp.getSiguiente());
                        temp.setSiguiente(nuevo);   
                }
            }
        }
                public void clear(){
                    inicio = null;
                    fin = null;
                }
        public void deleteAt(int pos) throws Exception{
            //Lista esta vacia vacia
            if (isEmpty())
                    throw new Exception("Lista esta vacia");
            
                int iTama=size();
                if((pos <0)||(pos >=iTama))
                    throw new Exception("La posición es invalida");
                
                if (iTama ==1){//solo hay un nodo
                    clear();
                } else {//muchos nodos
                    if (pos==0){//borrar el primer nodo
                        inicio = inicio.getSiguiente();
                    } else {
                        Nodo temp = inicio;
                        int pos2 = 0;
                        while (pos2 < (pos-1)){
                            pos2++;
                            temp = temp.getSiguiente();   
                        }
                            temp.setSiguiente(temp.getSiguiente().getSiguiente());
                            
                            if(pos == (iTama-1))
                                fin = temp;
                            
                    }
           
                }  
        }
    public int getAt (int pos){
        //Verificar
        Nodo temp = inicio;
                int pos2 = 0;
                while (pos2 < pos){
                pos2++;
                temp = temp.getSiguiente();   
                }
                return temp.getValor();
    }
    //la cuima es el inicio se la lista
    //aggregar un nodo a la cima de la pila
    public void agregar(Nodo nuevo){
      add(nuevo);  
    }
        //lee l nodo en la cima la pila
        public int leer(){
        return getAt(0);
        }
    public int quitar() throws Exception{
       int iResu = getAt(0);
       deleteAt(0);
       return iResu;
    }
}
