
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        FuncionEstreno estreno = new FuncionEstreno();
        FuncionNormal normal = new FuncionNormal();

        // Registrar función de estreno

        System.out.println("REGISTRO FUNCION DE ESTRENO");

        System.out.print("Ingrese el titulo de la pelicula: ");
        estreno.setTituloPelicula(entrada.nextLine());

        System.out.print("Ingrese la sala: ");
        estreno.setSala(entrada.nextLine());

        System.out.print("Capacidad de la sala: ");
        estreno.setCapacidadSala(entrada.nextInt());

        System.out.print("Cantidad de entradas vendidas: ");
        int entradasEstreno = entrada.nextInt();

        estreno.venderEntradas(entradasEstreno);

        entrada.nextLine();

        // Registrar función normal

        System.out.println("\nREGISTRO FUNCION NORMAL");

        System.out.print("Ingrese el titulo de la pelicula: ");
        normal.setTituloPelicula(entrada.nextLine());

        System.out.print("Ingrese la sala: ");
        normal.setSala(entrada.nextLine());

        System.out.print("Capacidad de la sala: ");
        normal.setCapacidadSala(entrada.nextInt());

        System.out.print("Cantidad de entradas vendidas: ");
        int entradasNormales = entrada.nextInt();

        normal.venderEntradas(entradasNormales);

        // Mostrar resultados

        System.out.println("\nRESULTADOS DEL CINE");

        estreno.mostrarDatos();

        System.out.println();

        normal.mostrarDatos();

        entrada.close();
    }
}

