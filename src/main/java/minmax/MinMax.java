package minmax;

public class MinMax {

    public static void minMax1(int[] tab, int min, int max) {

        for (int i = 0; i < tab.length; i++) {

            if (max < tab[i]) {
                max = tab[i];
            }

            if (min > tab[i]) {
                min = tab[i];
            }
        }
    }

    public static void minMax1(int[] tab, int[] wyniki) {

        for (int i = 0; i < tab.length; i++) {

            if (wyniki[1] < tab[i]) {
                wyniki[1] = tab[i];
            }

            if (wyniki[0] > tab[i]) {
                wyniki[0] = tab[i];
            }
        }
    }

    public static void minMax2(int[] tab, int[] wyniki, int left, int right) {

        if (left == right) {
            wyniki[0] = wyniki[1] = tab[left];
        } else if (left == right - 1) {
            if (tab[left] < tab[right]) {
                wyniki[0] = tab[left];
                wyniki[1] = tab[right];
            } else {
                wyniki[0] = tab[right];
                wyniki[1] = tab[left];
            }
        } else {
            int[] tmp_wyniki1 = new int[2];
            int[] tmp_wyniki2 = new int[2];
            int srodek = (left + right) / 2;
            minMax2(tab, tmp_wyniki1, left, srodek);
            minMax2(tab, tmp_wyniki2, srodek + 1, right);

            if (tmp_wyniki1[0] < tmp_wyniki2[0]) {
                wyniki[0] = tmp_wyniki1[0];
            } else {
                wyniki[0] = tmp_wyniki2[0];
            }

            if (tmp_wyniki1[1] > tmp_wyniki2[1]) {
                wyniki[1] = tmp_wyniki1[1];
            } else {
                wyniki[1] = tmp_wyniki2[1];
            }
        }
    }
}
