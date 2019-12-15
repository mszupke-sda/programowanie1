package sort;

public class SortProgram {

    public static void main(String[] args) {

//        testInsertSort();
//        testBubbleSort();
//        testQuicksort();
        testMergeSort();
    }

    private static void testInsertSort() {

        System.out.println("Sortowanie przez wstawianie");
        int[] tab = { 4, 3, 1, 9, 0, 15, 7, 2, 8 };
        InsertSort.sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private static void testBubbleSort() {

        System.out.println("Sortowanie bąbelkowe");
        int[] tab = { 4, 3, 1, 9, 0, 15, 7, 2, 8 };
        BubbleSort.sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private static void testQuicksort() {

        System.out.println("Sortowanie szybkie");
        int[] tab = { 4, 3, 1, 9, 0, 15, 7, 2, 8 };
        Quicksort.sort2(tab, 0, tab.length - 1);
//        quicksort(tab, 0, tab.length - 1);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private static void testMergeSort() {
        System.out.println("Sortowanie przez scalanie");
        int[] tab = { 4, 3, 1, 9, 0, 15, 7, 2, 8 };
        MergeSort.sort(tab, 0, tab.length - 1);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private static void quicksort(int[] tab, int left, int right) {

//        if (left == right || left < 0 || right < 0 || left > tab.length - 1 || right > tab.length - 1) {
//            return;
//        }

        int pivotIndex = left;
        int switchIndex = right;
        boolean fromLeft = false;

        if (left < right) {
            while (switchIndex != pivotIndex) {
                if ((tab[pivotIndex] > tab[switchIndex] && !fromLeft) || tab[pivotIndex] < tab[switchIndex] && fromLeft) {

                    int tmpValue = tab[switchIndex];
                    tab[switchIndex] = tab[pivotIndex];
                    tab[pivotIndex] = tmpValue;

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

            quicksort(tab, left, pivotIndex - 1);
            quicksort(tab, pivotIndex + 1, right);

        }
    }
}
