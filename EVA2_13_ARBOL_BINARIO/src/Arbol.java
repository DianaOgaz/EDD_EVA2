/*
 * un arbol es una estructura de datos que consiste en una rama donde parten los padres 
 * e hijos de varios nodos hasta llegar a las hojas. leyendo nodo a nodo mediante
 * mediante inorder, posorder y preorder.
 */

/**
 *
 * @author DIANA TERESA OGAZ ESCARPITA #18550698
 */
public class Arbol {
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
        
    }
    private void agregarNodoRec (Nodo actual, Nodo nuevo){
        if(root == null){//Arbol 
            root = nuevo;
        }else{
            if(nuevo.getiVal() > actual.getiVal() ){
                if(actual.getDer() == null){
                    actual.setDer(nuevo);
                }else{
                    agregarNodoRec(actual.getDer(), nuevo);
                }
            }else if(nuevo.getiVal() < actual.getiVal()){
                if(actual.getIzq() == null){
                    actual.setIzq(nuevo);
                }else{
                    agregarNodoRec(actual.getIzq(), nuevo);
                }
            }else{
                System.out.println("El valor ya existe, ingresa otro");
            }
        }
    }
    public void ImpPost (){
        postOrder(root);
    }
    private void postOrder(Nodo actual){
        if(actual != null){
        //Leer izquierda 
        postOrder(actual.getIzq());
        //leer derecha 
        postOrder(actual.getDer());
        //imprimir
        System.out.print(actual.getiVal() + "-");
    }
    }
    public void ImpIn(){
        inOrder(root);
    }
    private void inOrder(Nodo actual){
        if(actual != null){
        //Leer izquierda 
        inOrder(actual.getIzq());
        //imprimir
        System.out.print(actual.getiVal() + "-");
        //leer derecha 
        inOrder(actual.getDer());
        
    } 
        
    }
    public void impPre(){
        preOrder(root);
    }
    private void preOrder(Nodo actual){
            if(actual != null){
        //imprimir
        System.out.print(actual.getiVal() + "-");
        //Leer izquierda 
        inOrder(actual.getIzq());
        //leer derecha 
        inOrder(actual.getDer());
        
    } 
        }
    
}
