package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        /*
    Una compañia de venta de carros usados, paga a su personal de ventas 
    un salario de $1000 mensuales 
    mas una comision de $150 por cada carro vendido, 
    mas el 5% del valor de la venta por carro.  
    Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes
    hacer un programa que calcule e imprima el salario mensual de un vendedor dado 
    El salario de 1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada "final"
         */
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        float ventaPorCarro, salarioMensual;
        int cantCarrosVendidos;
        
        System.out.println("Ingrese la cantidad de carros vendidos:");
        cantCarrosVendidos = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el valor de la venta por carro:");
        ventaPorCarro = Float.parseFloat(entrada.nextLine());

        salarioMensual = (float) ((cantCarrosVendidos * 150) + salario + (ventaPorCarro * 1.5));
        System.out.println("salarioMensual = " + salarioMensual);

    }

}
