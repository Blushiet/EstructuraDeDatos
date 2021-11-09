package PrimerParcial;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Tarea8_Stack {
    
    static Stack <String> PilaPrinc;
    static Stack <String> PilaTemp;
    static String salida;
    
    public static void CrearEstacionamiento(){
        PilaPrinc = new Stack <>();
        PilaTemp = new Stack <>();
        JOptionPane.showMessageDialog(null, "Estacionamiento creado", "Crear Estacionamiento", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void IngresarAuto(){
        PilaPrinc.push(JOptionPane.showInputDialog(null, "Ingrese placa del carro"));
    }
    
    public static void BuscarAuto(){
        salida = JOptionPane.showInputDialog("Ingrese Placa del carro a buscar");
        if(PilaPrinc.contains(salida)){
            JOptionPane.showMessageDialog(null, "El auto se encontro en el estacionamiento");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el auto en el estacionamiento.");
        }
    }
    
    public static String CantidadAutos(){
        salida = Integer.toString(PilaPrinc.size());
        return salida;
    }
    
    public static void getCantidadAutos(){
        JOptionPane.showConfirmDialog(null, "En el estacionamiento hay " + CantidadAutos() + " Autos");
    }
    
    public static void SalidaAuto(){
        salida = JOptionPane.showInputDialog("Ingrese la pila del auto que saldrá");
        if(!PilaPrinc.isEmpty()){
            if (PilaPrinc.contains(salida)) {
                while(!PilaPrinc.peek().equalsIgnoreCase(salida)) {
                        PilaTemp.push(PilaPrinc.pop());
                }
                if (!PilaPrinc.empty()){
                    JOptionPane.showConfirmDialog(null, "El vehiculo retirado es: " + PilaPrinc.peek());
                    PilaPrinc.pop();
                }else{
                    JOptionPane.showConfirmDialog(null, "El vehiculo no existe en el estacionamiento principal");
                }
                while(!PilaTemp.empty()) {
                    PilaPrinc.push(PilaTemp.pop());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Accion imposible, el vehiculo no se encuentra en el estacionamiento");
            }	
        }
    }
    
    public static void main(String[] args) {
        int opc = 0;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Crear Estacionamiento\n"
                                                             + "2-Ingresar Auto\n"
                                                             + "3-Salida de auto\n"
                                                             + "4-Buscar Auto\n"
                                                             + "5-Obtener Cantidad de autos\n"
                                                             + "6-Salir"));
            switch(opc){
                case 1:
                    CrearEstacionamiento();
                    break;
                case 2:
                    IngresarAuto();
                    break;
                case 3:
                    SalidaAuto();
                    break;
                case 4:
                    BuscarAuto();
                    break;
                case 5:
                    getCantidadAutos();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opc != 6);
    }
    
}
