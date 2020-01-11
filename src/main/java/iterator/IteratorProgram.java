package iterator;

public class IteratorProgram {

    public static void main(String[] args) {

        Iterator iterator = new Iterator();

        if (iterator.hasNext()) {
            System.out.println("Iterator ma next");
        } else {
            System.out.println("Iterator nie ma next");
        }

        iterator.add(1);
        iterator.add(2);

        if (iterator.hasNext()) {
            System.out.println("Iterator ma next");
            System.out.println(iterator.next());
        } else {
            System.out.println("Iterator nie ma next");
        }

        if (iterator.hasNext()) {
            System.out.println("Iterator ma next");
            System.out.println(iterator.next());
        } else {
            System.out.println("Iterator nie ma next");
        }

        if (iterator.hasNext()) {
            System.out.println("Iterator ma next");
            System.out.println(iterator.next());
        } else {
            System.out.println("Iterator nie ma next");
        }

        iterator.initialize();

        if (iterator.hasNext()) {
            System.out.println("Iterator ma next");
            System.out.println(iterator.next());
        } else {
            System.out.println("Iterator nie ma next");
        }

    }
}
