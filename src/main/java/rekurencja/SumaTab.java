package rekurencja;

public class SumaTab {

    public static void oblicz(int[] tab1, int[] tab2, int[] result, int index) {

        if (index == tab1.length) {
            return;
        }

        result[index] = tab1[index] + tab2[index];
        oblicz(tab1, tab2, result, index + 1);
    }
}
