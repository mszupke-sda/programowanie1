package stos;

public abstract class StosElement<T> {

    private final T element;

    public StosElement(T element) {
        this.element = element;
    }
}
