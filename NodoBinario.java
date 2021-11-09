package Nodos;

public class NodoBinario {
    
    public int usuario;
    public String nombre;
    public char estatus = ' ';
    public NodoBinario derecha, izquierda, padre;
    
    public NodoBinario(int usuario, String nombre, char estatus, NodoBinario derecha, NodoBinario izquierda){
        this.usuario = usuario;
        this.nombre = nombre;
        this.estatus = estatus;
        this.derecha = null;
        this.izquierda = null;
    }
    
}
