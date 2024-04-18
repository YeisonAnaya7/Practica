
import javax.swing.JOptionPane;


public class Suma {

    public static void suma (){
    String num1 = JOptionPane.showInputDialog("Ingrese el primer numero");
    String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
    Double numerouno = Double.parseDouble(num1);
    Double numerodos = Double.parseDouble(num2);
    Double suma = numerouno+numerodos;
    JOptionPane.showMessageDialog(null,"La suma de los dos numeros es:"+suma);
    }
     public static void multiplicacion (){
    String num1 = JOptionPane.showInputDialog("Ingrese el primer numero");
    String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
    Double numerouno = Double.parseDouble(num1);
    Double numerodos = Double.parseDouble(num2);
    Double multiplicacion = numerouno*numerodos;
    JOptionPane.showMessageDialog(null,"La multiplicacion de los dos numeros es:"+multiplicacion);
    }
    public static void main(String[] args) {
    String menu = "Operacion:\n"+
                  "1.Suma\n"+
                  "2.multiplicacion\n";
                  String op = JOptionPane.showInputDialog(menu);
                  int opciones =  Integer.parseInt(op);
    switch (opciones){
        case 1:
            suma();
            break;
        case 2:
            multiplicacion();
            break;
            
            
    }
            
} 
}

