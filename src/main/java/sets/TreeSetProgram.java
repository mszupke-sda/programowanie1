package sets;

import tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add("ala");
        treeSet.add("beata");
        treeSet.add("ada");
        treeSet.add("Alicja");

        Iterator iterator = treeSet.iterator();
        System.out.print("Tree set data: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        TreeSet<Item> newTreeSet = new TreeSet();
        newTreeSet.add(new Item(12));
        newTreeSet.add(new Item(64));
        newTreeSet.add(new Item(32));
        newTreeSet.add(new Item(20));

        iterator = newTreeSet.iterator();
        System.out.print("Tree set data: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static class Item implements Comparable<Item> {
        private int value;

        public Item(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Item object) {
            int result = value - object.value;

            // result < 0 -
            // result > 0
            // result == 0

            return result;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value +
                    '}';
        }


    }

}
