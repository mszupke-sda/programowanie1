package sort;

public class SortProgram {

    public static void main(String[] args) {

        testInsertSort();
        testBubbleSort();
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
}
