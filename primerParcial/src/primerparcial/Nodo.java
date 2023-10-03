/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author Alan
 */
public class Nodo {
    Nodo prox;
    int dato;
    Nodo prim;
    Nodo ult;
    int cant;
    int elem;
    
    public Nodo(){
        this.dato = dato;
        prox = null;
        this.prim = null;
        this.ult = prim;
        this.cant = 0;
        this.elem = elem;
    }
    
    public Nodo(Nodo prox, int dato, Nodo prim, Nodo ult, int cant){
        this.dato = dato;
        this.prox = prox;
        this.prim = prim;
        this.ult = ult;
        this.cant = cant;
        this.elem = elem;
    }
    
    
    public boolean vacia(){
        return prim == null;
    }
    
}
