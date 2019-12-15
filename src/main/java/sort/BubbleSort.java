package sort;

public class BubbleSort {

    public static void sort(int[] tab) {

        for (int i = 0; i < tab.length - 1; i++) {

            for (int j = 0; j < tab.length - i - 1; j++) {

                if (tab[j] > tab[j + 1]) {

                    // zamiana
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
}
