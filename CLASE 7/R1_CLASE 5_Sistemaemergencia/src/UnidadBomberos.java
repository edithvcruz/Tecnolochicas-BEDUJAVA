public class UnidadBomberos extends UnidadEmergencia {
    //ESTE ADEMAS TENDRA ESTOS ATRIBUTOS QUE LO CONFORMAN
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        //NOMBRE VIENE DE LA CLASE UNIDAD DE EMERGENCIA

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
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }
}
