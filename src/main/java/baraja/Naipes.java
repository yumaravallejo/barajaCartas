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

    //Constructor por defecto y aleatorio (sin parámetros)
    public Naipes() {
        Random rd = new Random();
        this.numCarta = rd.nextInt(1, 11);
        int valoresRandom = rd.nextInt(1,5);
        if (valoresRandom == 1) {
            this.paloCarta = PaloCarta.OROS;
        } else if (valoresRandom == 2) {
            this.paloCarta = PaloCarta.BASTOS;
        } else if (valoresRandom == 3) {
            this.paloCarta = PaloCarta.ESPADAS;
        } else if (valoresRandom == 4) {
            this.paloCarta = PaloCarta.COPAS;
        } else {this.paloCarta = paloCarta;}
    }

    //Constructor parametrizado
    public Naipes(int numCartas, PaloCarta paloCarta) {
            this.numCarta = numCartas;
            this.paloCarta = paloCarta;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public PaloCarta getPaloCarta() {
        return paloCarta;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (numCarta){
                
        case 10 -> {
               sb.append("Rey de ").append(this.paloCarta);
        }
        
        case 9 -> {
               sb.append("Caballo de ").append(this.paloCarta);
        }
        
        case 8 -> {
               sb.append("Sota de ").append(this.paloCarta);
        }
        
        default -> {sb.append(numCarta + " de ").append(paloCarta);}
        
        }
        return sb.toString();
    }

    
    
}
