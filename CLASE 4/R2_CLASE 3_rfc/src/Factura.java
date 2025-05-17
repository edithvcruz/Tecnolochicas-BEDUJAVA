import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Se usa Optional para manejar RFC opcional
//atributos privados


    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
        //rfc opcional
    }

    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        return resumen;
    }
}