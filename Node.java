package Nodos;

public class Node {
    
    public int NumArt;
    public String Nombre;
    public int Existencia;
    public double Precio;
    public Node Next;
    
    public Node(int NumArt, String Nombre, int Existencia, double Precio){
        this.NumArt = NumArt;
        this.Nombre = Nombre;
        this.Existencia = Existencia;
        this.Precio = Precio;
        Next = this;
    }
}

