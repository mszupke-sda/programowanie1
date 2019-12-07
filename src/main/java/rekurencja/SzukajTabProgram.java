package rekurencja;

public class SzukajTabProgram {

    public static void main(String[] args) {

        int tab[] = { 1, 2, 3, 2, -7, 44, 5, 1, 0, -3 };

        for (int i = 0; i < tab.length; i++) {
            System.out.print("tab[" + i + "] = " + tab[i] + " ");
        }

        System.out.println();

        // SzukajTab.szukaj(tab, 0, tab.length - 1, 7);
        // SzukajTab.szukaj(tab, 0, tab.length - 1, 5);

        szukaj(tab, 5);
    }

    static boolean szukaj(int[] tab, int x) {

        if (tab.length == 0) {
            System.out.println("Nie znalazłem " + x);
            return false;
        }

        if (tab[0] == x) {
            System.out.println("Znalazłem " + x);
            return true;
        }

        // TODO: tab2 = tab - pierwszy element
        int[] tab2 = new int[tab.length - 1];

        for (int i = 1; i < tab.length; i++) {
            tab2[i - 1] = tab[i];
        }

        return szukaj(tab2, x);
    }

    static boolean szukajIteracyjnie(int[] tab, int left, int x) {

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                System.out.println("Znalazłem " + x + " na pozycji " + i);
                return true;
            }
        }

        System.out.println("Nie znalazłem " + x);
        return false;
    }
}
