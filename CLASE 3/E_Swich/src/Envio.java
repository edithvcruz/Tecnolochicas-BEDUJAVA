import java.util.Scanner;

public class Envio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tipo de paquete (pequeño, mediano, grande): ");
        String tipo = scanner.nextLine();
        //toLowerCase pasar a minusculas
        double costo = switch (tipo.toLowerCase()) {
            case "pequeño" -> 49.99;
            case "mediano" -> 89.99;
            case "grande" -> 149.99;
            default -> {
                //caso por default para datos que no se relacionan
                System.out.println("Tipo no válido.");
                yield 0.0;
                //se usa para case con varias líneas
            }
        };

        System.out.println("Costo del envío: $" + costo);
    }}

//Ya no se usa break, en el uso clsico si se usana para evitar que se ejecutara un siguiente case

//Break se usa mas en estructuras de repeticion