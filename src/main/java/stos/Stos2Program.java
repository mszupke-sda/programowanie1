package stos;

public class Stos2Program {

    public static void main(String[] args) {

        Stos2<Object> stos = new Stos2<>(10);

        stos.push("a");
        stos.push("b");
        stos.push("c");

        System.out.println(stos.pop());

    }
}
