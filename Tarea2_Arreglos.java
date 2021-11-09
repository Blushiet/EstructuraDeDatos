package PrimerParcial;
import java.util.Arrays;
import java.util.Scanner;

public class Tarea2_Arreglos {
    private int CantidadMax;

    public int getCantidadMax() {
        return CantidadMax;
    }

    public void setCantidadMax(int CantidadMax) {
        this.CantidadMax = CantidadMax;
    }
    
    
    
    static Scanner s = new Scanner(System.in);
    
    public static void Arreglos(int vector[], int nelem){
        Tarea2_Arreglos ta = new Tarea2_Arreglos();
        int max, i;
        
        System.out.println("Ingrese el numero de elementos de la lista");
        if(nelem>1){
            max=vector[0];
            for(i=0; i<nelem; i++){
                vector[i] = (int)(Math.random()*1000+1);
                System.out.println("Numero en memoria " + (i+1) + " ---> Valor: " + vector[i]);
                if(vector[i]>max){
                    max = vector[i];
                    ta.setCantidadMax(max);
                }
            }
            System.out.println("El numero mayor es: " + max);
        }else{
            System.out.println("Ingrese un valor mayor a '1' para poder hacer la validación de datos");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("1.-Ver array\n"
                         + "2.-Salir");
        Scanner s = new Scanner (System.in);
        int opc = s.nextInt();
        switch(opc){
            case 1:
              int vector[] = new int[20];
              Arreglos(vector, 20);
              break;
            case 2:
              System.exit(0);
              break;
            default:
              System.out.println("Opción Invalida");
              break;
        }
    }
}
