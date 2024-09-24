import java.util.Random;

import javax.swing.JOptionPane;

public class Password {
    public static void main(String[] args) {
        String caracteres = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIKLMNPQRPVORSTUWXYZ0123456789";
        int longitud = 8;
        boolean newpassword = true;
        
        while (newpassword) {
            String contraseña = paswordMaker(caracteres, longitud);
            JOptionPane.showMessageDialog(null, "Su contraseña es :" + contraseña);
            String desicion = JOptionPane.showInputDialog("Quieres otra contraseña? (unicas respuestas validas: si y no)");
            switch (desicion) {
                case "si":
                    newpassword = true;
                    break;
                case "no":
                    newpassword = false;
                default:
                    break;
            }
        }
    }

    public static String paswordMaker(String caracteres, int longitud) {
        Random aleatorio = new Random();
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = aleatorio.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contraseña.append(caracter);
        }
        return contraseña.toString();
    }
}