package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes (1 al 12):");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "Primavera";
            default:
                estacion = "Numero no encontrado";
        }
        System.out.println("estacion = " + estacion);
    }
}
