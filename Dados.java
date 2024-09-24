import javax.swing.JOptionPane;

public class Dados {
    public static void main(String[] args) {
        
        while (true) {
            String desicion = JOptionPane.showInputDialog("Quieres tirar los dados? (unicas respuestas validas: si y no):");
            int dados = (int)(Math.random() * (6 - 1 + 1)) + 1;
            switch (desicion) {
                case "si":
                JOptionPane.showMessageDialog(null, "Tu tirada de dados es: " + dados);
                break;
                case "no":
                JOptionPane.showMessageDialog(null, "A bueno :(( entonces pa que juegas??");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Solo puedes decir si o no " );
            }
        }
        
    }
}
