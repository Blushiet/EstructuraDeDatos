package Nodos;

public class NodeDoble {
    
    public int info;
    public int dato;
    public String nombre;
    public int dato2;
    public double precio;
    public NodeDoble siguiente, anterior;
    
    public NodeDoble(int dato, String nombre, int dato2, double precio, NodeDoble siguiente, NodeDoble anterior){
        this.dato = dato;
        this.nombre = nombre;
        this.dato2 = dato2;
        this.precio = precio;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    //Constructor para cuando no hay nodos
    public NodeDoble(int dato, String nombre, int dato2, double precio){
        this(dato, nombre, dato2, precio, null, null);
    }
    
}
