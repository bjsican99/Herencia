package estructuralibros;
import javax.swing.*;
/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Menu {
    public static void main(String[] args) { 
        Libro ld = new Libro("","","");
        Lista ls = new Lista();
        String stOp;
        int itOp;
        do{
            stOp=JOptionPane.showInputDialog("Seleccione una opcion:\n"+"1) insertar al principio\n2) insertar al final"+
             "\n3) insertar despues de n\n4) obtener informacion\n5) cantidad de datos en la lista\n6) vaciar\n7) Eliminar el priemro \n8) elimminar libro"+
              "\n9) Visualizar datos \n0) para salir ingrese 0");
            itOp=Integer.parseInt(stOp);
            switch(itOp){
                case 1:
                    ld.setAutor(JOptionPane.showInputDialog("ingrese el autor"));
                    ld.setTitulo(JOptionPane.showInputDialog("ingrese el titulo"));
                    ld.setIsbn(JOptionPane.showInputDialog("ingrese el isbn"));
                    ls.insertarPrincipio(ld); 
                break;
                case 9:
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
            }
        }while(itOp != 0);
    }      
}
