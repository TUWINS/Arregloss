import java.util.Scanner;

public class Arregloss {

    public static int T = 25; // tamaño máximo del grupo (variable global)

    public static void leerCalificaciones() {

    }

    public static void evaluarCalificaciones() {

    }

    public static void main(String[] args) {
        double[] calificaciones = new double[5];
        double[] parcial1, parcial2, parcial3, parcial4; // Sólo declarando arreglos
        double[] promInd;
        boolean[] aprobados;
        // declarando y construyendo el arreglo

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escribe calificación [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        // No se imprime el contenido de todas las casillas del arreglo
        // sólo se imprime la dirección de memoria en donde empieza el arreglo
        // System.out.println("calificaciones: " + calificaciones);

        // Impresión usando el for extendido
        System.out.println("Contenido del arreglo calificaciones:");
        for (double calificacion : calificaciones)
            System.out.println(calificacion);

        System.out.println("Contenido de calificaciones:");
        // Impresión con el for tradicional
        for (int i = 0; i < calificaciones.length; i++)
            System.out.println(calificaciones[i]);
        sc.close();
    }
}
