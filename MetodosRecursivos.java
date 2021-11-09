package Recursividad;

import javax.swing.JOptionPane;

/*
Metodos de factorial
MetodosRecursivos
Torres de Hanoi
Suma de 2 numeros
se pueden utilizar objetos tipo Integer
*/
public class MetodosRecursivos {
    
    public static long Factorial(int i){
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return Factorial(i - 1) * i;
        }
    }
    
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
            System.out.println("mover disco de " + origen + " a " + destino);
        }else{
            Hanoi(n-1, origen, destino, auxiliar);
            System.out.println("mover disco de "+ origen + " a " + destino);
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }
    
    public static int Fibonacci(int i){
        if(i == 1){
            return 1;
        }else if(i == 0){
            return 0;
        }else if(i > 1){
            return Fibonacci(i - 1) + Fibonacci(i - 2);
        }else{
            System.out.println("Error");
            return -1;
        }
    }
    
    public static int Suma(int i){
        if(i == 1){
            return 1;
        }else{
            return Suma(i - 1) + i;
        }
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1.-Factorial"
                                                                + "\n2.-Fibonacci"
                                                                + "\n3.-Sumatoria"
                                                                + "\n4.-Torres de Hanoi"
                                                                + "\n5.-Salir"));
            switch(opc){
                case 1:
                    int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para sacar su factorial"));
                    JOptionPane.showMessageDialog(null, "El factorial de " + i + " es: " + Factorial(i));
                    break;
                case 2:
                    int i2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para sacar la sucesión de Fibonacci"));
                    JOptionPane.showMessageDialog(null, "La sucesión de Fibonacci hasta el numero " + i2 + " es: " + Fibonacci(i2));
                    break;
                case 3:
                    int i3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para hacer una sumatoria desde \nel numero ingresado hasta el numero uno"));
                    JOptionPane.showMessageDialog(null, "La sumatoria de " + i3 + " hasta el uno es: " + Suma(i3));
                    break;
                case 4:
                    int i4 = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la torre."));
                    int i5 = Integer.parseInt(JOptionPane.showInputDialog("Origen"));
                    int i6 = Integer.parseInt(JOptionPane.showInputDialog("Auxiliar"));
                    int i7 = Integer.parseInt(JOptionPane.showInputDialog("Destino"));
                    Hanoi(i4, i5, i6, i7);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(opc != 5);
    }
    
}
