public class NotificacionEmail extends Notificacion {
    //Notificacion email va heredar atributos de notificadion
    //extends indica justamente eso
    String destinatario;
    //se agrega el destinatario

    public NotificacionEmail(String mensaje, String destinatario) {
        super(mensaje);
        // Llamamos al constructor de la clase base
        this.destinatario = destinatario;
    }
//reutiiza atributos, solo agrega uno extra
    public void enviarEmail() {
        System.out.println("📧 Enviando email a " + destinatario + ": " + mensaje);
    }
}