/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ContarParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Crear un array para almacenar 10 números
        int contadorPares = 0; // Contador para números pares
        int contadorImpares = 0; // Contador para números impares

        // Leer 10 números enteros
        System.out.println("Por favor, ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacenar cada número en el array

            // Verificar si el número es par o impar
            if (numeros[i] % 2 == 0) {
                contadorPares++; // Incrementar contador de pares
            } else {
                contadorImpares++; // Incrementar contador de impares
            }
        }

        // Mostrar resultados
        System.out.println("\nTotal de números pares: " + contadorPares);
        System.out.println("Total de números impares: " + contadorImpares);

        // Cerrar el escáner
        scanner.close();
    }
}