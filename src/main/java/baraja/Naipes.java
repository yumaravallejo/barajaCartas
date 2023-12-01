/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package baraja;

import java.util.Random;

/**
 *
 * @author yumara
 */
public class Naipes {

    private int numCarta;
    private PaloCarta paloCarta;

    //Constructor por defecto y aleatorio
    public Naipes() {
        Random rd = new Random();
        this.numCarta = rd.nextInt(1, 11);
        int valoresRandom = rd.nextInt(PaloCarta.values().length);
        if (valoresRandom == 1) {
            this.paloCarta = PaloCarta.OROS;
        } else if (valoresRandom == 2) {
            this.paloCarta = PaloCarta.BASTOS;
        } else if (valoresRandom == 3) {
            this.paloCarta = PaloCarta.ESPADAS;
        } else if (valoresRandom == 4) {
            this.paloCarta = PaloCarta.COPAS;
        }
    }


    
}
