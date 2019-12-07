package rekurencja;

public class BinarySearch {

    public static int szukaj(int tab[], int left, int right, int x) {

        if (left > right) {
            // element nieznaleziony
            return -1;
        }

        int mid = (left + right) / 2;
        if (tab[mid] == x) {
            // zwracamy pozycję, pod którą element został odnaleziony
            return mid;
        }

        if (x < tab[mid]) {
            return szukaj(tab, left, mid - 1, x);
        } else {
            return szukaj(tab, mid + 1, right, x);
        }
    }
}
