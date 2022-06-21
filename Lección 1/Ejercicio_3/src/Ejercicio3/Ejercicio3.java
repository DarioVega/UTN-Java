/*
Ejercicio : Rectángulo
Se solicita calcular el área y el perímetro de un rectángulo, para esto deberemos crear las variables:
Alto (int)
Ancho(int)
El usuario debe proporcionar los valores de alto, ancho y después se debe imprimir el resultado en el siguiente formato: 
(recuerden no usar acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.
Le decimos al usuario:
Digite el alto del rectángulo:
Digite el ancho del rectángulo:

Fórmula:
Área = alto * ancho;
Perímetro = (alto + ancho) * 2;
¿Cuál es el código del ejercicio planteado?

 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Rectángulo");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el alto del rectángulo: ");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectángulo: ");
        int ancho = Integer.parseInt(entrada.nextLine());
        var area = alto * ancho;
        System.out.println("Area: = " + area);
        var perimetro = (alto + ancho) * 2;
        System.out.println("Perímetro: = " + perimetro);
    }
}
