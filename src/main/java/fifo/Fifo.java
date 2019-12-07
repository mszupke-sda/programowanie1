package fifo;

import java.util.Vector;

public class Fifo<T> {

    private Vector<T> kolejka;
    private int glowa, ogon, dlugosc;
    private final int rozmiar;

    public Fifo(int rozmiar) {
        kolejka = new Vector<T>(rozmiar);
        glowa = dlugosc = 0;
        ogon = -1;

        this.rozmiar = rozmiar;
    }

    public void wstaw(T obj) {
        System.out.println(" Wstawiam: " + obj);

        if (dlugosc != rozmiar) {

            if (ogon == (rozmiar - 1)) {
                ogon = -1;
            }

            kolejka.insertElementAt(obj, ++ogon);
            dlugosc++;
        } else {
            System.out.println("** Kolejka pełna **");
        }
    }

    public T obsluz() {
        T temp = kolejka.elementAt(glowa++);
        if (glowa == rozmiar) {
            glowa = 0;
        }

        dlugosc--;
        return temp;
    }

    public void wypisz() {
        System.out.println("Zawartość kolejki: ");

        int k = glowa;
        for (int i = 0; i < dlugosc; i++) {
            if (k == rozmiar) {
                k = 0;
            }

            System.out.print(" [" + i + "]=" + kolejka.elementAt(k++) + " ");
        }
    }

    public boolean pusta() {
        return dlugosc == 0;
    }
}
