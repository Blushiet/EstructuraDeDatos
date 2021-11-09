package PrimerParcial;

import javax.swing.JOptionPane;

public class Tarea11_LES {
    
    public Nodo First;
    int ListCount;
    
    public class Nodo {
        int EmployeeNumber;
        String Name;
        float Salary;
        Nodo Next;
    
        public Nodo(int EmployeeNumber, String Name, float Salary){
            this.EmployeeNumber = EmployeeNumber;
            this.Name = Name;
            this.Salary = Salary;
        }
    }
    
    public Tarea11_LES(){
        Nodo First = new Nodo(0,"",0);
        First.Next = null;
        ListCount = 0;
    }
    
    public void InsertNode(int i, String s, float f){
        Nodo nodo = new Nodo(i,s,f);
        if(First == null){
            First = nodo;
            JOptionPane.showMessageDialog(null, "The first employ is: " + First.Name);
            ListCount++;
        }else{
            Nodo Temp;
            Temp = First;
            Nodo Previous;
            Previous = Temp;
            while(Temp != Previous && Temp.EmployeeNumber < i){
                Previous = Temp;
                Temp = Temp.Next;
                ListCount++;
            }
            if(Temp == First){
                nodo.Next = Temp;
                First = nodo;
            }else{
                nodo.Next = Previous.Next;
                Previous.Next = nodo;
            }
            ListCount++;
            JOptionPane.showMessageDialog(null, nodo.Name + " has been added to the list");
        }
    }
    
    public void Delete(int i){
        Nodo Temp = First;
        Nodo Previous = Temp;
        if(First == null){
            JOptionPane.showMessageDialog(null, "The list is empty!, the list doesn't contains nodes");
        }
        if(First.EmployeeNumber == i){
            First = First.Next;
            ListCount--;
            JOptionPane.showMessageDialog(null, "First node deleted");
        }else{
            while((Temp != null) && (Temp.EmployeeNumber != i)){
                Previous = Temp;
                Temp = Temp.Next;
            }
            if(Temp == null){
                JOptionPane.showMessageDialog(null, "The employee number " + i + "doesn't exist");
            }
            Previous.Next = Temp.Next;
            ListCount--;
        }
    }
    
    public void Print(){
        Nodo Temp = First;
        if(First == null){
            JOptionPane.showMessageDialog(null, "The list is empty!, the list doesn't contains nodes");
        }
        while(Temp != null){
            JOptionPane.showMessageDialog(null, "Employee number is: " + Temp.EmployeeNumber + "\nName is: " + Temp.Name + "\nand salary is: $" + Temp.Salary);
            Temp = Temp.Next;
        }
    }
    
    public void Size(){
        JOptionPane.showMessageDialog(null, "The size is: " + ListCount);
    }
    
    public void PrintNodesGreaterThan(float f){
        String r = "";
        Nodo Temp = First;
        if(First == null){
            JOptionPane.showMessageDialog(null, "The list is empty!, the list doesn't contains nodes");
        }else{
            r += "Los empleados con sueldo mayor son: ";
            while(Temp != null){
                if(Temp.Salary >= f){
                    r += Temp.Name + " " + "Sueldo " + Temp.Salary;
                    JOptionPane.showMessageDialog(null, r);
                }
            }
        }
    }
    
    public void ReverseList(){
        Nodo Previous, i, p;
        i = First;
        Previous = i;
        p = Previous.Next;
        while(i != null){
            i = p.Next;
            p.Next = Previous;
            if(Previous == First){
                Previous.Next = null;
            }
            Previous = p;
            p = i;
        }
        First = Previous;
        JOptionPane.showMessageDialog(null, "The list has been reversed");
    }
    
    public static void main(String[] args) {
        Tarea11_LES t = new Tarea11_LES();
      int opc = 0;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Ingresar Empleado\n"
                                                             + "2-Borrar Elemento\n"
                                                             + "3-Imprimir lista\n"
                                                             + "4-Imprimir elementos mayores a \n"
                                                             + "5-Invertir Lista\n"
                                                             + "6-Mostrar tamaño de la lista\n"
                                                             + "7-Salir"));
            switch(opc){
                case 1:
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de empleado"));
                    String s = JOptionPane.showInputDialog("Coloque el nombre del empleado");
                    float f = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
                    t.InsertNode(i,s,f);
                    break;
                case 2:
                    int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de empleado a borrar"));
                    t.Delete(d);
                    break;
                case 3:
                    t.Print();
                    break;
                case 4:
                    float f1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario que desea buscar en la lista"));
                    t.PrintNodesGreaterThan(f1);
                    break;
                case 5:
                    t.ReverseList();
                    break;
                case 6:
                    t.Size();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while(opc != 7);
    }
    
}
