import java.util.Optional;
//SE IMPORTA PORQUE NO ESTA DE FORMA NATIVA EEN JAVA
public class Contacto {
    private Optional<String> telefono;

    public Contacto(String telefono) {
        this.telefono = Optional.ofNullable(telefono);
    //ofNullable  
    }

    public Optional<String> getTelefono() {
        return telefono;
    }
}