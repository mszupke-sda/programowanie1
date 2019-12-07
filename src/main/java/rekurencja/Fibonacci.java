package rekurencja;

public class Fibonacci {

    public static int oblicz(int a) {

        if (a == 0) {
            return 0;
        }

        if (a == 1) {
            return 1;
        }

        return oblicz(a - 2) + oblicz(a - 1);
    }
}
