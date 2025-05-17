public final class Contrato {
//FINAL PARA QUE SEA INMUTABLE

    // Atributos privados y finales
    private final String tipo;
    private final double salario;

    // Constructor que inicializa todos los atributos
    public Contrato(String tipo, double salario) {
        this.tipo = tipo;
        this.salario = salario;
    }

    // Solo getters, sin setters
    public String getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("📄 Contrato: " + tipo + ", Salario: $" + salario);
    }
}