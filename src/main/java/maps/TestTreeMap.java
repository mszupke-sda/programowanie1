package maps;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        Dog d1 = new Dog("red", 30);
        Dog d2 = new Dog("black", 20);
        Dog d3 = new Dog("white", 10);
        Dog d4 = new Dog("white", 15);

        TreeMap<Dog, Integer> treeMap = new TreeMap();
        treeMap.put(d1, 10);
        treeMap.put(d2, 15);
        treeMap.put(d3, 5);
        treeMap.put(d4, 20);

        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
