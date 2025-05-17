import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class PlaneacionEducativa {
    public static void main(String[] args) {

        // Usando CopyOnWriteArrayList para crear lista con numero de prioridad
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Ordenar alfabeticamente
        Collections.sort(temas);
        System.out.println("Temas  ordenados alfabéticamente:");
        for (Tema tema_m : temas) {
            System.out.println(tema_m);
        }

        //Ordenar por prioridad usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // Prioridad ascendente
            }
        });

        System.out.println("\n Temas ordenados por prioridad (1 = urgente):");
        for (Tema tema_n : temas) {
            System.out.println(tema_n);
        }

//Concurrencia
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Paso 6: Mostramos el repositorio de recursos por tema
        System.out.println("\n Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}