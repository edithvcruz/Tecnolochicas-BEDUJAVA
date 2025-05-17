public class AutoAutonomo extends Vehiculo {
    //hereda marca y metodo encender de vehiculo
    SensorGPS gps;
    Camara camara;
    SistemaIA ia;
    Motor motor;

    public AutoAutonomo(String marca) {
        super(marca);
        //se usa super cuando nos refereimos a la superclase
        //llamar atributo de superclase
        this.gps = new SensorGPS();
        this.camara = new Camara();
        this.ia = new SistemaIA();
        this.motor = new Motor();
    }
    //estos atributos son los que COMPONEN a un Auto autonomo

    public void iniciarAutonomia() {
        System.out.println("🤖 Modo autónomo activado.");
        gps.localizar();
        camara.detectarObstaculos();
        ia.tomarDecision();
        motor.arrancar();
    }
}