package estructuralibros;

import javax.swing.JOptionPane;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Lista {  
        //Declaracion de las variable tipo Nodo
	private Nodo cabeza=null;//cabeza tipo null
	private int longitud=0;//lleva el conteo de cuantos registros van 
	private class Nodo{ 
                //Declara variables de tipo estructura para tener la informacion
                //guardada en un nodo.
                public Libro libro;
		public Nodo siguiente=null;
		public Nodo(Libro libro) {//el nodo asigna el valor tidpo estructura
			this.libro = libro;
		}
	}
        //Metodo para ingresar al principio del nodo
	public void insertarPrincipio(Libro libro) {//inserta el principio del nodo
		Nodo nodo=new Nodo(libro);//guarda los datos de tipo estrucutra en un Nodo               
                nodo.siguiente=cabeza;//el nodo sera el primero
                cabeza=nodo;//en la posicion se guardara los datos que tiene la estructura
                longitud++;//llevan el conteo de cuantos registros van            
	}
        //Metodo para ingresar al final del nodo
	public void insertarFinal(Libro libro) {
		Nodo nodo=new Nodo(libro);//almacena la info. en una variable tipo nodo
		if (cabeza==null) {
			cabeza=nodo;//si el primero es null, el primero sera al nodo con la info
		} else {
                        //De Lo contrario
                        
			Nodo puntero=cabeza;//Puntero tipo Nodo sera igual a la cabeza
			while (puntero.siguiente!=null) {//mientras no llegue al final
				puntero=puntero.siguiente;//puntero se asignara al siguiente
                                //se asignara en la ultima posicion de todos
			}
			puntero.siguiente=nodo;//la informacion se asignara en el ultimo nodo creado
		}
		longitud++;
	}
        //Metodo para ingresar en una posicion determinada
	public void insertarDespues(int n, Libro libro) {//recibe parametros tipo integer y estructura
		Nodo nodo=new Nodo(libro);//Creacion de Variable nodo con la info de la estructura
		if (cabeza==null) {
                        //si la cabeza es null, la cabeza tendra el nodo con la estructura
			cabeza=nodo;
		} else {                       
                        //puntero de tipo nodo sera igual a la cabeza
			Nodo puntero=cabeza;
			int contador=0;//contador igual a cero
                        //mientras contador sea menor al valore recibio(int) y el puntero no sea igual a null.
			while (contador<n && puntero.siguiente!=null) {
                                //va recorriendo hasta llegar a la posicion indicada, y el puntero
                                //ira cambiando de posicion hasta que se rompa el ciclo
				puntero=puntero.siguiente;
				contador++;
			}//el nodo siguiente = al puntero en la siguiente posicion
                        //y el puntero sera igual a la informacion del nodo que tiene la info de la Estructura
			nodo.siguiente=puntero.siguiente;
			puntero.siguiente=nodo;
		}
		longitud++;
	}
	//Metodo de tipo estructura para buscar un registro y mostrarlo
        public Libro obtener(int n) {
                //si esta vacio, retornara un dato null.
		if (cabeza==null) {
			return null;
		} else {
                    //se crea un puntero que se asigna al principio de todo.
			Nodo puntero=cabeza;
			int contador=0;
                        //va Recorriendo hasta que contador sea menor al dato ingresado
                        //y media vez no llegue al final de la lista
			while (contador<n && puntero.siguiente!=null) {
                            //el puntero va recorriendo toda la lista hasta que el ciclo se rompa
				puntero=puntero.siguiente;
				contador++;
			}
                        //si contador es diferente al dato recibido, retorna un valor nulo
			if (contador!=n) {
				return null;
			} else {
                            //De lo contrario imprime la informacion que tiene la posicion del puntero
                            //la infomacion de libro y obtienes todos los get de libro.
                                JOptionPane.showMessageDialog(null,"{Titulo: "+puntero.libro.getTitulo()+", Autor: "+puntero.libro.getAutor()+", ISBN: "+puntero.libro.getIsbn()+ "}\n");
				return puntero.libro;
			}
		}
                
	}
	//retorna todos cuantos valores van registrados
        public int contar() {
		return longitud;
	}
        //verifica si la lista esta vacia
        public boolean estaVacia() {
            return cabeza==null;
        }
        //elimina todos los datos de la lista
        public void Vaciar() {
        //Si la lista no esta vacia
            if (cabeza!=null){
                //se crea un nodo que lleva la cabeza
                Nodo primer = cabeza;
                //la cabeza y la siguiente posicion se igualan a null
                cabeza=cabeza.siguiente=null;
                //se descuenta uno a la longitud
                //para llevar el conteo de los datos registrados
                longitud--;
            }
            longitud--;
        }
        //elimina el primer Nodo
        public void eliminarPrimero(){
            //el primer dato sera el que tiene el segundo dato
            //se remplaza el primero por el segundo
            cabeza=cabeza.siguiente;
        }
        //Elimina el ultimo nodo 
        public void eliminarUltimo() {
        //si el primer dato no es nulo
            if (cabeza!= null) {
                //si el siguiente es null
                if (cabeza.siguiente==null) {
                    //el primero sera igual a null
                    //se resta uno a la longitud
                    cabeza=null;  
                    longitud--;
                } else {
                    //de lo contrario se crea un puntero asignado al primer nodo
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {
                        //si el siguiente es es diferente de null
                        //el nodo recorrera toda la lista hasta que se rompa el ciclo.
                        puntero=puntero.siguiente;
                    }
                    //el nodo en la posicion cn respecto al ciclo, sera igual a null
                    puntero.siguiente=null;
                    longitud--;
                }
            }
        }
        //Funcion para mostrar todos los datos.   
        public String Listar(){           
            //Crea una variable tipo String y un nodo que se asigna al principio de todo
		String Dato="";
		Nodo aux=cabeza;
                //recorre toda la lista hasta hasta llegar al final
		while (aux!=null){
                    //con los get obtiene todos los datos y los guarda en la la variable Estring
                    //el aux se pasa a la siguiente posicion.
                    Dato+="{Titulo: "+aux.libro.getTitulo()+", Autor: "+aux.libro.getAutor()+", ISBN: "+aux.libro.getIsbn()+ "}\n";
                    aux=aux.siguiente;                   
		}
                //retorna la variable tipo estring
                return Dato;
	}
        //Metodo para buscar y eliminar un nodo determinado.
        public void eliminarLibro(int n) {
            //verifica si no esta vacia la lista
            if (cabeza!=null){
                //si el dato recibido es 0
                if (n==0){
                    //Se crea una variable tipo nodo, y se asigna al principio de la lista
                    //la cabeza se asigna al siguiente nodo
                    //La variable tipo Nodo se para a la siguiente posicion y se iguala a null
                    //se resta 1 a la cantidad de registros.
                    Nodo primer=cabeza;
                    cabeza=cabeza.siguiente;
                    primer.siguiente=null;
                    longitud--;
                } else if (n<longitud) {
                    //Se crea un nodo y se inicializa al principio de la lista
                    Nodo puntero=cabeza;
                    int contador=0;
                    //mientras el contador sea menor al valor recibido menos 1, entonces
                    while (contador<(n-1)){
                        //puntero se pasa a la siguiente posicion.
                        //y contador se va aumentando
                        puntero=puntero.siguiente;
                        contador++;
                    }
                    //el nodo temporal sera igual al puntero en la siguiente posicion
                    //el puntero de la siguiente posicion sera igual a temporal
                    //temporal sera igual a null
                    Nodo temp=puntero.siguiente;
                    puntero.siguiente=temp.siguiente;
                    temp.siguiente=null;
                    longitud--;
                }
            }
        }
}
