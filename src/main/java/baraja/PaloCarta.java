/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package baraja;

/**
 *
 * @author yumara
 */
public enum PaloCarta {
    
    OROS("Oros"), BASTOS("Bastos"), ESPADAS("Espadas"), COPAS("Copas");
    
    private String paloCartas;
    
    private PaloCarta(String paloCartas){
        this.paloCartas = paloCartas;
    }

    public String getPaloCartas() {
        return paloCartas;
    }

    public void setPaloCartas(String paloCartas) {
        this.paloCartas = paloCartas;
    }

   
    
}
