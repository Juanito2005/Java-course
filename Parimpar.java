import javax.swing.JOptionPane;
public class Parimpar {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero:"));
        if (numero / 2 == 0) {
            JOptionPane.showMessageDialog(null,"EL numero es par");
        } else {
            JOptionPane.showMessageDialog(null,"EL numero es impar");
        }
        }
    }
