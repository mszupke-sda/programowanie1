package sort;

public class Quicksort {

    public static void sort(int[] tab, int left, int right) {

        int temp;
        if (left < right) {

            int m = left;

            for (int i = left + 1; i <= right; i++) {

                if (tab[i] < tab[left]) {
                    m += 1;
                    temp = tab[m];
                    tab[m] = tab[i];
                    tab[i] = temp;
                }
            }

            temp = tab[left];
            tab[left] = tab[m];
            tab[m] = temp;

            sort(tab, left, m - 1);
            sort(tab, m + 1, right);
        }
    }

    public static void sort2(int[] tab, int left, int right) {

        int pivotIndex = left;
        int switchIndex = right;
        boolean fromLeft = false;

        if (left < right) {
            while (pivotIndex != switchIndex) {

                if ((tab[pivotIndex] > tab[switchIndex] && !fromLeft) || (tab[pivotIndex] < tab[switchIndex] && fromLeft)) {

                    int tmp = tab[switchIndex];
                    tab[switchIndex] = tab[pivotIndex];
                    tab[pivotIndex] = tmp;

                    int tmpIndex = switchIndex;
                    switchIndex = pivotIndex;
                    pivotIndex = tmpIndex;

                    fromLeft = !fromLeft;
                }

                if (fromLeft) {
                    switchIndex++;
                } else {
                    switchIndex--;
                }
            }

            sort2(tab, left, pivotIndex - 1);
            sort2(tab, pivotIndex + 1, right);
        }
    }
}
