package rekurencja;

public class SzukajTab {

    /**
     *
     * @param tab - tablica, w której szukamy
     * @param left - lewa granica obszaru poszukiwań
     * @param right - prawa granica obszaru poszukiwań
     * @param x - wartość do znalezienia
     */
    public static void szukaj(int tab[], int left, int right, int x) {

        if (left > right) {
            System.out.println("Element " + x + " nie został odnaleziony");
        } else {
            if (tab[left] == x) {
                System.out.println("Znalazłem szukany element " + x);
            } else {
                szukaj(tab, left + 1, right, x);
            }
        }
    }

}
