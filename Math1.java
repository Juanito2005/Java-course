import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        Double base = myScanner.nextDouble();
        System.out.println("Ingrese el exponente: ");
        Double exponente = myScanner.nextDouble();
        
        Double result = Math.pow(base, exponente);
        System.out.println("El resultado de la operacion es: " + result);

        System.out.println("Ingrese un numero negativo (ejemplo: -10): ");
        Double negativo = myScanner.nextDouble();
        System.out.println("Ingrese un numero positivo (ejemplo: 55): ");
        Double positivo = myScanner.nextDouble();
        negativo = Math.abs(negativo);
        positivo = Math.abs(positivo);
        System.out.println("El numero negativo ahora es este: " + negativo);
        System.out.println("El numero positivo ahora es este: " + positivo);

        System.out.println("Ingrese un numero para hacer la raiz cuadrada: ");
        Double raiz = myScanner.nextDouble();
        System.out.println("El resultado es: " + (raiz = Math.sqrt(raiz)));
        myScanner.close();
    }
}