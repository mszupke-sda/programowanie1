package rekurencja;

public class PostacDwojkowaProgram {

    public static void main(String args[]) {

//        for (int i = 1; i <= 100; i++) {
//            System.out.print("Postać dwójkowa liczby " + i + ": ");
//            PostacDwojkowa.konwersja(i, "");
//            System.out.println();
//        }

        System.out.println(konwersja(13, ""));
    }

    static String konwersja(int x, String wynik) {

        if (x == 0) {
            return wynik;
        }

        return konwersja(x / 2, (x % 2) + wynik);
    }
}
