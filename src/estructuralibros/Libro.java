package estructuralibros;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Libro {//Estructura de Datos
        //Datos Que tendra la estructura
	private String titulo;
	private String autor;
	private String isbn;
        //Establece los datos recibidos en la estructura
	public Libro(String titulo, String autor, String isbn) {
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
	}
    /**
     * los get retorna el valor que tiene la estructura
     * los set asigna el valor recibido a cada varibale de la estructura
     * @return 
     */
        
        
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
        
	
}
