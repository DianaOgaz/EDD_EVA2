/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Nodo {
       


    private int iVal;
    private Nodo Izq; //Varaible que nos dice lo que haremos
    
    private Nodo Der;
    
  public Nodo() { //El final de la lista reprecenta null
        this.Izq = null;
        this.Der = null;

    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        this.Izq = null; //SIEMPRE VA 
        this.Der = null;
        
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public void setIzq(Nodo Siguiente) {
        this.Izq = Siguiente;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo anterior) {
        this.Der = anterior;
    }

}
