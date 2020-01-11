package sets;

import java.util.Objects;

public class Dog implements Comparable<Dog> {
    private int size;

    public int getSize() {
        return size;
    }

    public Dog(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Dog o) {

        if (size < o.getSize()) {
            return -1;
        }

        if (size > o.getSize()) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return size == dog.size;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
