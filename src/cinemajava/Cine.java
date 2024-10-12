/*1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemajava;

import java.util.Random;

public class Cine {
    double precioEntrada;
    Asientos[][] asientos = new Asientos[8][9];
    Random random = new Random();

    public Cine(double precioEntrada) {
        this.precioEntrada = precioEntrada;
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                String etiqueta = "F" + (8 - i) + (char) ('A' + j);
                asientos[i][j] = new Asientos(etiqueta);
            }
        }
    }

    public boolean asignarAsiento(Espectador espectador, int edadMinima) {
        if (espectador.edad < edadMinima) {
            System.out.println(espectador.nombre + " no tiene la edad mínima.");
            return false;
        }
        if (espectador.dinero < precioEntrada) {
            System.out.println(espectador.nombre + " no tiene suficiente dinero.");
            return false;
        }

        int filaAleatoria;
        int columnaAleatoria;
        boolean asignado = false;

        do {
            filaAleatoria = random.nextInt(8);
            columnaAleatoria = random.nextInt(9);

            if (!asientos[filaAleatoria][columnaAleatoria].estaOcupado()) {
                asientos[filaAleatoria][columnaAleatoria].ocupar();
                System.out.println(espectador.nombre + " asignado al asiento: " + asientos[filaAleatoria][columnaAleatoria].mostrarAsiento());
                asignado = true;
            }
        } while (!asignado);

        return true;
    }

    public void mostrarAsientos() {
        System.out.println("Estado de los asientos (O: Ocupado, L: Libre):");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (asientos[i][j].estaOcupado()) {
                    System.out.print("O ");
                } else {
                    System.out.print("L ");
                }
            }
            System.out.println();
        }
    }
}
