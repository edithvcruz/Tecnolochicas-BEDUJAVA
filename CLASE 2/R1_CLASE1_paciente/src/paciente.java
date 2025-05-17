package reto1;

public class paciente {
    String nombre;
    int edad;
    String numero_expediente;
    //depende del tipo de expediente que se planea almacenar, es decir si incluira letras o solo numeros

public void mostrarInformacion(){
    System.out.println("Información del paciente"+ "\n"+
            "Paciente:"+nombre+"\n"+
            "Edad:"+edad+"\n"+
            "Expediente:"+ numero_expediente);
}
}
