package stos;

import java.util.Enumeration;
import java.util.Vector;

public class Stos<T>  {

    private Vector<T> stos;

    public Stos() {
        stos = new Vector<>();
    }

    public void wyczysc() {
        stos.clear();
    }

    public void wypisz() {
        Enumeration enumeration = stos.elements();
        System.out.print(" Zawartość stosu: [");

        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        System.out.println("]");
    }

    public void push(T element) {
        stos.add(element);
    }

    public T pop() {
        T temp = null;
        if (stos.size() > 0) {
            temp = stos.lastElement();
            stos.remove(temp);
        }

        return temp;
    }

    public int rozmiar() {
        return stos.size();
    }
}
