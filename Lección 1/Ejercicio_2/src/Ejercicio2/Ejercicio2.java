package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        /* Hacer un programa q calcule e imprima el salario de un empleado, 
        a partir de sus horas semanales trabajadas y de su salario por hora
        */
        int horasSemanales;
        float salarioHora, salario;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese las horas semanales trabajadas: ");
        horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.print("Ahora ingrese su salario por hora: $");
        salarioHora = Float.parseFloat(entrada.nextLine());
        
        
        salario = salarioHora * horasSemanales;
        System.out.println("El salario semanal es: $" + salario);
        
    }
}
