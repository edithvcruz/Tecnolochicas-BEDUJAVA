public class MainNarrativa {
    private TransicionHistoria transicionHistoria;
    private GestorDialogo gestorDialogo;
    private LogicaDecision logicaDecision;

    public MainNarrativa(TransicionHistoria transicionHistoria, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicionHistoria = transicionHistoria;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void ejecutarEscena() {
        gestorDialogo.mostrarDialogo("Te escribe tu ex..." );
        String decision = logicaDecision.tomarDecision();
        transicionHistoria.cambiarEscena(decision);
        gestorDialogo.mostrarDialogo("Tu historia continúa...");
    }

    public static void main(String[] args) {
        MainNarrativa narrativa = new MainNarrativa(new TransicionSimple(), new DialogoTexto(), new DecisionBinaria());
        narrativa.ejecutarEscena();
    }
}