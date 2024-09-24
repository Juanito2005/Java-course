import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        
        while (true) {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

            String opr = JOptionPane.showInputDialog("Ingrese el tipo de operacion: (+, -, *, /)");

            double result = 0;
            switch (opr) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    if (n1 == 0 || n2 == 0){
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero mi compa :((");
                    } else {
                        result = n1 / n2;
                    }
                    break;
                default:
                JOptionPane.showMessageDialog(null, "Todavia no puedo hacer esta operacion... a menos que me pagues ;)");
            }
            JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + result);
        }
    }
}
//Aquí debo aprender sobre switch