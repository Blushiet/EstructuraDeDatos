package Nodos;

public class NodoBinarioSimple {
    
    public int usuario;
    public String nombre;
    public char estatus = ' ';
    public NodoBinarioSimple derecha, izquierda, padre;
    
    public NodoBinarioSimple(int usuario, char estatus, NodoBinarioSimple derecha, NodoBinarioSimple izquierda){
        this.usuario = usuario;
        this.estatus = estatus;
        this.derecha = null;
        this.izquierda = null;
    }
    
}
