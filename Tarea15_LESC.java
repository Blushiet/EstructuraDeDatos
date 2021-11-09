package PrimerParcial;
import Nodos.Node;
import javax.swing.JOptionPane;

public class Tarea15_LESC {
    
    static Node lc, fin;
    static int ListCount = 0;
    
    public Tarea15_LESC(){
        Node lc = new Node(0, "", 0, 0.0);
    }
    
    public static void InsertarNodo(int NA, String N, int E, double P){
        
        
        Node nuevo = new Node(NA, N, E, P);
        if(lc != null){
            lc = nuevo;
            fin = nuevo;
            fin.Next = lc;
        }else if(lc.NumArt < NA){
            fin.Next = nuevo;
            fin = nuevo;
            fin.Next = lc;
        }
        ListCount++;
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente el nodo");
    }
    
    public static void Print(){
        System.out.println("Registros");
        Node p;
        if(lc != null){
            p = lc.Next;
            do{
                System.out.println("Numero del articulo: " + p.NumArt + "\nNombre del articulo: " + 
                                   p.Nombre + "\nCantidad existente: " + p.Existencia + 
                                   "\nPrecio del articulo: $" + p.Precio);
                p = p.Next;
            }while(p != lc.Next);
        }else{
            JOptionPane.showMessageDialog(null, "Lista encadenada circular vacia");
        }
    }
    
    public static void EliminarNodo(int Num){
        Node actual;
        boolean encontrado = false;
        actual = lc;
        while(actual.Next != lc && !encontrado){
            encontrado = (actual.Next.NumArt == Num);
            if(!encontrado){
                actual = actual.Next;
            }
        }
        encontrado = (actual.Next.NumArt == Num);
        if(encontrado){
            Node p;
            p = actual.Next;
            if(lc == lc.Next){
                lc = null;
            }else{
                if(p == lc){
                    lc = actual;
                }
                actual.Next = p.Next;
            }
            p = null;
        }
        JOptionPane.showMessageDialog(null, "El articulo con el numero " + Num + " se ha eliminado correctamente");
    }
    
    public static void Size(){
        JOptionPane.showMessageDialog(null, "Hay una cantidad de: " + ListCount + " nodos ingresados.");
    }
    
    public static void MayorA(int i){
        Node p;
        if(lc != null){
            p = lc.Next;
            do{
                if(p.NumArt >= i){
                    System.out.println("Numero del articulo: " + p.NumArt + "\nNombre del articulo: " + 
                                       p.Nombre + "\nCantidad existente: " + p.Existencia + 
                                       "\nPrecio del articulo: $" + p.Precio);
                    p = p.Next;
                }
            }while(p != lc.Next);
        }else{
            JOptionPane.showMessageDialog(null, "Lista encadenada circular vacia");
        }
    }
    
    public static void main(String[] args) {
        int opc;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Elija opcion:"
                    + "\n1.-Insertar Nodo"
                    + "\n2.-Imprimir Nodos"
                    + "\n3.-Eliminar Nodo"
                    + "\n4.-Tamaño"
                    + "\n5.-Mayor a"
                    + "\n6.-Salir"));
            switch(opc){
                case 1:
                    int NA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del articulo"));
                    String N = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
                    int E = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad existente que hay del articulo"));
                    double P = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo"));
                    InsertarNodo(NA, N, E, P);
                    break;
                case 2:
                    Print();
                    break;
                case 3:
                    int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del articulo a eliminar."));
                    EliminarNodo(eliminar);
                    break;
                case 4:
                    Size();
                    break;
                case 5:
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero para buscar."));
                    MayorA(i);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opc != 6);
                
    }
    
}
