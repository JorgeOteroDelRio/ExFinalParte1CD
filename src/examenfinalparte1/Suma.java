package examenfinalparte1;

public class Suma {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Suma(int n1, int n2) {
        numero = sumar(n1, n2);
    }

    public Suma(int n) {
        numero = sumar(n, n);
    }

    public Suma() {
        numero = -1;
    }

    private int sumar(int n1, int n2) {
        return n1 + n2;
    }

}
