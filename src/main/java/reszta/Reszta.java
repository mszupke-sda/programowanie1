package reszta;

public class Reszta {

    public static void wydaj(int reszta) {
        int i = 0;
        int nominaly[] = { 100, 50, 20, 10, 5, 2, 1 };

        System.out.println("Kwota: " + reszta);

        // wydawaj do końca
        while (reszta > 0) {

            // czy nominał pasuje?
            if (reszta >= nominaly[i]) {

                // oblicz krotność
                int x = reszta / nominaly[i];

                // reszta do wydania
                reszta = reszta - x * nominaly[i];

                System.out.println("Wydano " + x + " razy " + nominaly[i]);
            }

            // kolejny nominał
            i++;
        }
    }
}
