// Definimos un record simple con dos campos
//No mutara sus atributos
public record Empleado(String nombre, Integer edad) {
}

// al definir un record java genera automaticamente contructor, metodos para los paramentros y metodos: equals, hascode y tostring