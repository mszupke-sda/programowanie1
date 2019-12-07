package rekurencja;

public class SumaTabProgram {

    public static void main(String[] args) {

        int[] tab1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] tab2 = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };
        int[] tab3 = new int[tab1.length];
        SumaTab.oblicz(tab1, tab2, tab3, 0);
        oblicz(tab1, tab2, tab3, 0);

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

        System.out.println();
        System.out.println("+");

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }

        System.out.println();
        System.out.println("=");

        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
    }

    private static void oblicz(int[] tab1, int[] tab2, int[] tab3, int index) {

//        tab3[0] = tab1[0] + tab2[0];
//        tab3[1] = tab1[1] + tab2[1];
//        tab3[2] = tab1[2] + tab2[2];

        // ...

        if (index >= tab1.length) {
            return;
        }

        tab3[index] = tab1[index] + tab2[index];
        index++;
        oblicz(tab1, tab2, tab3, index);

//        while (index < tab1.length) {
//            tab3[index] = tab1[index] + tab2[index];
//            index++;
//        }
    }
}
