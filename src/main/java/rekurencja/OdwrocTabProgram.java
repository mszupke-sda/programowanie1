package rekurencja;

public class OdwrocTabProgram {

    public static void main(String[] args) {
        int tab[] = { 1, 2, 3, 4, 5, 7, 6, 7, 8, 9 };
        System.out.print("Przed: ");

        for (int i : tab) {
            System.out.print(i);
        }

        System.out.println();

        OdwrocTab.odwroc(tab, 0, tab.length - 1);

        System.out.print("Po: ");

        for (int i : tab) {
            System.out.print(i);
        }
    }
}
