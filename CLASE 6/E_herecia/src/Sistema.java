public class Sistema {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "ana@correo.com");

        // Llamamos a métodos heredados y propios
        email.enviar();        // Método heredado de notificacion
        email.enviarEmail();   // Método propio de clase notificadion email
    }
}