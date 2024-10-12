package cinemajava;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadMinima = 15;
        Cine cine = new Cine(8.00);

        ArrayList<Espectador> espectadores = new ArrayList<>();
        espectadores.add(new Espectador("Juan", 16, 10.00));
        espectadores.add(new Espectador("Maria", 14, 9.00));
        espectadores.add(new Espectador("Pedro", 18, 7.50));
        espectadores.add(new Espectador("Ana", 20, 12.00));

        boolean continuar = true;

        while (continuar) {
            System.out.println("Elige una opción:");
            System.out.println("1. Asignar un espectador");
            System.out.println("2. Mostrar estado de los asientos");
            System.out.println("3. Finalizar programa");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!espectadores.isEmpty()) {
                        Espectador espectador = espectadores.remove(0);
                        cine.asignarAsiento(espectador, edadMinima);
                    } else {
                        System.out.println("No hay más espectadores para asignar.");
                    }
                    break;
                case 2:
                    cine.mostrarAsientos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
