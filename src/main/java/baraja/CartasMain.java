/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

import javax.swing.JOptionPane;

/**
 *
 * @author yumara
 */
public class CartasMain {
    
    public static void main(String[] args) {
        
        boolean correcto = true;
        int numCartas;
        int opcion = 4;
        PaloCarta paloCarta = PaloCarta.OROS;
        
        final String VALOR_CORRECTO = "Introduce un valor correcto";
        final String MENU = """
                            1.- Crear carta aleatoria y mostrar
                            2.- Crear baraja y mostrar
                            3.- Sacar cartas, mostrarlas hasta que salga una carta pedida por el usuario
                            4.- Salir
                            """;
        JOptionPane.showMessageDialog(null, MENU);
        do{
        try{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción (1, 2, 3 o 4)"));
        if(opcion>4 || opcion<1){
            JOptionPane.showMessageDialog(null, VALOR_CORRECTO);
            correcto = false;
        }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, VALOR_CORRECTO);
            correcto = false;
        }
        } while (!correcto);
        
        switch (opcion) {
            case 1-> {
                Naipes n1 = new Naipes();
                System.out.println(n1.toString());
            }
            
            case 2 ->  {
                Barajas b1 = new Barajas();
                System.out.println(b1);
            }
            
            case 3 -> {
                do {
                numCartas = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de carta (1-12)"));
                } while (numCartas<1 || numCartas>12);
                Naipes cartaUsuario = new Naipes(numCartas, MetodosCartas.pedirPaloCarta());
                Naipes n1;
                do {
                    n1 = new Naipes();
                    System.out.println(n1.toString());

                } while (!n1.equals(cartaUsuario));
                
                System.out.println("La carta era " + cartaUsuario);
            }
        }
    }
    
}
