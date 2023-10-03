/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcial;

/**
 *
 * @author Alan
 */
public class PrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arreglo
        Lista L1 = new Lista();
        L1.insertarIesimo(1, 0);
        L1.insertarIesimo(2, 1);
        L1.insertarIesimo(3, 2);
        System.out.println(L1);
        System.out.println(L1.iguales());
        //System.out.println(L1.frecuencia(2));
        //System.out.println(L1.indexOf(3));
        //System.out.println(L1.seEncuentra(2));
        //System.out.println(L1.palindrome());
        //encadenado
    }
    
}
