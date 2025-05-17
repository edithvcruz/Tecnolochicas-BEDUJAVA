import java.util.*;
//importacion de todo lo que esta en util

public class RegistroMuestras {
    public static void main(String[] args) {

        // Array list tipo de lista
        //Creación de lista de muestras que llegan
        ArrayList<String> muestra = new ArrayList<>();

        muestra.add("Homo sapiens");
        muestra.add("Mus musculus");
        muestra.add("Arabidopsis thaliana");
        muestra.add("Homo sapiens");
        muestra.add("Mus musculus");

        //Impresion de lista por orden de llegada
        System.out.println("Orden de llegada de muestras");
        for (String muestras: muestra) {
            System.out.println("- " + muestras);
        }

        //Impresion de muestras unicas con hashsset
        HashSet<String> especiesUnicas = new HashSet<>(muestra);

        System.out.println("\n Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        //Map para pares: #de muetsra con el doctor asociado
        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\n Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entrada : muestrasInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        //Búsqueda de investigador por ID de muestra
        String idBuscar = "M-002"; // Puedes cambiar este valor si lo deseas
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}