public abstract class MetodoPago implements Autenticable {
    //METODO ABSTRACTO
    //IMPEMETARA LA INTERFAZ AUTENTICABLE QUE ESTABLECE QUE SI O SI USEN AUTENTIFICAR

    protected double monto;
    //Accesible solo a clases hijas y clase principal

    //costructor por parametros
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();
    //obliga a que las clases hijas usen procesar pago


    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
