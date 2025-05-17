
//Clase abstracta con estructura y comportamientos comunes de todos los drones

public abstract class Drone {
    String id;

    public Drone(String id) {
        this.id = id;
    }

    public void despegar() {
        System.out.println("🚁 Drone " + id + " despegando...");
    }

    public void aterrizar() {
        System.out.println("🛬 Drone " + id + " aterrizando...");
    }

    // Método abstracto que cada tipo de drone debe implementar
    public abstract void ejecutarMision();
    //Depende del dron, no es especifico
    //tiene el abstrac
    //desde la clase se indica que sera abstracta
}