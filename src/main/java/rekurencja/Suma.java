package rekurencja;

public class Suma {

    public static int oblicz(int n) {

        if (n == 0) {
            return 0;
        }

        return n + oblicz(n - 1);
    }
}
