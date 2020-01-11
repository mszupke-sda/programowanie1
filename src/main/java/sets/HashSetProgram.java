package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

    public static void main(String[] args) {

        HashSet<Dog> hashSet = new HashSet();
        hashSet.add(new Dog(2));
        hashSet.add(new Dog(1));
        hashSet.add(new Dog(3));
        hashSet.add(new Dog(6));
        hashSet.add(new Dog(5));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
