public class Variablesexcercise {

    public static void main(String[] args) {
        int z = 1234567890;
        int b = 234567890;
        byte f = 123;
        short averyshort = 12345;
        long a = 1234567890123456789L;
        float c = 3.1416f;
        double p = 3.14;
        boolean d = true;
        char parentesis = ')';
        String name = "Camilo";

        System.out.println(z);
        System.out.println(f);
        System.out.println(averyshort);
        System.out.println(a);
        System.out.println(c);
        System.out.println(p);
        System.out.println(d);
        System.out.println(parentesis);
        System.out.println("Aquí abajo estan las variables intercambiadas: " + name);

        z = z + b;
        b = z - b;
        z = z - b;

        System.out.println("x :" + z);
        System.out.println("y :" + b);

        int j = 5, k = 3;

        j = j ^ k;
        k = k ^ j;
        j = j ^ j;

        System.out.println("j :" + j);
        System.out.println("k :" + k);
    }
}