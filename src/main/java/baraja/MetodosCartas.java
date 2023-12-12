/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yumara
 */
public class MetodosCartas {

    public static PaloCarta pedirPaloCarta() {
        boolean correcto = true;
        Scanner sc = new Scanner(System.in);
        final String COPAS= "Copas";
        final String OROS= "Oros";
        final String BASTOS= "Bastos";
        final String ESPADAS= "Espadas";
                
        do {
            String palo = JOptionPane.showInputDialog("Introduce un palo");
            if (palo.equalsIgnoreCase(BASTOS)) {
                return PaloCarta.BASTOS;
            } else if (palo.equalsIgnoreCase(OROS)) {
                return PaloCarta.OROS;
            } else if (palo.equalsIgnoreCase(COPAS)) {
                return PaloCarta.COPAS;
            } else if (palo.equalsIgnoreCase(ESPADAS)) {
                return PaloCarta.ESPADAS;
            } else {
                System.out.println("Introduce un valor correcto");
                correcto = false;
            }
        } while (!correcto);
        return PaloCarta.BASTOS;
    }


}
    


