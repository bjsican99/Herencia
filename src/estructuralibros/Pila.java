package estructuralibros;

/**Estructuras para manipulacion de datos por medios de PILAS
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Pila {
    private Nodo cima = null; 
    private int longitud = 0;
    private class Nodo{
        public Libro libro;
        public Nodo siguiente = null;
        public Nodo(Libro libro){
            this.libro = libro;
        }
    }
    
    public void aplilar(Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cima;
        cima = nodo;
        longitud++;
    }
    
    public void desapilar(Libro libro){
        if(cima != null){
            Nodo Eliminar = cima;
            cima = cima.siguiente;
            Eliminar.siguiente = null;
            longitud--;
        }
    }
    
    public Libro obtener(Libro libro){
        if(cima == null){
            return null;
        }else{
            return cima.libro;
        }
    }
    
    public int longitud(){
        return longitud;
    }
    
    public boolean vacio(){
        return longitud == 0;
    }
}
