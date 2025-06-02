/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class SumaDeElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Crear un array para almacenar 5 números
        int suma = 0; // Variable para almacenar la suma

        // Leer 5 números enteros
        System.out.println("Por favor, ingresa 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacenar cada número en el array
            suma += numeros[i]; // Sumar el número a la suma total
        }

        // Mostrar la suma total
        System.out.println("\nLa suma de los 5 números es: " + suma);

        // Cerrar el escáner
        scanner.close();
    }
}
