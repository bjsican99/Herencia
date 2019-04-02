package estructuralibros;
import javax.swing.*;
/**Software de Ingreso de libros
 * Guardados por medios de listas
 * por medios de una estructura
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Menu {
    public static void main(String[] args) { 
        //Diferentes tipos de variables
        Lista ls = new Lista();
        String sAutor, sTitulo, sIsbn;
        
        String stOp;//variable para guardar la opcion
        int itOp;//variable auxiliar 
        int intPos;//Variables de case3
        do{
            stOp=JOptionPane.showInputDialog("Seleccione una opcion:"
                    + "\n1) Insertar Al Principio"
                    + "\n2) Insertar Al Final"
                    + "\n3) Insertar En Una Posición"
                    + "\n4) Buscar Un Libro Por Posición"
                    + "\n5) Cantidad De Datos Ingresados"
                    + "\n6) Eliminar Todos Los Registros"
                    + "\n7) Eliminar Primer Registro"
                    + "\n8) Eliminar Ultimo Registro"
                    + "\n9) Buscar Libro y Eliminarlo"
                    + "\n10) Mostrar Todos Los Datos"
                    + "\n0) Finalizar Programa");
            itOp=Integer.parseInt(stOp);            
            //Menu Con diferentes opciones.
            switch(itOp){
                case 1://Llamado de metodo de la clase Lista para insertar en la primera posicion.
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    ls.insertarPrincipio(new Libro(sAutor,sTitulo,sIsbn));//crea una nueva estructura para guardar los datos
                    //Mostrar
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
                case 2://Llamado de metodo de la clase Lista para insertar en la ultima posicion.
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    ls.insertarFinal(new Libro(sAutor,sTitulo,sIsbn));
                    //Mostrar
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;  
                case 3://Llamado del metodo para insertar en una posicion determinada.
                    //Datos del Libro
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    //Posicion en la que se guardara                                      
                    intPos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese En que posicion Decea Guardar El libro"));
                    ls.insertarDespues(intPos, new Libro(sAutor,sTitulo,sIsbn));
                    //Mostrar
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
                case 4://Obtener la informacion de un nodo determinado.                  
                    intPos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese En que posicion Decea Guardar El libro"));
                    ls.obtener(intPos);                   
                break;
                case 5://Mostrar Cuatnos Datos Hay Ingresados
                    JOptionPane.showMessageDialog(null, ls.contar());
                break; 
                case 6://Eliminat Todos Los Registros
                    ls.Vaciar();
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;   
                case 7://Eliminar El Primer Registro
                    ls.eliminarPrimero();
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;    
                case 8://Elimina el ultimo dato de la lista
                    ls.eliminarUltimo();
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
                case 9://Buscar y eliminar un dato de la lista
                    intPos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Que Posicion Decea Eliminar"));
                    ls.eliminarLibro(intPos);
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;    
                case 10://Muestra todos los datos
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
                case 0://Fin del programa
                    itOp =0;
                break;
                default:JOptionPane.showMessageDialog(null, "Opción Invalida");
                break;
            }
        }while(itOp != 0);
        JOptionPane.showMessageDialog(null, "Fin Del Programa");
    }
}
