public class Main {
    public static void main(String[] args) {

        // Creamos un empleado y asignamos datos de forma segura
        Empleado e = new Empleado();
        e.setNombre("Valeria");
        e.setEdad(29);
        e.mostrarInfo();
        //LAS MODIFICACIONES SE HACEN ATRAVES DE SETTERS

        // Creamos un contrato que no se puede modificar después
        Contrato c = new Contrato("Tiempo completo", 25000.00);
        c.mostrarInfo();
        //DESDE ACA FINAL NO SE PUEDE MODIFICAR EN TIEMPO DE EJECUCION
    }
}