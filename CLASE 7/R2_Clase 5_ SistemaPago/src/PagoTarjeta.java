public class PagoTarjeta extends MetodoPago {
//hereda de metodo pago

    private double saldoDisponible;
    //campo privado unico de esta clase
    //solo se accede dentro de esta clase


    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        //llama al monto de la superclase

        this.saldoDisponible = saldoDisponible;
    }

    //Poliformismo
    //Implemetar metodo de Interfaza Autenticable
    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
        //solo regresa el saldo si se cumple estas caracteristicas
    }

    //Impresion de mensaje especifico del Procesar pago
    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}

