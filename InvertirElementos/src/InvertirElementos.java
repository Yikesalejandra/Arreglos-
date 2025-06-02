/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class InvertirElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6]; // Crear un array para almacenar 6 números

        // Leer 6 números enteros
        System.out.println("Por favor, ingresa 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacenar cada número en el array
        }

        // Invertir el orden de los elementos
        for (int i = 0; i < 3; i++) {
            int temp = numeros[i]; // Variable temporal para el intercambio
            numeros[i] = numeros[5 - i]; // Intercambiar elementos
            numeros[5 - i] = temp; // Completar el intercambio
        }

        // Mostrar el array invertido
        System.out.println("\nArray invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " "); // Imprimir cada elemento en el array
        }

        // Cerrar el escáner
        scanner.close();
    }
}
