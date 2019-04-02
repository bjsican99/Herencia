package estructuralibros;
import javax.swing.*;
/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Menu {
    public static void main(String[] args) { 
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
                    ls.insertarPrincipio(new Libro(JOptionPane.showInputDialog("ingrese el Titulo"),
                            JOptionPane.showInputDialog("ingrese el Autor"),
                            JOptionPane.showInputDialog("ingrese el isbn")));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null, ls.Listar());
                break;
            }
        }while(itOp != 0);
    }      
}
