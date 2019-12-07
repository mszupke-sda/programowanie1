package typy;

import java.util.Vector;

public class VectorProgram {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(11);
        vector.add(19);
        vector.add(27);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        Integer lastElement = vector.lastElement();
        System.out.println(lastElement);

        if (vector.remove(lastElement)) {
            System.out.println("Usunąłem element " + lastElement);
        }

        Integer tmp = 999;
        if (vector.remove(tmp)) {
            System.out.println("Usunąłem element " + tmp);
        } else {
            System.out.println("Brak elementu " + tmp + " w wektorze");
        }

        while (vector.size() > 0) {
            vector.remove(0);
        }

        if (vector.size() == 0) {
            System.out.println("Wektor jest pusty");
        }
    }
}
