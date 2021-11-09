package PrimerParcial;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class PracticaExamen_CP_PS {
    
    static LinkedList <Object> Cola = new LinkedList <>();
    static Stack <Object> Pila = new Stack <>();
    
    public static void IngresarDato(Object i){
        Cola.add(i);
        JOptionPane.showMessageDialog(null, "El dato: " + i + " Se ha ingresado.");
    }
    
    public static void SacarDato(Object i){
        if(Cola.contains(i)){
            while(!Cola.peek().equals(i)){
                Pila.push(Cola.poll());
            }
            if(!Cola.isEmpty()){
                JOptionPane.showMessageDialog(null, "El dato retirado es: " + Cola.poll());
            }else{
                JOptionPane.showConfirmDialog(null, "El dato no existe en la cola", "Error", JOptionPane.ERROR_MESSAGE);
            }
            while(!Pila.empty()){
                Cola.addFirst(Pila.pop());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Acción imposible, el dato ingresado no se encuenta en la cola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void MostrarDatos(){
        Object r = "Valores Guardados\n";
        for(int i = 0; i < Cola.size(); i++){
            r += Cola.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Ingresar\n"
                                                             + "2-Borrar\n"
                                                             + "3-Tamaño\n"
                                                             + "4-Mostrar\n"
                                                             + "5-Salir"));
            switch(opc){
                case 1:
                    Object i = JOptionPane.showInputDialog("Ingrese el dato a guardar");
                    IngresarDato(i);
                    break;
                case 2:
                    Object ii = JOptionPane.showInputDialog("Ingrese el dato a sacar");
                    SacarDato(ii);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El tamaño es de: " + Cola.size());
                    break;
                case 4:
                    MostrarDatos();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(opc != 5);
    }
    
}
