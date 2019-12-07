package typy;

public class TabliceDekl {

    public static void main(String[] args) {

        int[] t1 = { 3, 5, 7 };
        int[][] t2 = { { 3, 4, 5 }, { 6, 7, 8 }};

        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < t2.length; i++) {

            for (int j = 0; j < t2[0].length; j++) {

                System.out.print(t2[i][j] + " ");

            }

            System.out.println();

        }
    }
}
