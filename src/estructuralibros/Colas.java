package estructuralibros;
import javax.swing.JOptionPane;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Colas {
    //Declaracion de las variable tipo Nodo
    private Nodo cabeza=null; //Cabeza tipo nodo 
    private Nodo ultimo=null;
    private class Nodo{//clase privada tipo nodo
        public Libro libro;//variable tipo estructura(libro)
        public Nodo siguiente;//noso que apunta al siguiente nodo.
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
    }
    
    public void eliminar(){
        if(cabeza != null){
            Nodo eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente=null;
            if(cabeza == null){
                ultimo = null;
            }
        }
    }
    
    public Libro obtener(){
        if(cabeza == null){
            return null;
        }else{
            return cabeza.libro;
        }
    }
    
    
    public void mostrar(){
        if(cabeza == null){//llama a la funcion vacio para comparar si hay elementos en la cola
            //muestra un mensaje
            JOptionPane.showMessageDialog(null, "L=0\nNo hay nada en la Cola.");
        }else{//de lo contrario muestra el elemento de la cabeza
            JOptionPane.showMessageDialog(null, "Cabeza= "
                    +"->Titulo: "+obtener().getTitulo()
                    +", Autor: "+obtener().getAutor()
                    +", ISBN: "+obtener().getIsbn()+ "\n");
        }
    }
    
     public String MostrarTodo(){
        //variable auxiliares 
        String strDato="";
        Nodo aux = cabeza;//nodo que apunta a la cabeza de cabeza
        while(aux!=null){//verifica si la cola no esta vacia
            //guarda los datos en una variable auxiliar
            strDato+="->Titulo: "+aux.libro.getTitulo()
                    +", Autor: "+aux.libro.getAutor()
                    +", ISBN: "+aux.libro.getIsbn()+ "\n";
        aux = aux.siguiente;//el nodo apunta al siguiente nodo
        }
        return strDato;//retorna la variable con la infomacion recolectada
    }
     
    //funcion para eliminar todos los elementos de la cabeza
    public void Vaciar(){
        while(cabeza != null){//verifica si la pila no esta vacia
            //procedimiento de desencolar
            Nodo Eliminar = cabeza;
            cabeza = cabeza.siguiente;//cabeza apunta al siguiente nodo
            Eliminar.siguiente = null;//el punto eliminar lo apunta a null
        }
        JOptionPane.showMessageDialog(null, "Cola Vacia");//muestra un mensaje.
    } 
}
