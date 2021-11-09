package Nodos;

public class NodoSimple {
    
    public int Index;
    public NodoSimple siguiente;
    
    public NodoSimple(int Index){
        this.Index = Index;
        siguiente = this;
    }
    
}
