/*
 * Uso de la recursividad para llegar al maximo común divisor de dos numeros. 
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
        System.out.println(mcd(48,11));
        
    }
    public static int mcd(int div, int divs){
        if(divs == 0){
            return div;
        }else{
            int resu = div % divs;
            return mcd(divs,resu);
        }
    }
}
