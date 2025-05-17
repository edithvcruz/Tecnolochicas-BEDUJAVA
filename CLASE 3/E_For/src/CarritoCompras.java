public class CarritoCompras {

    public static void main(String[] args) {
        //{} para almacenar varios datos
        //[] indican que es  una estructura de datos llamado array o arreglo
        String[] productos = {"Laptop", "Mouse", "Teclado", "Pantalla", "Audífonos"};

        // FOR CLASICO
        // en un  for la variable de control sofre los 3 momentos como en whil
        //inicializacion; condicion actualizacion de variable de cntrol
        //for (inicializacion; condicion actualizacion)
        //for es mas corto que while
        //se utiliza mucho para tener variables de control
        //while no necesariamente requiere variable de control
        System.out.println("📦 Productos en el carrito:");
        for (int i = 0; i < productos.length; i++) {
            //la actualizacion es lo ultimo en ejecutarse
            System.out.println("- " + productos[i]);
        }

        // FOR-EACH con control de flujo
        System.out.println("\n🔁 Recorriendo con for-each:");
        for (String producto : productos) {
            if (producto.equals("Teclado")) continue; // Saltar teclado
            if (producto.equals("Pantalla")) break;   // Detener en pantalla
            System.out.println("Producto válido: " + producto);
        }
    }
}
// break rompe el ciclo
//continue regresa al inicio de la ejecicion
//ambas son estructuras de salto 