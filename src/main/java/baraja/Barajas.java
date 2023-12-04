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

    public Barajas() {
        boolean correcto = true;
        System.out.println("La baraja es: ");
        for (int i = 0; i < baraja.length; i++) {
            do {
                baraja[i] = new Naipes();
                System.out.println(baraja[i]);
            } while (yaContieneValor(baraja, baraja[i]));
        }
    }
        private static boolean yaContieneValor(Naipes[] array, Naipes carta){
            for(Naipes elemento : array){
                if(elemento == carta) {
                    return true;
                }               
            }
            return false;
        }
    }

    

