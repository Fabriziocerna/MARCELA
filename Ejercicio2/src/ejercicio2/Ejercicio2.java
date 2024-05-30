
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        final int numEquipos = 6;

        String[] nombresEquipos = new String[numEquipos];
        int[] puntosAcumulados = new int[numEquipos];
        int[] golesFavor = new int[numEquipos];
        int[] golesContra = new int[numEquipos];
        int[] diferenciaGoles = new int[numEquipos];
        
        for (int i = 0; i < numEquipos; i++) {
            System.out.println("Ingrese los datos para el equipo " + (i + 1) + ":");
            System.out.print("Nombre del equipo: ");
            nombresEquipos[i] = scanner.nextLine();
            System.out.print("Puntos acumulados: ");
            puntosAcumulados[i] = scanner.nextInt();
            System.out.print("Goles a favor: ");
            golesFavor[i] = scanner.nextInt();
            System.out.print("Goles en contra: ");
            golesContra[i] = scanner.nextInt();
            scanner.nextLine();
            
             diferenciaGoles[i] = golesFavor[i] - golesContra[i];
          }   

StringBuilder reporte = new StringBuilder();
        reporte.append("""
                ######################## REPORTE EQUIPOS ########################
                NOMBRE\t\tPUNTOS\tGOLES A FAVOR\tGOLES EN CONTRA\tDIFERENCIA DE GOLES
                ---------------------------------------------------------------
                """);
 for (int i = 0; i < numEquipos; i++) {
            reporte.append(String.format("%s\t\t%d\t%d\t%d\t%d",
                    nombresEquipos[i], puntosAcumulados[i], golesFavor[i], golesContra[i], diferenciaGoles[i]));
        }
        reporte.append("---------------------------------------------------------------\n");

        System.out.println(reporte.toString());
    }
}


    
   
    


