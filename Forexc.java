import javax.swing.JOptionPane;
public class Forexc {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero que quieras multiplicar :)) "));
        int max = 10;
        int multi = 0;
        for (int i = 0; i <= max; i++) {
            multi = n * i;
            JOptionPane.showMessageDialog(null, n + " * " +  i + " = " + multi);
        }
    }
}