package sort;

public class MergeSort {

    /**
     *
     * @param tab
     * @param left
     * @param right
     */
    public static void sort(int[] tab, int left, int right) {
        if (left < right) {
            int srodek = (left + right) / 2;
            sort(tab, left, srodek);
            sort(tab, srodek + 1, right);
            scal2(tab, left, srodek, right);
        }
    }

    // [9 5 3 1 0 12 6]
    // [9 5 3 1] [0 12 6]
    // leftIndex1 = 0
    // rightIndex1 = 3
    // srodek = 3
    // leftIndex2 = 4
    // rightIndex2 = 6

    public static void scal2(int[] tab, int left, int srodek, int right) {

        // potrzebujemy określić, gdzie w naszej tablicy znajdują się podtablice do scalenia
        int leftIndex1 = left;
        int rightIndex1 = srodek;

        int leftIndex2 = srodek + 1;
        int rightIndex2 = right;

        int[] tmpTab = new int[tab.length];

        int i = left;

        while (leftIndex1 <= rightIndex1 && leftIndex2 <= rightIndex2) {

            if (tab[leftIndex1] < tab[leftIndex2]) {
                tmpTab[i] = tab[leftIndex1];
                leftIndex1++;
            } else {
                tmpTab[i] = tab[leftIndex2];
                leftIndex2++;
            }

            i++;
        }

        while (leftIndex1 <= rightIndex1) {
            tmpTab[i] = tab[leftIndex1];
            i++;
            leftIndex1++;
        }

        while (leftIndex2 <= rightIndex2) {
            tmpTab[i] = tab[leftIndex2];
            i++;
            leftIndex2++;
        }

        for (i = left; i <= right; i++) {
            tab[i] = tmpTab[i];
        }
    }

    /**
     *
     * @param tab
     * @param left - początek
     * @param srodek - środek
     * @param right - koniec
     */
    private static void scal(int[] tab, int left, int srodek, int right) {

        // krok 1 - tworzymy indeksy opisujące pierwszą podtablicę
        int left1 = left;
        int right1 = srodek;

        // krok 2 - tworzymy indeksy opisujące drugą podtablicę
        int left2 = srodek + 1;
        int right2 = right;

        // krok 3 - tworzymy tablicę pomocniczą
        int[] tmpTab = new int[tab.length];

        // krok 4 - tworzymy indeks, po którym będziemy iterować
        int i = left1;

        // do wyczerpania obu podtablic dokonaj scalenia za pomocą tablicy pomocniczej
        while (left1 <= right1 && left2 <= right2) {

            if (tab[left1] < tab[left2]) {
                tmpTab[i] = tab[left1];
                left1++;
            } else {
                tmpTab[i] = tab[left2];
                left2++;
            }

            i++;
        }

        while (left1 <= right1) {
            tmpTab[i] = tab[left1];
            i++;
            left1++;
        }

        while (left2 <= right2) {
            tmpTab[i] = tab[left2];
            i++;
            left2++;
        }

        for (i = left; i <= right; i++) {
            tab[i] = tmpTab[i];
        }
    }
}
