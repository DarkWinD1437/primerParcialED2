
package listas;


public class ListaS {

    private Nodo prim;
    private Nodo ult;
    private int cant;
    
    public ListaS(){
        this.prim=null;
        this.ult=prim;
        this.cant=0;
    }
    
    
    //1. toString
   
public String toString() {
        String cad = "[ ";
        Nodo aux = prim;
        while (aux != null) {
            cad = cad + aux.dato;
            if (aux.prox != null) {
                cad = cad + ", ";
            }
            aux = aux.prox;
        }
        cad = cad + " ]";
        return cad;
    }



//2. insertarIesimo

public void insertarIesimo(int x, int i) {
        Nodo p = prim, ap = null;
        int k = 0;
        while (p != null && k < i) {
            ap = p;
            p = p.prox;
            k++;
        }
        insertarNodo(x, ap, p);
    }
    
//otra opcion de eliminar prim

public void insertarNodo(int x, Nodo ap, Nodo p) {
        if (ap == null) {
            insertarPrim(x);
            return;
        }
        if (p == null) {
            insertarUlt(x);
            return;
        }
        ap.prox = new Nodo(p, x);
        cant++;
    }
//3. eliminarIesimo

public void eliminarIesimo(int i){
int k=1;
Nodo p= prim,
ap =null;
while(p!=null && k<i){
ap=p;
p=p.prox;
k++;
}
eliminarNodo(ap,p);
}
            
      private Nodo eliminarNodo(Nodo ap,Nodo p){if (ap==null) {
eliminarPrim();
return prim;
}
ap.prox=p.prox;
if (ult==p)
ult=ap;
cant--;
return ap.prox;
}  

//4. insertraPrim

public void insertarPrim(int x) {
        if (vacia()) {
            prim = ult = new Nodo(null, x);
        } else {
            prim = new Nodo(prim, x);
        }
        cant++;
    }

//5.insertarUlt

public void insertarUlt(int x) {
           if(vacia())
               prim = ult = new Nodo( null, x);
           else
               ult = ult.prox = new Nodo( null, x);
           cant++;
}


//6.eliminarPrim

public void eliminarPrim(){
                if (vacia()) return;
                prim=prim.prox;
                cant--;
}



//7.eliminarUlt

public void eliminarUlt(){
        if (prim == ult) {
            prim = ult = null;
        } else {
            Nodo aux = prim;
            while (aux.prox != ult) {
                aux = aux.prox;
            }
            ult = aux;
            ult.prox = null;
        }
        cant--;
    
}




    
/////////////////////////////////////////////////////////////////
    //FUNCIONES ADICIONALES//
    
//1. iguales

public boolean iguales() {
        Nodo aux = prim;
        int a = aux.dato;
        while (aux != null) {
            if (aux.dato != a) {
                return false;
            }
            aux = aux.prox;
        }
        return true;
    }



//2. mayorElem

    public int mayorElem() {
        Nodo aux = prim;
        int may = aux.dato;
        while (aux != null) {
            if (aux.dato > may) {
                may = aux.dato;
            }
            aux = aux.prox;
        }
        return may;
    }


//3. frecuencia

public int frecuencia(int x) {
        Nodo aux = prim;
        int cont = 0;
        while (aux != null) {
            if (aux.dato == x) {
                cont = cont + 1;
            }
            aux = aux.prox;
        }
        return cont;
    }

//4. existeFRec

 public boolean existeFrec(int k) {
        Nodo aux = prim;
        while (aux != null) {
            if (frecuencia(aux.dato) == k) {
                return true;
            }
            aux = aux.prox;
        }
        return false;
    }

//5. poker

  public boolean poker() {
        return existeFrec(cant-1);
    }

/////////////////////////////////////


public boolean vacia(){
           return cant == 0;
       }

public boolean Par(){
        Nodo x = this.prim;
        while(x != null){
            int dato = x.dato;
            if(dato %2 == 0){
                return true;
            }
            x =x.prox;
        }
        return false;
    }

    
    public static void main(String[] args) {

          ListaS l1 = new ListaS();
        l1.insertarPrim(1);
        l1.insertarPrim(12);
        l1.insertarPrim(12);
        l1.insertarPrim(12);
        l1.insertarPrim(12);

        //   System.out.println(l1);
      //  l1.insertarUlt(2);
        System.out.println(l1.poker());
       // l1.eliminaPrim();
     //  l1.mayorElem();
   //  l1.frecuencia(4);
       // System.out.println(l1);

    }
    
}
