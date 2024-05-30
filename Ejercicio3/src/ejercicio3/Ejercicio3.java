
package ejercicio3;

public class Ejercicio3 {

  public static void main(String[] args) {
        // Ejemplo de datos
        String[] equipos = {"Los Cóndores", "Águilas Rojas", "Tigres del Norte", "Lobos Marinos"};
        int[] puntos = {32, 30, 28, 27};
        int[] golesFavor = {40, 38, 35, 33};
        int[] golesContra = {20, 25, 30, 29};
        int[] diferenciaGoles = {20, 13, 5, 4};


        StringBuilder tabla = new StringBuilder();
        tabla.append("Nombre del Equipo | Puntos | Goles a Favor | Goles en Contra | Diferencia de Goles\n");

        for (int i = 0; i < equipos.length; i++) {
            tabla.append(String.format("%-15s | %-6d | %-13d | %-14d | %-18d\n",
                    equipos[i], puntos[i], golesFavor[i], golesContra[i], diferenciaGoles[i]));
        }

        System.out.println(tabla.toString());
    }
}
