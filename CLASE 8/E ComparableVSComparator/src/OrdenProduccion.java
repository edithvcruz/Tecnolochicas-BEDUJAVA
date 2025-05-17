import java.util.*;
// Clase que representa una orden de producción
class OrdenProduccion implements Comparable<OrdenProduccion> {

   // implementra comparable
   //oara usar comparable debe usar el metodo especifico compareTo


    String codigo;
    String producto;
    int prioridad;

    public OrdenProduccion(String codigo, String producto, int prioridad) {
        this.codigo = codigo;
        this.producto = producto;
        this.prioridad = prioridad;
    }

    // Orden natural: por nombre del producto (alfabético)
    @Override
    //usar override para sobreescribir el metodo de la interfaz comparable
    public int compareTo(OrdenProduccion otra) {
        return this.producto.compareTo(otra.producto);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Producto: " + producto + " | Prioridad: " + prioridad;
    }
}



