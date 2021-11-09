package PrimerParcial;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Tarea12_LinkedList {

    static LinkedList <Integer> Cola = new LinkedList <Integer>();
    
    public static void Add(int i){
        Cola.add(i);
    }
    
    public static void Show(){
        String r = "The elements saved are:\n";
        for(int i = 0; i<Cola.size(); i++){
            r+= Integer.toString(Cola.get(i)) + "\n";
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
    public static void Delete(){
        if(!Cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "Se ha eliminado el numero " + Cola.pollFirst() + " de la cola");
        }
    }
    
    public static void getFirst(){
        if(!Cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "El primer elemento es: " + Cola.getFirst());
        }else{
            JOptionPane.showMessageDialog(null, "Cola vacia.");
        }
    }
    
    public static void getLast(){
        if(!Cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "El ultimo elemento es: " + Cola.getLast());
        }else{
            JOptionPane.showMessageDialog(null, "Cola vacia.");
        }
    }
    
    public static void Size(){
        if(!Cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "the size of tail is: " + Cola.size());
        }
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Guardar valor en la cola\n"
                                                             + "2-Borrar Elemento\n"
                                                             + "3-Imprimir tamaño de cola\n"
                                                             + "4-Imprimir primer elemento de la cola\n"
                                                             + "5-Imprimir ultimo elemento de la cola\n"
                                                             + "6-Salir"));
            switch(opc){
                case 1:
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de empleado"));
                    Add(i);
                    break;
                case 2:
                    Delete();
                    break;
                case 3:
                    Size();
                    break;
                case 4:
                    getFirst();
                    break;
                case 5:
                    getLast();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opc != 6);
    }
    
}
