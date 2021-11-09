package Arboles;
import Nodos.NodoBinario;
import javax.swing.JOptionPane;

public class ArbolesBinarios {
    
    static int ProfundidadIzquierda, ProfundidadDerecha;
    static int ListCount = 0;
    static int BajaLogica = 0;
    static NodoBinario raiz;
    static ArbolesBinarios a = new ArbolesBinarios();
    
    public ArbolesBinarios(){
        raiz = null;
    }
    
    public int ProfundidadIzquierda(NodoBinario nodo){
        InOrder(nodo.izquierda);
        ProfundidadIzquierda++;
        return ProfundidadIzquierda;
    }
    
    public int ProfundidadDerecha(NodoBinario nodo) {
        InOrder(nodo.derecha);
        ProfundidadDerecha++;
        return ProfundidadDerecha;
    }
    
    public int ComparacionDeProfundidad(int i, int i2){
        if(i < i2){
            return i;
        }else{
            return i2;
        }
    }
    /*
    Para borrar fisicamente solo re-ubica el nodo mayor ya sea izq. o derecha
    */    
    //Busquedas de nodos
    public void InOrder(NodoBinario nodo){
        if(nodo != null){
            if(nodo.estatus == 'A'){
                InOrder(nodo.izquierda);
                System.out.println("Usuario: " + nodo.usuario + " Nombre: " + nodo.nombre + " Estutus: " + nodo.estatus);
                InOrder(nodo.derecha);
            }
        }
    }
    
    public void PreOrder(NodoBinario nodo){
        if(nodo != null){
            System.out.println("Usuario: " + nodo.usuario + " Nombre: " + nodo.nombre + " Estutus: " + nodo.estatus);
            PreOrder(nodo.izquierda);
            PreOrder(nodo.derecha);
        }
    }
    
    public void PostOrder(NodoBinario nodo){
        if(nodo != null){
            PostOrder(nodo.derecha);
            PostOrder(nodo.izquierda);
            System.out.println("Usuario: " + nodo.usuario + " Nombre: " + nodo.nombre + " Estutus: " + nodo.estatus);
        }
    }
    
    public void Buscar(int usuario){
        NodoBinario aux = raiz;
        while(aux.usuario != usuario){
            if(usuario < aux.usuario){
                aux = aux.izquierda;
            }else{
                aux = aux.derecha;
            }
            if(aux == null){
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
            }
        }
        System.out.println("Nodo encontrado!\nEsta es la información del nodo buscado:");
        System.out.println("Usuario: " + aux.usuario + " Nombre: " + aux.nombre + " Estatus: " + aux.estatus);
    }
    //Fin de busquedas de nodos
    
    //Bajas
    public void BajaLogica(int usuario){
        try{
            NodoBinario aux = raiz;
            while(aux.usuario != usuario){
                if(usuario < aux.usuario){
                    aux = aux.izquierda;
                }else{
                    aux = aux.derecha;
                }
                if(aux == null){
                    JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
                }
            }
            aux.estatus = 'B';
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
        }
        BajaLogica++;
        ListCount--;
    }
    
    public void Borrar(int usuario){
        NodoBinario aux = raiz;
        while(aux.usuario != usuario){
            if(usuario < aux.usuario){
                aux = aux.izquierda;
            }else{
                aux = aux.derecha;
            }
            if(aux == null){
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
            }
        }
        aux.usuario = 0;
        aux.nombre = "";
        aux.estatus = 'B';
        ListCount--;
    }
    //Fin de bajas de nodos
    
    //Altas
    public void Ingresar(int usuario, String nombre, char estatus){
        NodoBinario nodo = new NodoBinario(usuario, nombre, estatus, null, null);
        if(raiz == null){
            raiz = nodo;
        }else{
            NodoBinario aux = raiz;
            while(aux != null){
                nodo.padre = aux;
                if(nodo.usuario >= aux.usuario){
                    aux = aux.derecha;
                }else{
                    aux = aux.izquierda;
                }
            }
            if(nodo.usuario < nodo.padre.usuario){
                nodo.padre.izquierda = nodo;
            }else{
                nodo.padre.derecha = nodo;
            }
        }
        ListCount++;
    }
    
    public void AltaLogica(int usuario){
        try{
            NodoBinario aux = raiz;
            while(aux.usuario != usuario){
                if(usuario < aux.usuario){
                    aux = aux.izquierda;
                }else{
                    aux = aux.derecha;
                }
                if(aux == null){
                    JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
                }
            }
            aux.estatus = 'A';
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el arbol");
        }
    }
    //Fin de altas
    
    //Tamaños
    public void Size(){
        JOptionPane.showMessageDialog(null, "Tiene en total " + ListCount + " Nodos dados de alta", "", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tiene en total " + BajaLogica + " Nodos dados de baja logicamente", "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción.\n"
                    + "1.-Ingresar nodo\n"
                    + "2.-Recorrer de forma InOrder\n"
                    + "3.-Recorrer de forma PostOrder\n"
                    + "4.-Recorrer de forma PreOrder\n"
                    + "5.-Baja Logica\n"
                    + "6.-Alta Logica\n"
                    + "7.-Buscar Usario\n"
                    + "8.-Borrar Permanentemente\n"
                    + "9.-Tamaño\n"
                    + "10.-Profundidad\n"
                    + "11.-Salir"));
            switch(opc){
                case 1:
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del nodo"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nodo");
                    a.Ingresar(indice, nombre, 'A');
                    break;
                case 2:
                    a.InOrder(raiz);
                    break;
                case 3:
                    a.PostOrder(raiz);
                    break;
                case 4:
                    a.PreOrder(raiz);
                    break;
                case 5:
                    int baja = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el usuario a dar de baja logicamente"));
                    a.BajaLogica(baja);
                    break;
                case 6:
                    int alta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el usuario a dar de alta logicamente"));
                    a.AltaLogica(alta);
                    break;
                case 7:
                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el usuario a buscar"));
                    a.Buscar(buscar);
                    break;
                case 8:
                    int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el usuario a borrar permamentemente"));
                    a.Borrar(b);
                    break;
                case 9:
                    a.Size();
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, a.ComparacionDeProfundidad(a.ProfundidadIzquierda(raiz), a.ProfundidadDerecha(raiz)));
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        }while(opc != 11);
    }
}
