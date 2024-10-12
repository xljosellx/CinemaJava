/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemajava;
public class Asientos {
    String etiqueta;
    boolean ocupado;

    public Asientos(String etiqueta) {
        this.etiqueta = etiqueta;
        this.ocupado = false;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public String mostrarAsiento() {
        return etiqueta;
    }
}
