import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordCorrecta = "java123";
        String passwordIngresada;

        do {
            System.out.print("Ingrese la contraseña: ");
            passwordIngresada = scanner.nextLine();
        } while (!passwordIngresada.equals(passwordCorrecta));

        System.out.println("¡Contraseña correcta! Bienvenido.");
        scanner.close();
    }
}
