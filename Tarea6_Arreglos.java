package PrimerParcial;

import javax.swing.JOptionPane;

public class Tarea6_Arreglos {
    
    static int tope;
    static int PPila[];
    static int Nelem;
    
    public static void CrearPila(){
        Nelem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que tendra la pila"));
        PPila = new int[Nelem];
    }
    
    public static void InsertarElemento(){
        if(PilaLlena() == false){
            for(int i = 0; i<PPila.length; i++){
                if(PPila[i] == 0){
                    PPila[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a guardar"));
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "La pila ya esta llena");
        }
    }
    
    public static void BorrarElemento(){
        if(PilaVacia() == false){
            for(int i = Nelem -1; i>=0; i--){
                if(PPila[i] != 0){
                    PPila[i] = 0;
                    break;
                }
            }
        }
    }
    
    public static boolean PilaVacia(){
        if(PPila[0] == 0){
            if(PPila[Nelem-1] == 0){
                JOptionPane.showMessageDialog(null, "Pila Vacia");
            }
           return true;
        }else{
            JOptionPane.showMessageDialog(null, "Pila NO Vacia");
            return false;
        }
    }
    
    public static boolean PilaLlena(){
            if(PPila[Nelem-1] == 0){
            JOptionPane.showMessageDialog(null, "Pila No Llena");
            return false;
            }else{
                return true;
            }
    }
    
    public static void VerPila(){
        for(int i = 0; i<PPila.length; i++){
            System.out.println(PPila[i]);
        }
    }
    
    public static void ImprimirUltElem(){
        JOptionPane.showMessageDialog(null, PPila[Nelem-1]);
    }
    
    public static void LongitudPila(){
        JOptionPane.showMessageDialog(null, "La pila tiene una longitud de: " + PPila.length);
    }
    
    public static void main(String[] args) {
        int opc = 0;
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
                    BorrarElemento();
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
