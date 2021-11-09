package PrimerParcial;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class PracticaExamen_PP_CS {
    
    static LinkedList <Object> Cola = new LinkedList <>();
    static Stack <Object> Pila = new Stack <>();
    static Stack <Object> Pila2 = new Stack <>();
    
    public static void IngresarDato(Object E){
        Pila.push(E);
        JOptionPane.showMessageDialog(null, "El dato: " + E + " Se ha ingresado.");
    }
    
    public static void SacarDato(Object E){
        if(Pila.contains(E)){
            while(!Pila.peek().equals(E)){
                Cola.add(Pila.pop());
            }
            if(!Pila.empty()){
                JOptionPane.showMessageDialog(null, "El dato retirado es: " + Pila.pop());
            }else{
                
            }
            while(!Cola.isEmpty()){
                Pila.push(Cola.poll());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Acción imposible, el dato ingresado no se encuentra en la pila", "Error", JOptionPane.ERROR);
        }
    }
    
    public static void MostrarDatos(){
        Object r = "Valores Guardados\n";
        for(int i = 0; i < Pila.size(); i++){
            r += Pila.get(i) + "\n";
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
                    JOptionPane.showMessageDialog(null, "El tamaño es de: " + Pila.size());
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
