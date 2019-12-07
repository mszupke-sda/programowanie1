package rekurencja;

public class Palindrom {

    public static boolean czyPalindrom(String slowo) {

        if (slowo.length() <= 1) {
            return true;
        }

        if (slowo.charAt(0) == slowo.charAt(slowo.length() - 1)) {
            return czyPalindrom(slowo.substring(1, slowo.length() - 1));
        }

        return false;
    }

    public static boolean czyPalindrom(String slowo, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (slowo.charAt(left) == slowo.charAt(right)) {
            return czyPalindrom(slowo, left + 1, right - 1);
        }

        return false;
    }
}
