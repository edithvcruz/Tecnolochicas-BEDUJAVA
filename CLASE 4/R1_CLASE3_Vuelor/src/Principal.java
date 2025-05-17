public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Ana Martínez", "A123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");


        // Reservar el asiento
        boolean resevado= vuelo.reservarAsiento(pasajero);
        if (resevado) {
            System.out.println("✅ Reserva realizada con éxito.");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar la reserva
        System.out.println("\n❌ Cancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Reservar asiento con nombre y pasaporte
        System.out.println();
        vuelo.reservarAsiento("Mario Gonzalez", "B654321");
        System.out.println(vuelo.obtenerItinerario());

    }
}