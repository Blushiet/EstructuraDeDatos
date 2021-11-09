package PrimerParcial;

import javax.swing.JOptionPane;

public class Tarea5_Arreglos {

    public static void ArrayBidimen(){
        int Nelem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de renglones que tendra el Array"));
        int Nelem1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas que tendra el Array"));
        //Definiendo 3 arrays bidimensionales
        int Array1[][] = new int[Nelem][Nelem1];
        int Array2[][] = new int[Nelem][Nelem1];
        int Array3[][] = new int[Nelem][Nelem1];
        
        //Imprimiendo Array 1
        System.out.println("Array uno");
        for(int i = 0; i<Nelem; i++){
            for(int j = 0; j<Nelem1; j++){
                Array1[i][j] = (int) ((Math.random()*10)+1);
                Array2[i][j] = (int) ((Math.random()*10)+1);
            }
        }
        
        for(int i = 0; i<Nelem; i++){//Filas
            for(int j = 0; j<Nelem1; j++){//Columnas
                System.out.print(Array1[i][j] + "\t");
            }
            System.out.println("");
        }
        //Imprimiendo Array 2
        System.out.println("");
        System.out.println("Array dos");
        for(int i = 0; i<Nelem; i++){//Filas
            for(int j = 0; j<Nelem1; j++){//Columnas
                System.out.print(Array2[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        //imprimiendo suma de array uno y dos y guardandolo en el array 3
        System.out.println("Array 3 despues de sumar los 2 anteriores arrays");
        for(int i = 0; i<Nelem;i++){
            for(int j = 0; j<Nelem1;j++){
                Array3[i][j] = Array1[i][j] + Array2[i][j];
                System.out.print(Array3[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Array 3 despues de multiplicar los 2 anteriores arrays");
        for(int i = 0; i<Nelem;i++){
            for(int j = 0; j<Nelem1;j++){
                Array3[i][j] = Array1[i][j] * Array2[i][j];
                System.out.print(Array3[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Array 3 despues de restar los 2 anteriores arrays");
        for(int i = 0; i<Nelem;i++){
            for(int j = 0; j<Nelem1;j++){
                Array3[i][j] = Array1[i][j] - Array2[i][j];
                System.out.print(Array3[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Array 2");
        int Array4[][] = new int[Nelem][Nelem1];
        Array4 = Array2;
        
        for(int i = 0; i<Nelem;i++){
            for(int j = 0; j<Nelem1;j++){
                System.out.print(Array2[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Array 4");
        for(int i = 0; i<Nelem;i++){
            for(int j = 0; j<Nelem1;j++){
                System.out.print(Array4[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        ArrayBidimen();
    }
    
}
