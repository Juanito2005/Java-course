import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String[] args) {
        String letras = JOptionPane.showInputDialog(null,"Ingresa un numero mi reina :)");
        int n = Integer.parseInt(letras);
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }
}
