package estructuralibros;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Colas {
    //Declaracion de las variable tipo Nodo
    private Nodo cabeza = null; //Cima tipo nodo igualado a null
    private Nodo ultimo;
    private int longitud = 0;//longitud de elementos de cuantos van a haber en la pila
    private class Nodo{//clase privada tipo nodo
        public Libro libro;//variable tipo estructura(libro)
        public Nodo siguiente = null;//noso que apunta al siguiente nodo.
        public Nodo(Libro libro){//Asigna el valor tipo estructura
            this.libro = libro;
        }
    }
    public void encolar(Libro libro){
        Nodo nodolibro = new Nodo(libro);
        if(cabeza == null){
            cabeza = nodolibro;
        }else{
            ultimo.siguiente=nodolibro;
        }
        ultimo = nodolibro;
        longitud++;
    }
    
    public void eliminar(){
        if(cabeza != null){
            Nodo eliminar = cabeza;
            eliminar.siguiente=null;
            if(cabeza == null){
                ultimo = null;
            }
        }
        longitud--;
    }
    
    public Libro obtener(){
        if(cabeza == null){
            return null;
        }else{
            return cabeza.libro;
        }
    }
}
