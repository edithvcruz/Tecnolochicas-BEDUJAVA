import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ¿Qué harás?"+ "\n"+
                " [1] Le respondes" + "\n"+
                " [2] Lo ignoras" +"\n"+
                " Elige una opción");
        int opcion = scanner.nextInt();
        scanner.close();
        return (opcion == 1) ? "Le respondes" : "Lo ignoras" ;
    }
}