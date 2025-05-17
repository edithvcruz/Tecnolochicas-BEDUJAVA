import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenamientoProduccion {
    public static void main(String[] args) {
        // Lista de órdenes
        List<OrdenProduccion> ordenes = new ArrayList<>();
        ordenes.add(new OrdenProduccion("OP-003", "Tornillo M6", 2));
        ordenes.add(new OrdenProduccion("OP-001", "Tuerca M8", 1));
        ordenes.add(new OrdenProduccion("OP-002", "Arandela 10mm", 3));

        // Orden natural: por producto (Comparable)
        Collections.sort(ordenes);
        System.out.println("📦 Órdenes ordenadas por producto (orden natural):");
        for (OrdenProduccion op : ordenes) {
            System.out.println(op);
        }
        //sort es un metodo estatico de la serie colletion
        //para ordenarlo debes de implementar comparable

        // Orden personalizado: por prioridad (Comparator)
        ordenes.sort(new Comparator<OrdenProduccion>() {
            @Override
            public int compare(OrdenProduccion a, OrdenProduccion b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
            //nosotros hacemos el codigo de la comparacion
            //usa metodo compare

        });

        System.out.println("\n🔥 Órdenes ordenadas por prioridad (1 = alta):");
        for (OrdenProduccion op : ordenes) {
            System.out.println(op);
        }
    }
}