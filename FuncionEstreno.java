
public class FuncionEstreno extends FuncionCine {

    private double recargo = 0.20;

    public FuncionEstreno() {
        super();
    }

    public FuncionEstreno(String titulo, String sala,
                          int capacidad) {
        super(titulo, sala, capacidad);
    }

    @Override
    public double calcularRecaudacion() {

        double precio = TARIFA_BASE +
                        (TARIFA_BASE * recargo);

        return getAsientosOcupados() * precio;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("=== FUNCION DE ESTRENO ===");

        super.mostrarDatos();

        System.out.println("Recargo: 20%");
        System.out.println("Total con recargo: $" +
                           calcularRecaudacion());
    }
}

