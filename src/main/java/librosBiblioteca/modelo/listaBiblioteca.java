package librosBiblioteca.modelo;

/**
 * en esta clase se crea la lista con los libros que se van a agregar
 * @param <N>
 */
public class listaBiblioteca <N>{

    public  Nodo<N> primero; public int tamaño;

    public listaBiblioteca(){
        primero=null;
        tamaño=0;
    }

    public void agregarLibro(N dato){    //metodo para agregar libro.
        primero=new Nodo<N>(dato,primero);this.tamaño++;
    }

    public void agregarLibroEnCola(N dato) { //metodo para agregar un libro a la biblioteca, a lo ultimo de la lista
        Nodo<N> Nf=new Nodo<N>(dato);this.tamaño++;
        Nodo<N> aux=primero;
        if(aux.sgt != null) aux = aux.sgt;
        aux.sgt=Nf;
    }

    public String Mostrar(){      //mostrar el libro
        String res="";
        for(Nodo<N> aux=primero; aux != null; aux=aux.sgt)
            res += aux.dato.toString()+"/n";
        return res;
    }

    public boolean EliminarLibro (N dato){
        Nodo<N> aux= primero, ant=null; boolean res=false;
        while (aux != null && !aux.dato.equals(dato)){
            ant=aux; aux=aux.sgt;
        }
        if (aux != null){
            res=true; this.tamaño--;
            if (ant ==null) primero=aux.sgt;
            else ant.sgt=aux.sgt;
        }
        return res;
    }

}
