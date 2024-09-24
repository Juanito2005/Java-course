import java.util.Random;

import javax.swing.JOptionPane;;
public class Adivinan {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        int intentos = 4;
        int numeroSecreto = random.nextInt(11);
        JOptionPane.showMessageDialog(null, "Adivina un numero entre 1 y 10 (tienes 4 intentos, te la puse facil pa que no te quejes)");
        
        while (intentos > i ) {
            i++;
            int numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el número que crees que es: "));
            try {
                if (numeroIngresado < 1 || numeroIngresado > 10) {
                    JOptionPane.showMessageDialog(null,"Te dije que solo era entre 0 y 10");
                } else if (numeroIngresado < numeroSecreto) {
                    JOptionPane.showMessageDialog(null,"Nop, este no es");
                } else if (numeroIngresado > numeroSecreto) {
                    JOptionPane.showMessageDialog(null,"Nahh, este tampoco es");
                } else {
                    JOptionPane.showMessageDialog(null,"¡Por finn! Adivinaste el número");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Pana son numeros no letras ni cosas raras!!");
            }
        }
        JOptionPane.showMessageDialog(null, "Uyyy! se te agotaron los intentos :((");
        JOptionPane.showMessageDialog(null, "El numero a adivinar era: ..... jejeje no te lo voy a decir");
    }
}