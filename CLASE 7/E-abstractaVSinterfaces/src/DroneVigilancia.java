public class DroneVigilancia extends Drone implements Vigilancia {
//hereda caracteristicas de dron
// implements pra implementar interfaces que son obligatorias porque son interfaces


    public DroneVigilancia(String id) {
        super(id);
    }

    @Override
    public void ejecutarMision() {
        System.out.println("🔍 Drone " + id + " iniciando misión de vigilancia.");
        escanearArea();
    }

    @Override
    public void escanearArea() {
        System.out.println("📷 Escaneando área en 360°...");
    }
}