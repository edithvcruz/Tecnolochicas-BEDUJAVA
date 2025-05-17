public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String mensaje) {
        System.out.println("💬 Personaje: " + mensaje);
    }
}