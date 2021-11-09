package PrimerParcial;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/*
*Filosofia de pilas es LIFO (Last Input First Output)
*/

public class Tarea13_LinkedList {
    
    static LinkedList <Integer> Pila = new LinkedList <Integer>();
    
    public static void Add(){
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a guardar en la pila"));
        Pila.addFirst(i);
    }
    
    public static void DeleteFirst(){
        if(!Pila.isEmpty()){
            Pila.pollFirst();
            JOptionPane.showMessageDialog(null, "Se ha borrado el primer valor guardado", "Delete", JOptionPane.DEFAULT_OPTION);
        }else{
            JOptionPane.showMessageDialog(null, "Pila vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void getLast(){
        if(!Pila.isEmpty()){
            JOptionPane.showMessageDialog(null, "El primer elemento es: " + Pila.getFirst());
        }
    }
    
    public static void Show(){
        String r = "Elementos guardados\n";
        for(int i = 0; i<Pila.size(); i++){
            r += Integer.toString(Pila.get(i)) + "\n";
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Insertar elemento\n"
                                                             + "2-Borrar elemento\n"
                                                             + "3-Mostrar pila\n"
                                                             + "4-Imprimir ultimo elemento de la pila\n"
                                                             + "5-Tamaño de pila\n"
                                                             + "6-Salir"));
            switch(opc){
                case 1:
                    Add();
                    break;
                case 2:
                    DeleteFirst();
                    break;
                case 3:
                    Show();
                    break;
                case 4:
                    getLast();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + Pila.size());
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opc != 6);
    }
    
}
