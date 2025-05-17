public class PagoEfectivo extends MetodoPago {
//hereda de metodo pago

//Constructor
    public PagoEfectivo(double monto) {
        super(monto);
        //llama al monto de la superclase
    }

    //Poliformismo
    //Implemetar metodo de Interfaza Autenticable
    @Override
    public boolean autenticar() {
        return true;  // No se requiere validación para efectivo
    }

    //Implemetar metodo procesar pago
    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
