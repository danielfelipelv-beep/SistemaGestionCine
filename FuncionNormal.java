public class FuncionNormal extends FuncionCine {

    public FuncionNormal() {
        super();
    }

    public FuncionNormal(String titulo, String sala,
                         int capacidad) {
        super(titulo, sala, capacidad);
    }

    @Override
    public double calcularRecaudacion() {

        return getAsientosOcupados() * TARIFA_BASE;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("=== FUNCION NORMAL ===");

        super.mostrarDatos();

        System.out.println("Precio por boleta: $" +
                           TARIFA_BASE);
    }
}

