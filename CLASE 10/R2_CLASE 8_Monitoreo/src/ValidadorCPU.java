import java.util.HashSet;

public class ValidadorCPU {
    private static final int UMBRAL_CRITICO = 95;
    private static final HashSet<Integer> registrosCPU = new HashSet<>();

    public static void validarConsumo(int consumo) throws ConsumoCriticoException {
        if (consumo < 0 || consumo > 100) {
            throw new IllegalArgumentException("❌ Error: El consumo debe estar entre 0 y 100.");
        }

        if (!registrosCPU.add(consumo)) {
            throw new IllegalArgumentException("⚠️ Advertencia: El valor ya fue registrado.");
        }

        if (consumo > UMBRAL_CRITICO) {
            throw new ConsumoCriticoException("🔥 Alerta crítica: Consumo de CPU en " + consumo + "%.");
        }
    }
}