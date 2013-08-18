package librosBiblioteca.modelo;

/**
 * Created with IntelliJ IDEA.
 * User: David Restrepo
 * Date: 14/08/13
 * Time: 06:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Nodo <N>  {
    N dato;
    Nodo<N> sgt;


    public Nodo(N dato){
        this(dato,null);
    }
    Nodo(N dato, Nodo<N>sgt){
        this.dato=dato;
        this.sgt=sgt;
    }

}
