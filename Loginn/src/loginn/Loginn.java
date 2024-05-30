
package loginn;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Loginn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(mailPattern);
        final String correctPassword = "P@55wOrd";
        int Intentos = 0;
        final int IntentosMaximos = 5;
         
        while ( Intentos < IntentosMaximos) {
            System.out.print("Ingrese su dirección de correo: ");
            String Correo = scanner.nextLine();
            System.out.print("Ingrese su clave de acceso: ");
            String password = scanner.nextLine();
            
            Matcher matcher = pattern.matcher(Correo);
            boolean EmailValid = matcher.matches();
            
            if (EmailValid && password.equals(correctPassword)) {
                System.out.println("Bienvenido al sistema");
                return;
            } else {
                System.out.println("Acceso denegado");
                 Intentos++;
            }
        }
        System.out.println("Cuenta suspendida");
       }
    }
        
    
    
