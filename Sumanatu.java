import javax.swing.JOptionPane;
public class Sumanatu {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo y natural please :)"));
        int i = 1;
        int suma = 0;
        while (n >= i) {
            suma = suma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "La suma del numero natural es : " + suma);
    }
}
