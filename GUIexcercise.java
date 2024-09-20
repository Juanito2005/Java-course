import javax.swing.JOptionPane;

public class GUIexcercise {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Enter your name :)");
        JOptionPane.showMessageDialog(null,"Hello " + nombre + " how are you?");
    }
}
