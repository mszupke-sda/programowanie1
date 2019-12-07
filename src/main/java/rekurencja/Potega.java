package rekurencja;

public class Potega {

    public static int oblicz(int podstawa, int potega) {

        if (potega == 0) {
            return 1;
        }

        if (potega == 1) {
            return podstawa;
        }

        return podstawa * oblicz(podstawa, potega - 1);
    }
}
