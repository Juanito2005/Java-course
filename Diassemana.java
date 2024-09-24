import javax.swing.JOptionPane;
public class Diassemana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Ingrese un numero del 1 al 7 please :)");
        switch (dia) {
            case "1":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Lunes");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Martes");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Miercoles o Merlina para los gringos ;)");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Jueves");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Viernes/Black Friday");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Sabado");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "El numero " + dia + " corresonde a Domingo/Ya mañana es Lunes otra vez :(");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ey pana sea serio mete un numero, no caracteres ni vainas raras :(");
                break;
        }
    }
}
