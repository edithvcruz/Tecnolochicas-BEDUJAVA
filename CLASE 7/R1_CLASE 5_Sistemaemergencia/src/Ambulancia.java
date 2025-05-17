

public class Ambulancia extends UnidadEmergencia {
    //Tambien recibe herencia de Unidad de emergencia

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    //METODO SOBREESCRITO DE UNO YA EXISTENTE

    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }
}
