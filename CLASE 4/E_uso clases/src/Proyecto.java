public class Proyecto {
//ESTAMOS REALIZANDO UNA CLASE UNA PLANTILLA PARA UN OBJETO
    // Atributos del proyecto (clase)

    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estaActivo;

    // static - Atributo estático: número total de proyectos creados
    //esto indica que este atributo es parte de la clase no del objeto
    //todos los objetos lo comparten
    public static int totalProyectos = 0;

    // final - Constante: nombre del sistema
    //final indica que este valor no se puede cambiar
    public static final String NOMBRE_SISTEMA = "GestorProyectos v1.0";

    // Constructor
    //no recibe las variables static porque estas  se inicializan como parte de la clase de manera automatica
    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++;  // Se incrementa cada vez que se crea un nuevo proyecto
    }

    // Método para mostrar información del proyecto
    public void mostrarInformacion() {
        System.out.println("📁 Proyecto: " + nombre);
        System.out.println("👨‍💼 Cliente: " + cliente);
        System.out.println("⏳ Duración: " + duracionSemanas + " semanas");
        System.out.println("✅ ¿Activo?: " + (estaActivo ? "Sí" : "No"));
    }

    // Método para marcar el proyecto como inactivo
    public void cerrarProyecto() {
        estaActivo = false;
        System.out.println("🚫 El proyecto '" + nombre + "' ha sido cerrado.");
    }
}
