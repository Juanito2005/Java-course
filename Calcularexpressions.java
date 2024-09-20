import java.util.Scanner;

public class Calcularexpressions {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the radio of the circle:");
        double rad = myScanner.nextDouble();

        Double calcular = Math.PI * Math.pow(rad, 2);
        System.out.println("The result is: " + calcular);
        myScanner.close();
    }
}
