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
    
    private Naipes[] baraja = new Naipes[40];
    
    public Barajas () {
        boolean correcto = true;
        for (int i = 0; i < baraja.length ; i++) {
           do {  
            baraja[i] = new Naipes();
                           
            } while (baraja[i] == baraja[i-1]);
            
        }
        
        
    }
    
}
