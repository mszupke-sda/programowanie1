package maps;

public class Dog implements Comparable {
    private String color;
    private int size;

    public Dog(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return ((Dog) o).color == this.color;
    }

    @Override
    public int hashCode() {
        return color.length();
    }

    @Override
    public int compareTo(Object o) {
        Dog dog = (Dog) o;
        return  dog.getSize() - this.size;
    }
}
