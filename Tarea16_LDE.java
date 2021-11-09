package PrimerParcial;
import Nodos.NodeDoble;
import javax.swing.JOptionPane;

public class Tarea16_LDE {
    
    static Tarea16_LDE t = new Tarea16_LDE();
    private NodeDoble inicio, fin;
    static int listCount = 0;
    
    
    public Tarea16_LDE(){
        inicio = fin = null;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public void BuscarArribaDe(int dato){
        if(inicio != null){
            NodeDoble p;
            if(inicio != null){
                p = inicio.siguiente;
                do{
                    if(p.dato >= dato){
                        System.out.println(p.dato);
                        p = p.siguiente;
                    }
                }while(p != inicio.siguiente);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista Vacia!");
        }
    }
    
    public void Insertar(int dato, String nombre, int dato2, double precio){
        NodeDoble nodo = new NodeDoble(dato, nombre, dato2, precio);
        if(inicio == null){
            inicio = nodo;
            nodo.siguiente = inicio;
            nodo.anterior = fin;
            fin = nodo;
        }else if(inicio.dato < dato && inicio.siguiente == inicio){
            fin.siguiente = nodo;
            nodo.siguiente = inicio;
            nodo.anterior = inicio;
            fin = nodo;
        }else if(inicio.dato < dato && inicio.siguiente != inicio && fin.dato > dato){
            NodeDoble aux = inicio;
            NodeDoble TempSiguiente = inicio.siguiente;
            while(aux.dato < dato && TempSiguiente.dato < dato){
                aux = aux.siguiente;
                TempSiguiente = TempSiguiente.siguiente;
                JOptionPane.showMessageDialog(null, "Buscando lugar en la lista para el nodo a ingresar");
            }
            if(aux.dato < dato && TempSiguiente.dato > dato){
                aux.siguiente = nodo;
                TempSiguiente.anterior = nodo;
                nodo.siguiente = TempSiguiente;
                nodo.anterior = aux;
            }else{
                JOptionPane.showMessageDialog(null, "ERROR!!!");
            }
        }
        else if(inicio.dato > dato){
            inicio.anterior = nodo;
            nodo.siguiente = inicio;
            inicio = nodo;
            fin.siguiente = inicio;
            inicio.anterior = fin;
        }else if(fin.dato < dato){
            fin.siguiente = nodo;
            nodo.siguiente = inicio;
            nodo.anterior = inicio;
            fin = nodo;
        }
        listCount++;
    }
    
    public int cantidad(){
        return listCount;
    }
    
    public void MostrarListaDobleI_F(){
        NodeDoble aux;
        aux = inicio;
        do{
            System.out.println("Numero de articulo: " + aux.dato + " \nNombre del articulo: " 
                               + aux.nombre + " \nCantidad existente: " + aux.dato2 + " \nPrecio: " + aux.precio);
            aux = aux.siguiente;
        }while(aux != inicio);
    }
    
    public void MostrarListaDobleF_I(){
        NodeDoble aux;
        aux = fin;
        do{
            System.out.println("Numero de articulo: " + aux.dato + " \nNombre del articulo: " 
                               + aux.nombre + " \nCantidad existente: " + aux.dato2 + " \nPrecio: " + aux.precio);
            aux = aux.anterior;
        }while(aux != fin);
    }
    
    public void EliminarNodo(int Num){
        if(inicio != null){
            NodeDoble actual;
            boolean encontrado = false;
            actual = inicio;
            while(actual.siguiente != inicio && !encontrado){
                encontrado = (actual.siguiente.dato == Num);
                if(!encontrado){
                    actual = actual.siguiente;
                }
            }
            encontrado = (actual.siguiente.dato == Num);
            if(encontrado){
                NodeDoble p;
                p = actual.siguiente;
                if(inicio == inicio.siguiente){
                    inicio = null;
                }else{
                    if(p == inicio){
                        inicio = actual;
                    }
                    actual.siguiente = p.siguiente;
                }
                p = null;
            }
            JOptionPane.showMessageDialog(null, "El articulo con el numero " + Num + " se ha eliminado correctamente");
            listCount--;
        }else{
            JOptionPane.showMessageDialog(null, "Lista Vacia!");
        }
    }
    
    
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1.-Insertar nodo\n"
                                                            + "2.-Mostrar Lista Doblemente Encadenada Circular\n"
                                                            + "3.-Revertir Lista Doblemente Encadenada Circular\n"
                                                            + "4.- Borrar articulo\n"
                                                            + "5.-Buscar arriba de...\n"
                                                            + "6.-Size\n"
                                                            + "7.-Salir"));
            switch(opc){
                case 1:
                    int NumArt1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de articulo"));
                    String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
                    int Existencia1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la existencia que hay del articulo"));
                    double Precio1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo"));
                    t.Insertar(NumArt1, nombre1, Existencia1, Precio1);
                    break;
                case 2:
                    t.MostrarListaDobleI_F();
                    break;
                case 3:
                    t.MostrarListaDobleF_I(); 
                    break;
                case 4:
                    int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del articulo a eliminar"));
                    t.EliminarNodo(eliminar);
                    break;
                case 5:
                    int dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero de articulo"));
                    t.BuscarArribaDe(dato);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, t.cantidad());
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
            
        }while(opc != 7);
        
    }
    
}