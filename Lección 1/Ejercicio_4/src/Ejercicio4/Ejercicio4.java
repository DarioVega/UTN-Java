/*
Ejercicio: El mayor de 2 números

Usaremos el Operador Ternario

Le vamos a pedir los números al usuario

 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("El mayor de dos números");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        int nro1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el segundo número: ");
        int nro2 = Integer.parseInt(entrada.nextLine());
        System.out.print("El numero mayor es: ");
        System.out.println(nro1 > nro2 ? nro1 : nro2);
        //var respuesta = (nro1 > nro2) ? "El primer numero es mayor" : "El segundo numero es mayor";
        //System.out.println("respuesta = " + respuesta);
    }
}
