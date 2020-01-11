package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListsProgram {

    public static void main(String[] args) {

        arrayList();
        linkedList();
        performance();
    }

    private static void arrayList() {

        System.out.println("ArrayList");

        ArrayList al = new ArrayList();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);

        Iterator iter1 = al.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        System.out.println("");
    }

    private static void linkedList() {

        System.out.println("LinkedList");

        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(6);
        Iterator iter2 = ll.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

        System.out.println("");
    }

    private static void performance() {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // ArrayList add
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);

        // ArrayList remove
        startTime = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);

        // LinkedList remove
        startTime = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
    }
}
