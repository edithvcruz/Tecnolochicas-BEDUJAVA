package reto1;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
   //escaner del teclado
        paciente paciente1=new paciente();
        System.out.print("Ingresa el nombre del paciente:");
        //Sin In para que no de salto de linea
        paciente1.nombre=teclado.nextLine();
        System.out.print("Ingresa la edad del paciente:");
        //Sin In para que no de salto de linea
        paciente1.edad= teclado.nextInt();
        //para limpiar la informacion
        teclado.nextLine();
        System.out.print("Numero de expediente:");
        //Sin In para que no de salto de linea
        paciente1.numero_expediente= teclado.nextLine();
           teclado.close();
           //close para no pedir mas informacion
        paciente1.mostrarInformacion();
    }
}
