/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elvalidador;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ElValidador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorDeDatos validador = new ValidadorDeDatos();
        int opcion;

        do {
            System.out.println("\n--- MENU DE VALIDACION ---");
            System.out.println("1. Validar texto");
            System.out.println("2. Validar numero entero");
            System.out.println("3. Validar fecha (dd/MM/yyyy)");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa un texto: ");
                    String texto = scanner.nextLine();
                    if (validador.validar(texto)) {
                        System.out.println(" Texto valido.");
                    } else {
                        System.out.println(" Texto invalido.");
                    }
                }

                case 2 -> {
                    System.out.print("Ingresa un numero entero: ");
                    
                    int numero = scanner.nextInt();
                    if (validador.validar(numero)) {
                        System.out.println(" Numero valido.");
                    } else {
                        System.out.println(" Numero invalido (debe ser mayor a 0).");
                    }
                }

                case 3 -> {
                    System.out.print("Ingresa una fecha (dd/MM/yyyy): ");
                    String fecha = scanner.nextLine();
                        if (validador.validar(fecha, true)) {
                        System.out.println(" Fecha valida.");
                    } else {
                        System.out.println(" Fecha invalida.");
                    }
                }

                case 4 -> System.out.println("Saliendo... ");

                default -> System.out.println("Opcion no valida. Intenta otra vez.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}