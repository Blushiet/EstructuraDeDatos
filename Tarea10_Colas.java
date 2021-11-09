package PrimerParcial;

import javax.swing.JOptionPane;

public class Tarea10_Colas {
    
    private int PunteroInicial, PunteroFinal, Nelem, Tamano;
    private final int[] vector;
    
    public Tarea10_Colas(int Tamano){
        this.Tamano = Tamano;
        this.vector = new int[this.Tamano];
        this.PunteroFinal = 0;
        this.PunteroInicial = 0;
        this.Nelem = 0;
    }
    
    public void Push(int NewNumber){
        if(!this.Full()){
            this.vector[this.NewPositionOfElement()] = NewNumber;
            this.Nelem++;
            if(this.PunteroFinal<this.Tamano){
                this.PunteroFinal++;
            }else{
                this.PunteroFinal = 0;
            }
        }else{
            JOptionPane.showMessageDialog(null, "La cola esta llena");
        }
    }
    
    public void Delete(){
        if(!Empty()){
            int NumberOut = this.vector[this.PunteroInicial];
            this.NewInitialPosition();
            vector[NumberOut - 1] = 0;
            this.Nelem--;
        }else{
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }
    
    public void Print(){
        String r = "Elementos guardados\n";
        for(int i = 0; i<this.Tamano; i++){
            r+= this.vector[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
    public void FirstElement(){
        JOptionPane.showMessageDialog(null, "El primer elemento ingresado es: " + this.vector[0]);
    }
    
    public void LastElement(){
        JOptionPane.showMessageDialog(null, "El ultimo elemento ingresado es: " + this.vector[this.PunteroFinal - 1]);
    }
    
    private void NewInitialPosition(){
        this.PunteroInicial = (this.PunteroInicial + 1)%this.Tamano;
    }
    
    private int NewPositionOfElement(){
        return (this.PunteroInicial + this.Nelem)%this.Tamano;
    }
    
    private boolean Empty(){
        return (this.Nelem == 0);
    }
    
    private boolean Full(){
        return (this.Nelem == this.Tamano);
    }
    
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la cola"));
        Tarea10_Colas t = new Tarea10_Colas(tam);
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Ingresar Elemento\n"
                                                             + "2-Borrar Elemento\n"
                                                             + "3-Mostrar Cola\n"
                                                             + "4-Primer elemento\n"
                                                             + "5-Ultimo elemento\n"
                                                             + "6-Salir"));
            switch(opc){
                case 1:
                    int tama = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a guardar"));
                    t.Push(tama);
                    break;
                case 2:
                    t.Delete();
                    break;
                case 3:
                    t.Print();
                    break;
                case 4:
                    t.FirstElement();
                    break;
                case 5:
                    t.LastElement();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(opc != 6);
    }
}
