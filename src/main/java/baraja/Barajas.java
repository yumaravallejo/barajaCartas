/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

/**
 *
 * @author yumara
 */
public class Barajas {

    final int CANT_BARAJA = 40;
    private final Naipes[] baraja;
    int n;

    public Barajas() {
        this.baraja = new Naipes[CANT_BARAJA];
        int contador = 0;
        for (PaloCarta palo : PaloCarta.values()) { //Esto 
            for (n = 1; n <= 10; n++) {
                this.baraja[contador++] = new Naipes(n, palo);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baraja.length; i++) {
            sb.append(i+ ".- ");
            sb.append(baraja[i]).append("\n");
        }
        return sb.toString();
    }

}
