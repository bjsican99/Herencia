package estructuralibros;
import javax.swing.*;
/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Menu {
    public static void main(String[] args) { 
        //Diferentes tipos de variables
        Lista ls = new Lista();
        String sAutor, sTitulo, sIsbn;
        
        String stOp;//variable para guardar la opcion
        int itOp;//variable auxiliar 
        
        String sPos;int intPos;//Variables de case3
        do{
            stOp=JOptionPane.showInputDialog("Seleccione una opcion:\n"+"1) insertar al principio\n2) insertar al final"+
             "\n3) insertar despues de n\n4) obtener informacion\n5) cantidad de datos en la lista\n6) vaciar\n7) Eliminar el priemro \n8) elimminar libro"+
              "\n9) Visualizar datos \n0) para salir ingrese 0");
            itOp=Integer.parseInt(stOp);
            
            //Menu Con diferentes opciones.
            switch(itOp){
                case 1://Llamado de metodo de la clase Lista para insertar en la primera posicion.
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    ls.insertarPrincipio(new Libro(sAutor,sTitulo,sIsbn));
                    //Mostrar
                    ls.Listar();
                break;
                case 2://Llamado de metodo de la clase Lista para insertar en la ultima posicion.
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    ls.insertarFinal(new Libro(sAutor,sTitulo,sIsbn));
                    //Mostrar
                    ls.Listar();
                break;  
                case 3:{//Llamado del metodo para insertar en una posicion determinada.
                    //Datos del Libro
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    //Posicion en la que se guardara
                    sPos=JOptionPane.showInputDialog("Ingrese En que posicion Decea Guardar El libro");                    
                    intPos = Integer.parseInt(sPos);
                    ls.insertarDespues(itOp, new Libro(sAutor,sTitulo,sIsbn));
                    //Mostrar
                    ls.Listar();
                break;}
                case 4:{//Obtener la informacion de un nodo determinado.
                    sPos=JOptionPane.showInputDialog("Ingrese En que posicion Decea Guardar El libro");                    
                    intPos = Integer.parseInt(sPos);
                    ls.obtener(intPos);
                break;}
                case 5:
                    JOptionPane.showMessageDialog(null, ls.contar());
                break;    
                case 9:
                    ls.Listar();
                break;
            }
        }while(itOp != 0);
    }      
}
