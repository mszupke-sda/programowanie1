package iterator;

import fauna.Cat;
import sets.Dog;

import java.util.ArrayList;
import java.util.Objects;

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

        String a = "ala";
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        int b = 199;

        System.out.println(Objects.hashCode(a));
        System.out.println(Objects.hashCode(arrayList));
        System.out.println(Objects.hashCode(b));
        System.out.println(Objects.hashCode(new Dog(19)));
        System.out.println(Objects.hashCode(new Cat()));
    }
}
