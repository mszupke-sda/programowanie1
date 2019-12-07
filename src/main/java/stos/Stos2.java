package stos;

import java.util.Vector;

public class Stos2<T> {

    private Vector<T> stos = new Vector<>();
    private final int maxSize;
    private int index = 0;

    public Stos2(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(T element) {

        if (index < maxSize) {
            stos.add(element);
            index++;
        }
    }

    public T pop() {
        T element = stos.lastElement();
        stos.remove(element);
        index--;
        return element;
    }

    public int size() {
        return index;
    }
}
