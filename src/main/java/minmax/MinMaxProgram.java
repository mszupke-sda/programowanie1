package minmax;

public class MinMaxProgram {

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        int[] tab = { 23, 12, 1, -5, 34, -7, 45, 2, 88, -3, -9, 1 };
        int[] wyniki = new int[2];
        int[] wyniki2 = new int[2];

        for (int i = 0; i < tab.length; i++) {
            System.out.printf("[" + tab[i] + "] ");
        }

        System.out.println();
        MinMax.minMax1(tab, min, max);
        MinMax.minMax1(tab, wyniki);
        minmax(tab, wyniki2, 0, tab.length - 1);

//        System.out.println("Min: " + min + ", Max: " + max);
//        System.out.println("Min: " + wyniki[0] + ", Max: " + wyniki[1]);
        System.out.println("Min: " + wyniki2[0] + ", Max: " + wyniki2[1]);
    }

    private static void minmax(int[] tab, int[] wyniki, int left, int right) {

        if (left == right) {
            wyniki[0] = tab[left];
            wyniki[1] = tab[left];
        } else if (left == right - 1) {
            if (tab[left] > tab[right]) {
                wyniki[0] = tab[right];
                wyniki[1] = tab[left];
            } else {
                wyniki[0] = tab[left];
                wyniki[1] = tab[right];
            }
        } else {

            int srodek = (right + left) / 2;

            int[] wyniki1 = new int[2];
            int[] wyniki2 = new int[2];

            minmax(tab, wyniki1, left, srodek);
            minmax(tab, wyniki2, srodek + 1, right);

            if (wyniki1[0] < wyniki2[0]) {
                wyniki[0] = wyniki1[0];
            } else {
                wyniki[0] = wyniki2[0];
            }

            if (wyniki1[1] > wyniki2[1]) {
                wyniki[1] = wyniki1[1];
            } else {
                wyniki[1] = wyniki2[1];
            }

        }

    }
}
