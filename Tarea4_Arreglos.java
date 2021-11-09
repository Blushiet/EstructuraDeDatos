package PrimerParcial;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Tarea4_Arreglos {
    
    public static void ArraysT(){
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Crear Array
        int Nelem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño que tendra el arreglo"));
        int arreglo[] = new int[Nelem];
        for(int i = 0; i<Nelem; i++){
            arreglo[i] = (int)(Math.random()*50+1);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Numero mayor y menor
        Arrays.sort(arreglo);
        for(int i = 0; i<Nelem; i++){
            System.out.println(arreglo[i]);
        }
        JOptionPane.showMessageDialog(null,"El valor menor del array es: " + arreglo[0]);
        JOptionPane.showMessageDialog(null,"El valor Mayor del array es: " + arreglo[Nelem - 1]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Promedio
        int suma = 0;
        double promedio = 0;
        for(int i = 0; i<Nelem; i++){
            suma += arreglo[i];
            promedio = suma/arreglo.length;
        }
        JOptionPane.showMessageDialog(null,"El promedio del array es: " + promedio);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Moda
        int moda, Repeticion, MaxRepeticion;
        MaxRepeticion = 0;
        moda = 0;
        for(int i = 0; i<arreglo.length; i++){
            Repeticion = 0;
            for(int j = 0; j<arreglo.length; j++){
                if(arreglo[i] == arreglo[j]){
                    Repeticion++;
                }
                if(Repeticion>MaxRepeticion){
                    moda = arreglo[i];
                    MaxRepeticion = Repeticion;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La moda es: " + moda);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Mediana
        int mediana  = arreglo.length/2;
        JOptionPane.showMessageDialog(null, "La mediana es: " + arreglo[mediana]);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    
    public static void main(String[] args) {
        ArraysT();
    }
    
}
