package examenfinalparte1;

public class Prin {

    public static void main(String[] args){
        Suma suma1 = new Suma(10, 20);
        int suma1_numero = suma1.getNumero();
        System.out.println("La suma de 10 y 20 es: " + suma1_numero);
        Suma suma2 = new Suma(10);
        int suma2_numero = suma2.getNumero();
        System.out.println("La suma de 10 y 10 es: " + suma2_numero);
        Suma suma3 = new Suma();
        int suma3_numero = suma3.getNumero();
        System.out.println("La suma sin parámetros es: " + suma3_numero);
    }
}
