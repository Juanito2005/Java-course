import javax.swing.JOptionPane;
public class Diviparnega3 {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero cualquiera si no es mucha molestia: "));
        if (n > 0 && n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo y par");
        } else if (n < 0 || n % 3 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es negativo o divisible entre 3");
        }
    }
}