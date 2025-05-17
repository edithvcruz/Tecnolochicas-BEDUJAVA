public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Inicialmente sin reserva
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    //sobrecargad de metodos
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    //metodo sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";

        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";

        } else {
            info += "Pasajero: [Sin reserva] ";

        }
        return info;
    }
}
