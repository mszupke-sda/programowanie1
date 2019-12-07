package rekurencja;

public class SumaProgram {

    public static void main(String[] args) {

        System.out.println(Suma.oblicz(5));
        System.out.println(suma(5));
    }

    private static int suma(int n) {

        if (n == 0) {
            return 0;
        }

        return n+ suma(n - 1);
    }
}
