package rekurencja;

public class PostacDwojkowa {

    public static void konwersja(int n, String postacDwojkowa) {

        if (n != 0) {
            postacDwojkowa = (n % 2) + postacDwojkowa;
            konwersja(n / 2, postacDwojkowa);
        } else {
            System.out.println(postacDwojkowa);
        }
    }
}
