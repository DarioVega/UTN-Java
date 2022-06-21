package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        /*
        Hacer un programa q calcule e imprima la suma de 3 calificaciones
        Pedir las calificaciones al usuario
         */
        Scanner entrada = new Scanner(System.in);
        float calif1, calif2, calif3;

        System.out.println("Ingrese la primer calificacion:");
        calif1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ahora la segunda:");
        calif2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Por último, la tercera");
        calif3 = Float.parseFloat(entrada.nextLine());

        var suma = calif1 + calif2 + calif3;
        System.out.println("suma = " + suma);
    }
}
