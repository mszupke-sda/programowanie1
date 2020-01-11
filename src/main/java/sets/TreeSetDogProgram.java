package sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDogProgram {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add(new Dog(2));
        treeSet.add(new Dog(1));
        treeSet.add(new Dog(3));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
