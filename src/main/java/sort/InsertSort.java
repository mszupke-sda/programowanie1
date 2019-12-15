package sort;

public class InsertSort {

    public static void sort(int[] tab) {

        for (int i = 1; i < tab.length; i++) {

            int j = i;      // fragment [0, ..., i - 1] jest już posortowany
            int temp = tab[j];

            while (j > 0 && tab[j - 1] > temp) {

                tab[j] = tab[j - 1];
                j--;
            }

            tab[j] = temp;
        }
    }
}
