package rekurencja;

public class BinarySearchProgram {

    public static void main(String[] args) {

        int tab[] = { 1, 2, 6, 18, 20, 23, 29, 32, 34, 39, 40, 41 };
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + ":" + tab[i] + " ");
        }

        System.out.println();

        // Zrealizować algorytm szukania binarnego
        // dzielimy tablicę na pół
        // jeśli w połowie znajduje się element szukany to zwracamy jego index
        // jeśli w połowie znajduje się element większy niż szukany to szukamy po lewej stronie od środkowego elementu
        // jeśli w połowie znajduje się element mniejszy niż szukany to szukamy po prawej stronie od środkowego elementu

        System.out.println("Szukam 23, wynik: " + BinarySearch.szukaj(tab, 0, tab.length - 1, 23));
        System.out.println("Szukam 3, wynik: " + BinarySearch.szukaj(tab, 0, tab.length - 1, 3));

        System.out.println("Szukam 3, wynik: " + szukaj(tab, 41));
    }

    static int szukaj(int[] tab, int x) {

        int left = 0;
        int right = tab.length - 1;

        while (left <= right) {

            int indeksSrodka = (right + left) / 2;

            if (tab[indeksSrodka] == x) {
                return indeksSrodka;
            }

            if (tab[indeksSrodka] > x) {
                right = indeksSrodka - 1;
            } else {
                left = indeksSrodka + 1;
            }
        }

        return -1;
    }
}
