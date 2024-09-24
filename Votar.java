import javax.swing.JOptionPane;
public class Votar {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad si no es mucha molestia :) "));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Felicidades champion, ya puedes ir a votarle a un mentiroso");
        } else {
            JOptionPane.showMessageDialog(null, "Espera unos añitos mas y ya podrás votar a un hablador");
        }
    }
}
