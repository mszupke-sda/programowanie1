package rekurencja;

public class PalindromProgram {

    public static void main(String[] args) {

        System.out.println(Palindrom.czyPalindrom("rotor"));
//        System.out.println(Palindrom.czyPalindrom("rottor"));
//        System.out.println(Palindrom.czyPalindrom("motor"));
//        System.out.println(Palindrom.czyPalindrom("rostor"));
//
//        System.out.println(Palindrom.czyPalindrom("rotor", 0, "rotor".length() - 1));
//        System.out.println(Palindrom.czyPalindrom("rottor", 0, "rottor".length() - 1));
//        System.out.println(Palindrom.czyPalindrom("motor", 0, "motor".length() - 1));
//        System.out.println(Palindrom.czyPalindrom("rostor", 0, "rostor".length() - 1));

        System.out.println(czyPalindrom("rotor"));
    }

    private static boolean czyPalindrom(String slowo) {

        // kajak
        // 0-4
        // 1-3
        // 2-2


//        while (leftIndex <= rightIndex) {
//
//            if (slowo.charAt(leftIndex) == slowo.charAt(rightIndex)) {
//                leftIndex++;
//                rightIndex--;
//                continue;
//            }
//
//            return false;
//
//        }

        if (slowo.length() <= 1) {
            return true;
        }

        if (slowo.charAt(0) != slowo.charAt(slowo.length() - 1)) {
            return false;
        }

        slowo = slowo.substring(1, slowo.length() - 1);

        return czyPalindrom(slowo);
    }
}
