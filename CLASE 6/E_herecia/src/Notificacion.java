public class Notificacion {
    String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("📢 Enviando notificación: " + mensaje);
    }
}
//NOTAS:
//herencia permite reautilizar el codigo
//super clase=clase padreo clase madre
//subclase= clase hija, hereda atributos de superclase
//herencia simple: hereda de 1
//herencia multiple