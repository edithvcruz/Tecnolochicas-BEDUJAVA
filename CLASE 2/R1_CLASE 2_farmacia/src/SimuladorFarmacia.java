import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {

    // Create a Scanner
        Scanner teclado = new Scanner(System.in);

     // Nombre de medicamento
        System.out.println("Ingresa el nombre del medicamento :");
        String nombre_medicamento = teclado.nextLine();

    // Nombre de precio
        System.out.println("Ingresa el precio unitario :");
        Double precio_unitario = teclado.nextDouble();

    // Cantidad
        System.out.println("Ingresa la cantidad de piezas:");
        int cantidad_piezas = teclado.nextInt();

//operaciones
var costo_total= precio_unitario* cantidad_piezas;
boolean aplica_descuento= costo_total>500;
double descuento= aplica_descuento ?  costo_total* 0.15:0;
double total_pago=  costo_total-descuento;

//Mostrar resultados
 System.out.println("Medicamento: " + nombre_medicamento +"\n"+
 "Cantidad: " + cantidad_piezas+"\n"+
 "Precio Unitario: " +"$" + precio_unitario+"\n"+
 "Aplica descuesto: " + aplica_descuento+"\n"+
 "Descuesto: " +"$" + descuento+"\n"+ "Total a pagar: "+"$"  + total_pago
        );
    }
}