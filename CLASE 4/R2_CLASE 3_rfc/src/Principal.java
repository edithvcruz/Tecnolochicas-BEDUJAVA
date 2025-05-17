public class Principal {
    public static void main(String[] args) {
        // Crear facturas con y sin RFC
        Factura factura1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura factura2 = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar resumen de ambas facturas
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}