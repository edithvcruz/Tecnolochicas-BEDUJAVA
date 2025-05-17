public class entrada {
    //ATRUBUTOS
    String nombre_evento;
    double precio_entrada;

    //CONSTRUCTOR
    public entrada(String nombre_evento, double precio_entrada) {
    this.nombre_evento = nombre_evento;
    this.precio_entrada = precio_entrada;
    }
//MOSTRAR INFORMACION
    public void mostrarInformacion() {
    System.out.println("Evento: " + nombre_evento + " | Precio: $" + precio_entrada);
    }
}
