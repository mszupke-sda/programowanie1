package typy;

public class Napisy {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = "Hello";
        String s3 = "Hello\u0040";

        System.out.println("Przykład konwersji liczby na napis: " + s1 + 13);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        s3 = s3.substring(0, 2);

        System.out.println("Skrócone s3 = " + s3);
        System.out.println("Długość s3 = " + s3.length());

        String s4 = "Hello";

        if (s4 + s4 == "HelloHello") {
            System.out.println("OK");
        } else {
            System.out.println("Nie-OK");
        }

        if (s2.equals(s4)) {
            System.out.println("s2 = s4: " + s2 + " - " + s4);
        }

        for (int i = 0; i < s4.length(); i++) {
            System.out.println("Znak na pozycji [" + i + "] = " + s4.charAt(i));
        }

        System.out.println("s2 dużymi literami: " + s2.toUpperCase());
        System.out.println("Fragment [1-2] napisu s2: " + s2.substring(1, 3));
    }
}
