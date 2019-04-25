package estructuralibros;

import javax.swing.JOptionPane;

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
    
    public void desapilar(){
        if(cima != null){
            Nodo Eliminar = cima;
            cima = cima.siguiente;
            Eliminar.siguiente = null;
            longitud--;
        }
    }
    
    public Libro obtener(){
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
    
    public void mostrar(){
        if(vacio()){
            JOptionPane.showMessageDialog(null, "L=0\nNo hay nada en la pila.");
        }else{
            JOptionPane.showMessageDialog(null, "Longitud="+longitud()
                    +"->Titulo: "+obtener().getTitulo()
                    +", Autor: "+obtener().getAutor()
                    +", ISBN: "+obtener().getIsbn()+ "\n");
        }
    }
    
    public String MostrarTodo(){
        String strDato="";
        int intConteo=longitud;
        Nodo aux = cima;
        while(aux!=null){
            strDato+="Longitud="+intConteo
                    +"->Titulo: "+aux.libro.getTitulo()
                    +", Autor: "+aux.libro.getAutor()
                    +", ISBN: "+aux.libro.getIsbn()+ "\n";
        intConteo--;
        aux = aux.siguiente;
        }
        return strDato;
    }
    
    public void Vaciar(){
        while(cima != null){
            Nodo Eliminar = cima;
            cima = cima.siguiente;
            Eliminar.siguiente = null;
            longitud--;
        }
        JOptionPane.showMessageDialog(null, "Pila Vacia");
    }
}
