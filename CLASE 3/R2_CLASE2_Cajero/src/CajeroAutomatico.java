//scanner
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0; // Saldo inicial
        int opcion;

        do {
            // Mostrar el menú opciones
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1->{
                    // Consultar saldo
                    System.out.println("Su saldo actual es: $" + saldo);
                }
                case 2-> {
                    // Depositar dinero
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito<=0){
                    System.out.print("El monto debe ser mayor a 0 ");
                    continue;
                    }

                    saldo += deposito;
                    System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
                }

                case 3-> {
                    // Retirar dinero
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0) {
                        System.out.print("El monto debe ser mayor a 0 ");
                        continue;
                    }

                    // Validar si hay saldo suficiente
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficientes. No se puede completar la operación, tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro;
                        //uso de operador
                        System.out.println("Retiro Exitoso, tu saldo restante es: $" + saldo);
                    }
                }
                case 4-> {
                    // Salir del programa
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                }

                default->{
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

        } while (opcion != 4); // Repetir hasta que el usuario elija salir

        scanner.close();
    }
}