import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroErrores {
    private static final String ARCHIVO_ERRORES = "registro_fallos.txt";

    public static void guardarError(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_ERRORES, true))) {
            bw.write(mensaje);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("❌ No se pudo registrar el error: " + e.getMessage());
        }
    }
}