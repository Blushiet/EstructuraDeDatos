package PrimerParcial;

import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tarea7_Stack {
    
    static JTextArea area = new JTextArea();
    static Stack <Integer> pila;
    static int Nelem1;
    
    public static void CrearPila(){
        pila = new Stack <Integer>();
        JOptionPane.showMessageDialog(null, "La pila se ha creado exitosamente");
    }
    
    public static void InsertarElemento(){
        int Nelem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a guardar"));
        pila.push(Nelem);
    }
    
    public static void EliminarElemento(){
        pila.pop();
        
    }
    
    public static void VerPila(){
        if(PilaVacia() == true){
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }else{
            while(pila.empty() == false){
                System.out.println(pila.pop());
            }
            JOptionPane.showMessageDialog(null, "La pila ha quedado vacia");
        }
    }
    
    public static void ImprimirUltElem(){
        JOptionPane.showMessageDialog(null,"El ultimo elemento es: " + pila.peek());
    }
    
    public static void LongitudPila(){
        JOptionPane.showMessageDialog(null,"La pila tiene una longitud de: " + pila.size());
    }
    
    public static boolean PilaVacia(){
        if(pila.empty() == true){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean PilaLlena(){
        if(pila.capacity() == Nelem1){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Crear Pila\n"
                                                             + "2-Insertar elemento\n"
                                                             + "3-Ver Pila\n"
                                                             + "4-Borrar Elemento\n"
                                                             + "5-Imprimir ultimo elemento de la pila\n"
                                                             + "6-Longitud de pila\n"
                                                             + "7-Salir"));
            switch(opc){
                case 1:
                    CrearPila();
                    break;
                case 2:
                    InsertarElemento();
                    break;
                case 3:
                    VerPila();
                    break;
                case 4:
                    EliminarElemento();
                    break;
                case 5:
                    ImprimirUltElem();
                    break;
                case 6:
                    LongitudPila();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while(opc != 7);
    }
}
