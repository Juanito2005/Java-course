import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

import javax.swing.JOptionPane;

public class CalculadoraHashMap {
    public static void main(String[] args) {
        Map<String, BinaryOperator<Double>> opr = new HashMap<>();
        opr.put("+", (a, b) -> a + b);
        opr.put("-", (a, b) -> a - b);
        opr.put("*", (a, b) -> a * b);
        opr.put("/", (a, b) -> a / b);
        
        while (true) {
            
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número :) :"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número ;) :"));
            String operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /)");

            double resultado = opr.getOrDefault(operacion, (a, b) -> 0.0).apply(num1, num2);
            JOptionPane.showMessageDialog(null, "Su resultado es: " + resultado);
            }
        }
    }
//Esto lo aprendí a medias, debo repasar mas sobre "import: Map, HasMap y BinaryNoSeQue"