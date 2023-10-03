
package listaa;


public class ListaA {
    
    int elem[];
    int cantElem;
    
    public ListaA(){
        this.elem = new int [50];
        this.cantElem = 0;
    }

  
    
    public boolean vacio(){
        return cantElem == 0;
    }
    
    public boolean lleno(){
        return elem.length - 1 == cantElem;
    }
/////////////////////////////////////////////////////////////////
    //FUNCIONES AUXILIARES//
    
    //1. toString
    
    @Override
    public String toString(){
        String s = "[";
        for(int i = 0; i < cantElem; i++){
            s = s + elem[i];
            if(i < cantElem - 1)
                s = s + ", ";
        }
        return s+"]";
    }

//2. insertarIesimo
    
public void insertarIesimo(int x, int i){
        for(int k = cantElem; k > i; k--){
            elem[k] = elem[k - 1];
        }
        elem[i] = x;
        cantElem++;
    } 

//3. eliminarIesimo

public void eliminarIesimo(int i){
        for(int k = i+1; k < cantElem; k++){
            elem[k - 1] = elem[k];
        }
        cantElem--;
    }

//4. insertraPrim

public void insertarPrim(int x){
        insertarIesimo(x, 0);
    }

//5.insertarUlt

public void insertarUlt(int x){
        elem[cantElem] = x;
        cantElem++;
    }

//6.eliminarPrim

public void eliminarPrim(){
	eliminarIesimo(0);
}

//7.eliminarUlt

public void eliminarUlt(){
	cantElem--;
}
    
/////////////////////////////////////////////////////////////////
    //FUNCIONES ADICIONALES//
    
//1. iguales
public boolean iguales() {
        int a = elem[0];
        for (int i = 0; i < cantElem; i++) {
            if (elem[i] != a) {
                return false;
            }
        }
        return true;
    }

//2. mayorElem

public int mayorElem() {
        int may = elem[0];
        for (int i = 0; i < cantElem; i++) {
            if (elem[i] > may) {
                may = elem[i];
            }
        }
        return may;
    }

//3. frecuencia

public int frecuencia(int x) {
        int cont = 0;
        for (int i = 0; i < cantElem; i++) {
            if (elem[i] == x) {
                cont++;
            }
        }
        return cont;
    }

//4. existeFRec

public boolean existeFrec(int k) {
        for (int i = 0; i < cantElem; i++) {
            if (frecuencia(elem[i]) == k) {
                return true;
            }
        }
        return false;
    }

//5. poker

public boolean poker() {
        return existeFrec(cantElem - 1);
    }

/////////////////////////////////////

public void insertarAsc(int x){
        int i = 0;
        while(i < cantElem && x > elem[i])
            i++;
        insertarIesimo(x, i);
    }

public int indexOf(int x){
        for (int i = 0; i < cantElem; i++) {
            if(elem[i] == x) 
                return i; 
        }
        return -1;
    }

public boolean palindrome(){
        for(int i = 0, j = cantElem - 1; i < j; i++, j--){
            if(elem[i] != elem[j])
                return false;
        }
        return true;
    }


public void reemplazar(int x, int y){
        for(int i = 0; i < cantElem; i++){
            if(elem[i] == x)
                elem[i] = y;
        }
    }

/*public void invertir(){
        for (int i = 0; i < cantElem; i++) {
            insertarUlt(elem[0]);
            cantElem--;
        }
    }*/


public void eliminarExtremos(){
	eliminarPrim();
	eliminarUlt();
}    

    
    
    public static void main(String[] args) {
        ListaA l1 = new ListaA();
        l1.insertarPrim(4);
        l1.insertarPrim(4);
        l1.insertarUlt(4);
        l1.insertarPrim(1);
        System.out.println(l1);
        /*l1.eliminarPrim();
        System.out.println(l1);*/
       // l1.eliminaPrim();
     //  l1.mayorElem();
   //  l1.frecuencia(4);
        System.out.println(l1.poker());

    }
    
}
