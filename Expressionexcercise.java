import java.util.Scanner;

public class Expressionexcercise {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        
        System.out.println("Enter the first number for the expression:");
        int n1 = escanear.nextInt();
        System.out.println("Enter the second number for the expression:");
        int n2 = escanear.nextInt();
        System.out.println("Enter the third number for the expression:");
        int n3 = escanear.nextInt();

        int expressionSimple = (n1 + n2 * n3);
        System.out.println("The expression is:" + n1 + " + " + n2 + " * " + n3);
        System.out.println(expressionSimple);
        escanear.close();
    }
}
