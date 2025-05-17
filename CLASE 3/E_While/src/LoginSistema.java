import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "admin123";
        String input;
        int intentos = 0;
        //intentos como variable de control se inicializa
        int maxIntentos = 3;


        while (intentos < maxIntentos) {
            //intentos como variable de control se usa para la condicion
            System.out.print("Ingresa tu contraseña: ");
            input = scanner.nextLine();

            if (input.equals(contraseñaCorrecta)) {
                System.out.println("✅ Acceso concedido.");
                break;
                //el break hace que el ciclo se cierre porque es correcta su contraseña
            } else {
                System.out.println("❌ Contraseña incorrecta.");
                intentos++;
                //intentos como la variable de control se autualiza
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("🔒 Cuenta bloqueada por demasiados intentos.");
        }

        scanner.close();
    }
}