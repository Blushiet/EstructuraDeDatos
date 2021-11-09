package Arboles;
import Nodos.NodoSimple;
import Nodos.NodoBinarioSimple;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Tarea19_ArbolesYListasSimples {
    
    static int ListCount = 0;
    static NodoBinarioSimple raiz;
    static LinkedList <Integer> lista = new LinkedList<Integer>();
    static Tarea19_ArbolesYListasSimples a = new Tarea19_ArbolesYListasSimples();
    
    public Tarea19_ArbolesYListasSimples(){
        raiz = null;
    }
    
    //Inicio de metodos de arbol binario
    public void Ingresar(int usuario, char estatus){
        NodoBinarioSimple nodo = new NodoBinarioSimple(usuario, 'A', null, null);
        if(raiz == null){
            raiz = nodo;
        }else{
            NodoBinarioSimple auxiliar;
            auxiliar = raiz;
            while(auxiliar != null){
                nodo.padre = auxiliar;
                if(nodo.usuario >= auxiliar.usuario){
                    auxiliar = auxiliar.derecha;
                }else{
                    auxiliar = auxiliar.izquierda;
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
    
    public void InOrder(NodoBinarioSimple nodo){
        if(nodo != null){
            if(nodo.estatus == 'A'){
                InOrder(nodo.izquierda);
                System.out.println("Usuario: " + nodo.usuario + nodo.estatus);
                InOrder(nodo.derecha);
            }
        }
    }
    
    
    
    public void PreOrder(NodoBinarioSimple nodo){
        if(nodo != null){
            System.out.println("Usuario: " + nodo.usuario + nodo.estatus);
            PreOrder(nodo.izquierda);
            PreOrder(nodo.derecha);
        }
    }
    
    public void PostOrder(NodoBinarioSimple nodo){
        if(nodo != null){
            PostOrder(nodo.derecha);
            PostOrder(nodo.izquierda);
            System.out.println("Usuario: " + nodo.usuario + nodo.estatus);
        }
    }
    
    public void Buscar(int usuario){
        NodoBinarioSimple aux = raiz;
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
        System.out.println("Usuario: " + aux.usuario + " Estatus: " + aux.estatus);
    }
    
    //Fin de metodos de arbol binario
    
    //Inicio metodos lista simple
    public void PasarDeArbolAListaSimple(NodoBinarioSimple nodo){
        if(nodo != null){
            PasarDeArbolAListaSimple(nodo.izquierda);
            lista.add(nodo.usuario);
            PasarDeArbolAListaSimple(nodo.derecha);
        }
    }
    
    public void MostrarLista(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ".- " + lista.get(i));
        }
    }
    
    public void BorrarElemento(int i){
        if(!lista.isEmpty()){
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Se ha borrado el elemento " + i + " de la lista");
        }
    }
    //Fin metodos lista simple
    public static void main(String[] args) {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opción"
                    + "1.-Ingresar nodo en arbol binario\n"
                    + "2.-Mostrar Arbol en forma InOrder\n"
                    + "3.-Mostrar Arbol en forma PreOrder\n"
                    + "4.-Mostrar Arbol en forma PostOrder\n"
                    + "5.-Pasar el arbol a lista\n"
                    + "6.-Mostrar lista simple\n"
                    + "7.-Salir"));
            switch(opc){
                case 1: 
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del nodo"));
                    a.Ingresar(indice, 'A');
                    break;
                case 2:
                    a.InOrder(raiz);
                    break;
                case 3:
                    a.PreOrder(raiz);
                    break;
                case 4:
                    a.PostOrder(raiz);
                    break;
                case 5:
                    a.PasarDeArbolAListaSimple(raiz);
                    break;
                case 6:
                    a.MostrarLista();
                    break;
                case 7:
                    int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a borrar"));
                    a.BorrarElemento(i);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Ha salido de la aplicación.");
                    System.exit(0);
                    break;
            }
        }while(opc != 8);
    }
}
