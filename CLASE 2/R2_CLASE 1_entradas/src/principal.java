//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class principal {
        public static void main(String[] args) {
            entrada evento1 = new entrada("Obra de Teatro", 450.0);
            entrada evento2 = new entrada("Musical", 650.0);

            //mostrar informacion
            evento1.mostrarInformacion();
            evento2.mostrarInformacion();
            //reto adicional
            entrada_record evento3 = new entrada_record("Concierto", 1450.0);
            evento3.mostrarInformacion();

        }
}