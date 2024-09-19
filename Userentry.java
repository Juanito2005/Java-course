import java.util.Scanner;

public class Userentry {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);

        System.out.println("What number do you want teacher?");
        int numero = MyScanner.nextInt();

        System.out.println("What decimal number do you want teacher?");
        double decimal = MyScanner.nextDouble();
        MyScanner.nextLine();
        
        System.out.println("Would you like to write your name teacher :) ?");
        String name = MyScanner.nextLine();

        System.out.println("Your integer number is: " + numero);
        System.out.println("Your choosed decimal number is: " + decimal);
        System.out.println("Your name is: " + name);
        MyScanner.close();
    }
}
