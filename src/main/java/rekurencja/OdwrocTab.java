package rekurencja;

public class OdwrocTab {

    public static void odwroc(int tab[], int left, int right) {

        int tmp;

        if (left < right) {
            tmp = tab[left];
            tab[left] = tab[right];
            tab[right] = tmp;

            odwroc(tab, left + 1, right - 1);
        }
    }
}
