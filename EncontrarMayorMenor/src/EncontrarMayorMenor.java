/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class EncontrarMayorMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8]; // Crear un array para almacenar 8 números
        int mayor, menor;

        // Leer 8 números enteros
        System.out.println("Por favor, ingresa 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacenar cada número en el array
        }

        // Inicializar mayor y menor con el primer elemento del array
        mayor = numeros[0];
        menor = numeros[0];

        // Determinar el número mayor y menor
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizar mayor
            }
            if (numeros[i] < menor) {
                menor = numeros[i]; // Actualizar menor
            }
        }

        // Mostrar los resultados
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        // Cerrar el escáner
        scanner.close();
    }
}
