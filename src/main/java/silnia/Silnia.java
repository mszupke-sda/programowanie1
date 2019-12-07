package silnia;

public class Silnia {

    public static int oblicz(int a) {

        if (a == 0) {
            return 1;
        } else {
            return a * oblicz(a--);
        }
    }

    public static int obliczIteracyjnie(int a) {

        int result = 1;

//        for (int i = a; i > 0; i--) {
//            result = result * i;
//        }

        for (int i = 1; i <= a; i++) {
            result = result * i;
        }

        return result;
    }
}
