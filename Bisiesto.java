import javax.swing.JOptionPane;
public class Bisiesto {
    public static void main(String[] args) {
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año:"));

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            JOptionPane.showMessageDialog(null, "El año " + año + " es bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + año + " no es bisiesto.");
        }
    }
}
