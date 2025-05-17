public class Empleado {

    // Atributos privados (encapsulados)
    private String nombre;
    private int edad;

    // Constructor vacío
    public Empleado() {}

    // Getter para nombre para solicitar el nombre
    public String getNombre() {
        return nombre;
    }
    //extraer datos desde metodos es mejor porque se controla el acceso y se pueden establacer criterios para traerlos de vuelta

    // Setter con validación para nombre
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("❌ El nombre no puede estar vacío.");
        }
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter con validación para edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("❌ La edad debe ser mayor a 0.");
        }
    }
// VIOD SOLO REGRESA ACCCIONES
//SETTER CONTROLA QUE LAS MODIFICACIONES CUMPLEN CIERTAS CARACTERISTICAS

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("👨 Empleado: " + nombre + ", Edad: " + edad);
    }
}