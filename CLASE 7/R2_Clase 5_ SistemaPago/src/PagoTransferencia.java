public class PagoTransferencia extends MetodoPago {
    //hereda de metodo pago
    private boolean validadoExternamente;
    //campo privado unico de esta clase
    //solo se accede dentro de esta clase


    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        //llama al monto de la superclase
        this.validadoExternamente = validadoExternamente;
        //parametro adicional de este tipo de pago
    }
    //Poliformismo
    //Implemetar metodo de Interfaza Autenticable
    //devuelve el validado de esta
    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }
    //Mensaje especifico de este tipo de pago
    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}
