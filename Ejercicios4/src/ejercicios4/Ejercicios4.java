
package ejercicios4;

import java.util.Scanner;

public class Ejercicios4 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("Menú:");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Conversar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = lector.nextInt();

            switch (option) {
                case 1 -> System.out.println("Hola");
                case 2 -> System.out.println("Adiós");
                case 3 -> System.out.println("Conversemos");
                case 4 -> System.out.println("Adiós");
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}