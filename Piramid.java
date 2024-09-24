import java.util.Scanner;
public class Piramid {
    public static void main(String[] args) {
        int filas = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el caracter que quiera:");
        String caracter = scanner.next();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= 2 * i - 1; x++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
        scanner.close();
    }
}
