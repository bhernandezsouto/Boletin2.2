/*
Area de un cuadrado
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado;
        Scanner ab = new Scanner(System.in);
        System.out.println ("Introduzca el lado del cuadrado");
        lado = ab.nextFloat();
        System.out.println("El area del triangulo es: " + (lado*lado) );
    }
}

