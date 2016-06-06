package examenfinalparte1;

/**
 * Permite realizar sumas de dos números y duplicar un número
 * @author jota
 */
public class Suma {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Realiza la suma de dos número enteros y se la asigna al atributo
     * del objeto.
     * @param n1 Uno de los dos operandos
     * @param n2 El otro operando
     */
    public Suma(int n1, int n2) {
        numero = sumar(n1, n2);
    }
    
    /**
     * Realiza el duplo del número que recibe como parámetro y se lo asigna al 
     * atributo del objeto.
     * @param n Número entero del que se va a realizar el duplo
     */
    public Suma(int n) {
        numero = sumar(n, n);
    }
    
    /**
     * Constructor por defecto, el valor de el atributo de objeto será -1.
     */
    public Suma() {
        numero = -1;
    }
    
    /**
     * Realiza la suma de dos número enteros recibidos por parámetros.
     * @param n1 Uno de los dos operandos
     * @param n2 El otro operando
     * @return La suma de los dos números
     */
    private int sumar(int n1, int n2) {
        return n1 + n2;
    }

}
