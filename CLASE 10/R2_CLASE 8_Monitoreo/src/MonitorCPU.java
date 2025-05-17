import java.util.Scanner;
import java.util.InputMismatchException;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Ingrese el consumo de CPU (%), o -1 para salir: ");

                int consumo;

                try {
                    consumo = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("❌ Error: Debes ingresar un número entero válido.");
                    scanner.next(); // Limpiar entrada incorrecta
                    continue;
                }

                if (consumo == -1) {
                    break;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("❌ Error: El consumo debe estar entre 0 y 100.");
                    continue;
                }

                // Primero mostramos la alerta antes de solicitar otro valor
                try {
                    ValidadorCPU.validarConsumo(consumo);
                    System.out.println("✅ Consumo registrado correctamente: " + consumo + "%");
                } catch (ConsumoCriticoException e) {
                    System.err.println(e.getMessage());
                    continue; // Solicitar nuevo dato sin repetir la misma entrada
                }
            }
        } catch (Exception e) {
            System.err.println("🚨 Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("📦 Recurso liberado correctamente.");
        }
    }
}