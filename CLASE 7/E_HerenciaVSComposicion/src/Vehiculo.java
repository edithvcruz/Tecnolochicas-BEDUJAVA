public class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("🔑 El vehículo " + marca + " está encendido.");
    }
}
//superclase
//metodo siempre lleva () , puede o no llevar paramentros
