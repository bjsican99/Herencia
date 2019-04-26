package estructuralibros;

import javax.swing.JOptionPane;

/**Estructuras para manipulacion de datos por medios de PILAS
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Pila {
    //Declaracion de las variable tipo Nodo
    private Nodo cima = null; //Cima tipo nodo igualado a null
    private int longitud = 0;//longitud de elementos de cuantos van a haber en la pila
    private class Nodo{//clase privada tipo nodo
        public Libro libro;//variable tipo estructura(libro)
        public Nodo siguiente = null;//noso que apunta al siguiente nodo.
        public Nodo(Libro libro){//Asigna el valor tipo estructura
            this.libro = libro;
        }
    }
    //Metodo para apilar nodos
    public void aplilar(Libro libro){
        Nodo nodo = new Nodo(libro);//crea un nuevo nodo con la estructura
        nodo.siguiente = cima;//el nodo sera el primero
        cima = nodo;//en la posicion se guarda los datos que tiene la estructura 
        longitud++;//lleva el conteo de cuantos van
    }
    //metodo para ir eliminando un elemento de la cima
    public void desapilar(){
        if(cima != null){//compra si la pila no esta vacia
            Nodo Eliminar = cima;////nodo eliminar que apunta a la cima
            cima = cima.siguiente;//la cima va a ser igual al siguiente
            Eliminar.siguiente = null;//elimina punteros para que no quede suelto
            longitud--;//resta uno a la variable
        }
    }
    //funcion para obtener la informacion del ultimo libro ingresado
    public Libro obtener(){
        if(cima == null){//verifica si la pila esta vacia y retorna un valor null
            return null;
        }else{//de lo contrario retorna los datos que existen en la cima
            return cima.libro;
        }
    }
    //funcion que retorna cuantos elementos hay en la cima
    public int longitud(){
        return longitud;
    }
    //funcion que retorna la longitud que verifica si la pila esta vacia
    public boolean vacio(){
        return longitud == 0;
    }
    //metodo para mostrar un elemento de la pila(el primer elemento)
    public void mostrar(){
        if(vacio()){//llama a la funcion vacio para comparar si hay elementos en la pila
            //muestra un mensaje
            JOptionPane.showMessageDialog(null, "L=0\nNo hay nada en la pila.");
        }else{//de lo contrario muestra el elemento de la cima
            JOptionPane.showMessageDialog(null, "Longitud="+longitud()
                    +"->Titulo: "+obtener().getTitulo()
                    +", Autor: "+obtener().getAutor()
                    +", ISBN: "+obtener().getIsbn()+ "\n");
        }
    }
    //funcion para mostrar todos los elementos de la pila
    public String MostrarTodo(){
        //variable auxiliares 
        String strDato="";
        int intConteo=longitud;
        Nodo aux = cima;//nodo que apunta a la cima de pila
        while(aux!=null){//verifica si la pila no esta vacia
            //guarda los datos en una variable auxiliar
            strDato+="Longitud="+intConteo
                    +"->Titulo: "+aux.libro.getTitulo()
                    +", Autor: "+aux.libro.getAutor()
                    +", ISBN: "+aux.libro.getIsbn()+ "\n";
        intConteo--;//
        aux = aux.siguiente;//el nodo apunta al siguiente nodo
        }
        return strDato;//retorna la variable con la infomacion recolectada
    }
    //funcion para eliminar todos los elementos de la cima
    public void Vaciar(){
        while(cima != null){//verifica si la pila no esta vacia
            //procedimiento de desapilar
            Nodo Eliminar = cima;
            cima = cima.siguiente;//cima apunta al siguiente nodo
            Eliminar.siguiente = null;//el punto eliminar lo apunta a nullo
            longitud--;//quita 1 a la longitud
        }
        JOptionPane.showMessageDialog(null, "Pila Vacia");//muestra un mensaje.
    }
}
