package PrimerParcial;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ListaEnFormaCola {
    static LinkedList <Integer> lista;
    /*
    La lista debe tomar la filoofia FIFO (First Input First Output)
    Con la clase LinkedList, para usar listas en forma de colas se utiliza
    para agregar el .add(); y para borrar como una cola se utiliza el .poll();
    Para crear un objeto de la clase LinkedList se declara de la sigueinte forma:
    LinkedList <TipoDeDato> NombreObjeto = new LinkedList <TipoDeDato>();
    y se tiene que importar la clase java.util.LinkedList;
    */
    
    public static void CreateList(){
        lista = new LinkedList <Integer>();
    }
    
    public static void InsertInTail(){
        int Nodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea agregar a la cola"));
        lista.add(Nodo);
    }
    
    public static void Delete(){
        lista.poll();
    }
    
    public static void ShowFirstAndDeleteFirst(){
        JOptionPane.showMessageDialog(null, lista.getFirst());
        lista.pollFirst();
    }
    
    public static void ShowLastAndDeleteLast(){
        JOptionPane.showMessageDialog(null, lista.getLast());
        lista.pollLast();
    }
    
    public static void main(String[] args) {
        
    }
    
}
