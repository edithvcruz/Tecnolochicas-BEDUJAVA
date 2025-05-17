public class CentroControl {
    public static void main(String[] args) {
        Drone drone1 = new DroneVigilancia("DR-001");
        Drone drone2 = new DroneReparto("DR-002");
        //dron de vigilancia son drones y tienen que cumplir con leyes de herencia para que podamos poner estas lineas de codigo
        //dron es abstracto y por lo tanto no se puede instanciar, sus metodos no se pueden instanciar

        drone1.despegar();
        drone1.ejecutarMision();
        drone1.aterrizar();

        System.out.println();

        drone2.despegar();
        drone2.ejecutarMision();
        drone2.aterrizar();
    }
}