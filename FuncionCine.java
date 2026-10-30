public class FuncionCine {

    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;

    private int capacidadSala;

    public static final double TARIFA_BASE = 12000;

    // Constructor sin parámetros
    public FuncionCine() {
    }

    // Constructor con parámetros
    public FuncionCine(String tituloPelicula, String sala,
                       int capacidadSala) {
        setTituloPelicula(tituloPelicula);
        setSala(sala);
        setCapacidadSala(capacidadSala);
        setAsientosOcupados(0);
        setRecaudacion(0);
    }

    // Métodos SET

    public void setTituloPelicula(String tituloPelicula) {
        if (tituloPelicula != null && !tituloPelicula.trim().isEmpty()) {
            this.tituloPelicula = tituloPelicula;
        }
    }

    public void setSala(String sala) {
        if (sala != null && !sala.trim().isEmpty()) {
            this.sala = sala;
        }
    }

    public void setCapacidadSala(int capacidadSala) {
        if (capacidadSala > 0) {
            this.capacidadSala = capacidadSala;
        }
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0 &&
            asientosOcupados <= capacidadSala) {
            this.asientosOcupados = asientosOcupados;
        }
    }

    public void setRecaudacion(double recaudacion) {
        if (recaudacion >= 0) {
            this.recaudacion = recaudacion;
        }
    }

    // Métodos GET

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getSala() {
        return sala;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    // Calcular recaudación
    public double calcularRecaudacion() {
        return asientosOcupados * TARIFA_BASE;
    }

    // Registrar venta de entradas
    public void venderEntradas(int cantidad) {

        if (cantidad > 0 &&
            asientosOcupados + cantidad <= capacidadSala) {

            asientosOcupados += cantidad;
            recaudacion = calcularRecaudacion();

            System.out.println("Venta realizada correctamente.");

        } else {
            System.out.println("No se pudo realizar la venta.");
        }
    }

    // Mostrar información
    public void mostrarDatos() {

        System.out.println("Película: " + tituloPelicula);
        System.out.println("Sala: " + sala);
        System.out.println("Asientos ocupados: " + asientosOcupados);
        System.out.println("Capacidad: " + capacidadSala);
        System.out.println("Recaudación: $" + recaudacion);
    }
}

