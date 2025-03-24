/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author luisr
 */
public class TipoVentana {

    public enum Ventana {
        INICIO(1),
        OPCIONES(2),
        ORDENAMIENTO(3);

        private final int index;

        Ventana(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }
}
