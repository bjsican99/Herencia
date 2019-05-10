package estructuralibros;
import javax.swing.*;
/**Software de Ingreso de libros
 * Guardados por medios de listas
 * por medios de una estructura
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Menu {
    Inicio inicio = new Inicio();
    public void MenuLista(){
         //Diferentes tipos de variable
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
                    + "\n0)  Volver A Menu");
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
        MenuInicio();
    }
    
    public void MenuPila(){//Opciones en el menu para pilas
        Pila pila = new Pila();//llamado a la clase pila
        //variables auxiliares
        String stgOpc;
        String sAutor, sTitulo, sIsbn; 
        int intOpc;//variable auxiliar 
        do{
            //Muestra las opciones elegibles y las guarda en una varible auxiliar
            stgOpc=JOptionPane.showInputDialog("Seleccione una opcion:"
                    + "\n1) Push"
                    + "\n2) Pop"
                    + "\n3) Top"
                    + "\n4) Borrar Pila"
                    + "\n5} Mostrar Todo"
                    + "\n0) Volver A Menu");
            intOpc=Integer.parseInt(stgOpc);            
            
            switch(intOpc){
                case 1:{//caso uno el ingreso de de la pila PUSH
                    //Pide los valores y los guarda en variables de tipo String
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    pila.aplilar(new Libro(sAutor,sTitulo,sIsbn));//crea una nueva estructura para guardar los datos                   
                    JOptionPane.showMessageDialog(null, "Dato Apilado");
                    pila.mostrar();//llama a la funcion mostras de la clase pila
                }break;
                case 2:{//Elimina el elemento de la cima en la pila POP, y muestra la nueva cima
                    JOptionPane.showMessageDialog(null, "Desapilando");
                    pila.desapilar();
                    pila.mostrar();
                }break;
                case 3:{//muestra cual es el elemento de la cima
                    pila.mostrar();
                }break;
                case 4:{//elimina todos los elemento de la cima
                    pila.Vaciar();
                }break;
                case 5:{//Muestra todos los elementos de la pila
                    JOptionPane.showMessageDialog(null, pila.MostrarTodo());
                }break;
            }
        }while(intOpc != 0);//varifica si la variable no es igual a cero para poder seguir con el ciclo
        MenuInicio();//vuelve al menu de Inicio
    }
    
    public void MenuColas(){
        Colas cola = new Colas();//llamado a la clase pila
        //variables auxiliares
        String stgOpc;
        String sAutor, sTitulo, sIsbn; 
        int intOpc;//variable auxiliar 
        do{
            //Muestra las opciones elegibles y las guarda en una varible auxiliar
            stgOpc=JOptionPane.showInputDialog("Seleccione una opcion:"
                    + "\n1) Encolar"
                    + "\n2) Desencolar"
                    + "\n3) Cabeza"
                    + "\n4) Borrar Cola"
                    + "\n5} Mostrar Todo"
                    + "\n0) Volver A Menu");
            intOpc=Integer.parseInt(stgOpc);    
            
            switch(intOpc){
                case 1:{
                    //caso uno el ingreso de de la Cola Encolar
                    //Pide los valores y los guarda en variables de tipo String
                    sAutor =JOptionPane.showInputDialog("Ingrese el Titulo");
                    sTitulo = JOptionPane.showInputDialog("Ingrese el Autor");
                    sIsbn = JOptionPane.showInputDialog("Ingrese el isbn");
                    cola.encolar(new Libro(sAutor,sTitulo,sIsbn));//crea una nueva estructura para guardar los datos                   
                    JOptionPane.showMessageDialog(null, "Dato Encolado");
                    cola.mostrar();//llama a la funcion mostras de la clase Colas
                }break;
                case 2:{
                    //Elimina el elemento de la ccabeza en la cola desencolar, y muestra la nueva cabeza
                    JOptionPane.showMessageDialog(null, "Desapilando");
                    cola.eliminar();
                    cola.mostrar();
                }break;
                case 3:{
                   //muestra cual es el elemento de la ccabeza
                    cola.mostrar(); 
                }break;
                case 4:{
                   //elimina todos los elemento de la cola
                    cola.Vaciar(); 
                }break;
                case 5:{
                    //Muestra todos los elementos de la pila
                    JOptionPane.showMessageDialog(null, cola.MostrarTodo());
                }break;
            }
        }while(intOpc !=0);
        MenuInicio();//vuelve al menu de Inicio
    }
    
    public void MenuInicio(){//Funcion para escoger si va a ingresar, pilas, colas o listas
        int intopc;//variables auxiliar
        intopc=Integer.parseInt(JOptionPane.showInputDialog(null, "1) Pilas\n"
                + "2) Colas\n"
                + "3) Listas\n"
                + "0) Cerrar Programa"));
        switch(intopc){
            case 1:{//llamado a la función del menu de PILAS
                MenuPila();
            }break;
            case 2:{//llamado a la función del menu de Colas
                MenuColas();
            }break;
            case 3:{//Llamado a la función del menu de Listas
                MenuLista();
            }break;
        }
    }
}
