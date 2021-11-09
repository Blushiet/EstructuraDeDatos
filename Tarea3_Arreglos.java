package PrimerParcial;
import java.util.Scanner;
import java.util.Arrays;
public class Tarea3_Arreglos {

    
    public static void ArraysT(int Nelem1, int Nelem2){
        int i,ii,iii;
        Scanner s = new Scanner(System.in);
        
        int arreglo1[] = new int[Nelem1];
        int arreglo2[] = new int[Nelem2];
        int arreglo3[] = new int[0];
        
        System.out.println("El primer Array tiene una cantidad de " + arreglo1.length + " datos en memoria");
        System.out.println("El segundo Array tiene una cantidad de " + arreglo2.length + " datos en memoria");
        System.out.println("El tercer Array tiene una cantidad de " + arreglo3.length + " datos en memoria");
        //Se cargan los valores para los arrays 1 y 2
        System.out.println("Cargando los valores del Array uno...");
        for(i=1; i<Nelem1; i++){
            arreglo1[i] = (int)(Math.random()*1000+1);
        }
        System.out.println("Cargando los valores del Array dos...");
        for(ii=1; ii<Nelem2; ii++){
           arreglo2[ii] = (int)(Math.random()*1000+1); 
        }
        //Se imprimen los valores de los arrays 1 y 2;
        System.out.println("Estos son los valores guardados en el Array uno");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo1[i]);
        }
        System.out.println("Estos son los valores guardados en el Array dos");
        for(ii=0; ii<Nelem2; ii++){
            System.out.println("Valor en memoria " + ii + "---> " + arreglo1[ii]);
        }
        //Clonando el array 3 del array 1
        System.out.println("Clonando el Array 1 en el Array 3");
        arreglo3 = arreglo1.clone();
        //Imprimiendo array 3 y 1
        System.out.println("Estos son los valores guardados en el Array tres");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo3[i]);
        }
        System.out.println("Estos son los valores guardados en el Array uno");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo1[i]);
        }
        //Cambio de valor en la posicion 2 del array 3
        arreglo3[2] = 55;
        //Imprimiendo array 3 y 1
        System.out.println("Estos son los valores guardados en el Array tres");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo3[i]);
        }
        System.out.println("Estos son los valores guardados en el Array uno");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo1[i]);
        }
        //Igualando referencia del array 3 con el array 2
        arreglo2[2] = arreglo3[2];
        //Imprimiendo array 3 y 2
        System.out.println("Estos son los valores guardados en el Array tres");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo3[i]);
        }
        System.out.println("Estos son los valores guardados en el Array dos");
        for(ii=0; ii<Nelem2; ii++){
            System.out.println("Valor en memoria " + ii + "---> " + arreglo1[ii]);
        }
        System.out.println("Ingrese un valor menor de la posicion 2 en el array 3");
        arreglo3[2] = 4;
        System.out.println("Estos son los valores guardados en el Array tres");
        for(i=0; i<Nelem1; i++){
            System.out.println("Valor en memoria " + i + "---> " + arreglo3[i]);
        }
        System.out.println("Estos son los valores guardados en el Array dos");
        for(ii=0; ii<Nelem2; ii++){
            System.out.println("Valor en memoria " + ii + "---> " + arreglo1[ii]);
        }
        //Ordenando e imprimiendo el array 1
        System.out.println("Elementos del array 1 ordenados");
        Arrays.sort(arreglo1);
        System.out.println("Estos son los valores guardados en el Array uno");
        for(i=0; i<Nelem1; i++){
            System.out.println(arreglo1[i]);
        }
        //Ordenando e imprimiendo el array 3
        System.out.println("Elementos del array 3 ordenados");
        Arrays.sort(arreglo3);
        System.out.println("Estos son los valores guardados en el Array tres");
        for(i=0; i<Nelem1; i++){
            System.out.println(arreglo3[i]);
        }
        //Imprimiendo array 2
        System.out.println("Estos son los valores guardados en el Array dos");
        for(ii=0; ii<Nelem2; ii++){
            System.out.println("Valor en memoria " + ii + "---> " + arreglo1[ii]);
        }
        System.out.println("Ingrese un valor para buacarlo en los arrys");
        int b = s.nextInt();
        
        System.out.println("El valor: " + b + " Se encontro en el arreglo 1: " + Arrays.binarySearch(arreglo1, b));
        System.out.println("El valor: " + b + " Se encontro en el arreglo 1: " + Arrays.binarySearch(arreglo2, b));
        System.out.println("El valor: " + b + " Se encontro en el arreglo 1: " + Arrays.binarySearch(arreglo3, b));
        
        
        
        System.out.println("Longitud del array 1 es de: " + arreglo1.length);
        System.out.println("Longitud del array 2 es de: " + arreglo2.length);
        System.out.println("Longitud del array 3 es de: " + arreglo3.length);
    }

    public static void main(String[] args) {
        ArraysT(25,14);
    }
    
}
