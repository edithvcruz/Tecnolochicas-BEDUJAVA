public class TransicionSimple implements TransicionHistoria {
    @Override
    public void cambiarEscena(String nuevaEscena) {
        System.out.println("🌍 Transición a la escena: " + nuevaEscena);
    }
}