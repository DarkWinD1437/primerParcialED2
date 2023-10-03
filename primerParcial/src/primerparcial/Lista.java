/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author Alan
 */
public class Lista {
    int elem[];
    int cantElem;
    
    public Lista(){
        this.elem = new int [50];
        this.cantElem = 0;
    }
    
    public boolean vacio(){
        return cantElem == 0;
    }
    
    public boolean lleno(){
        return elem.length - 1 == cantElem;
    }
    
    //toString
    ///public String toString(){
    //    String s = "[";
    //    for(int i = 0; i < cantElem; i++){
    //        s = s + elem[i];
    //        if(i < cantElem - 1)
    //            s = s + ", ";
    //    }
    //    return s+"]";
    //}

    //1
   /* public boolean iguales(){
        int x = elem[0];
        for(int i = 0; i < cantElem; i++){
            if(elem[i] != x)
                return false;
        }
        return true;
    }*/
    
    //2
    public int frecuencia(int x){
        int c = 0;
        for(int i = 0; i < cantElem; i++){
            if(elem[i] == x)
                c++;
        }
        return c;
    }
    
    //3
    public int indexOf(int x){
        for(int i = 0; i < cantElem; i++){
            if(elem[i] == x)
                return i;
        }
        return -1;
    }
    
    //4
    public boolean seEncuentra(int x){
        for(int i = 0; i < cantElem; i++){
            if(elem[i] == x)
                return true;
        }
        return false;
    }
    
    //5
    public boolean palindrome(){
        for(int i = 0, j = cantElem - 1; i < j; i++, j--){
            if(elem[i] != elem[j])
                return false;
        }
        return true;
    }
    
    public void invertir(){
        for (int i = 0; i < cantElem; i++) {
            insertarUlt(elem[0]);
            cantElem--;
        }
    }
    
    public void insertarAsc(int x){
        int i = 0;
        while(i < cantElem && x > elem[i])
            i++;
        insertarIesimo(x, i);
    }
    
    public void reemplazar(int x, int y){
        for(int i = 0; i < cantElem; i++){
            if(elem[i] == x)
                elem[i] = y;
        }
    }
    
    
    public void eliminarExtremos(){
	eliminarPrim();
	eliminarUlt();
}

    
    
    
    //auxiliares
    public void insertarIesimo(int x, int i){
        for(int k = cantElem; k > i; k--){
            elem[k] = elem[k - 1];
        }
        elem[i] = x;
        cantElem++;
    }
    
    
    public void eliminarIesimo(int i){
        for(int k = i+1; k < cantElem; k++){
            elem[k - 1] = elem[k];
        }
        cantElem--;
    }
    
    public void insertarPrim(int x){
        insertarIesimo(x,0);
    }
    
    public void insertarUlt(int x){
        elem[cantElem] = x;
        cantElem--;
    }
    
    public void eliminarPrim(){
	eliminarIesimo(0);
    }

    public void eliminarUlt(){
	cantElem--;
    }
    
    ////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////
    //Encandenado
    
    public String toString(){
        String S1 = "[";
        Nodo p = prim;
        while(p != null){
            S1 = S1 + p.dato;
            if(p.prox != null)
                S1 = S1 + ", ";
            p = p.prox;
        }
        S1 = S1 + "]";
        return S1;
    }
    
    public boolean iguales(){
        Nodo aux = prim;
        int a = aux.elem;
        while(aux != null){
            if(aux.elem != a)
                return false;
            aux = aux.prox;
        }
        return true;
    }
}
