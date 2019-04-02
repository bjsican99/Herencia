package estructuralibros;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Lista {       
	private Nodo cabeza=null;
	private int longitud=0;
	private class Nodo{ 
                public Libro info;
                public Libro libro;
		public Nodo siguiente=null;
		public Nodo(Libro libro) {
			this.libro = libro;
		}
	}
        
	public void insertarPrincipio(Libro libro) {
		Nodo nodo=new Nodo(libro);
                
                nodo.siguiente=cabeza;
                cabeza=nodo;
                longitud++;                
	}
        
	public void insertarFinal(Libro libro) {
		Nodo nodo=new Nodo(libro);
		if (cabeza==null) {
			cabeza=nodo;
		} else {
			Nodo puntero=cabeza;
			while (puntero.siguiente!=null) {
				puntero=puntero.siguiente;
			}
			puntero.siguiente=nodo;
		}
		longitud++;
	}
        
	public void insertarDespues(int n, Libro libro) {
		Nodo nodo=new Nodo(libro);
		if (cabeza==null) {
			cabeza=nodo;
		} else {                       
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			nodo.siguiente=puntero.siguiente;
			puntero.siguiente=nodo;
		}
		longitud++;
	}
	
        public Libro obtener(int n) {
		if (cabeza==null) {
			return null;
		} else {
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			if (contador!=n) {
				return null;
			} else {
				return puntero.libro;
			}
		}
	}
	public int contar() {
		return longitud;
	}
        public boolean estaVacia() {
            return cabeza==null;
        }
        public void eliminaPrincipio() {
            if (cabeza!=null){
                Nodo primer = cabeza;
                cabeza=cabeza.siguiente=null;
                longitud--;
            }
        }
        public void eliminarUltimo() {
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    cabeza=null;  
                    longitud--;
                } else {
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=null;
                    longitud--;
                }
            }
        }
        
        public void Listar(){               
		String Dato="";
		Nodo aux=cabeza;
                System.out.println("\n");
		while (aux!=null){
                    Dato+="{Titulo: "+aux.libro.getTitulo()+", Autor: "+aux.libro.getAutor()+", ISBN: "+aux.libro.getIsbn()+ "}\n";
                    aux=aux.siguiente;                   
		}
                System.out.println(Dato);
	}
        
        public void eliminarLibro(int n) {
            if (cabeza!=null){
                if (n==0){
                    Nodo primer=cabeza;
                    cabeza=cabeza.siguiente;
                    primer.siguiente=null;
                    longitud--;
                } else if (n<longitud) {
                    Nodo puntero=cabeza;
                    int contador=0;
                    while (contador<(n-1)){
                        puntero=puntero.siguiente;
                        contador++;
                    }
                    Nodo temp=puntero.siguiente;
                    puntero.siguiente=temp.siguiente;
                    temp.siguiente=null;
                    longitud--;
                }
            }
        }
}
