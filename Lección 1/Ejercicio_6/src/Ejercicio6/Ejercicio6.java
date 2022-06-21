package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       /*
        Guillermo tiene N dolares
        Luis tiene la mitad de lo que posee Guillermo
        Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
        
        Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres
        
        */
       
       Scanner entrada = new Scanner(System.in);
       float guillermo, luis, juan, suma;
        System.out.println("Cuanto dinero tiene Guillermo?");
        guillermo = Float.parseFloat(entrada.nextLine());
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        
        System.out.println("juan = " + juan);
        System.out.println("guillermo = " + guillermo);
        System.out.println("luis = " + luis);
        suma = juan + guillermo + luis;
        System.out.println("suma = " + suma);
    }
    
}
