package stos;

public class StosProgram {

    public static void main(String[] args) {

        Stos<Integer> stos = new Stos<Integer>();

        stos.push(5);
        stos.push(2);
        stos.push(1);
        stos.push(3);

        stos.wypisz();

        Integer tmp = stos.pop();
        System.out.print("Zdjąłem ze stosu: " + tmp);
        stos.wypisz();

        tmp = stos.pop();
        System.out.print("Zdjąłem ze stosu: " + tmp);
        stos.wypisz();

        tmp = stos.pop();
        System.out.print("Zdjąłem ze stosu: " + tmp);
        stos.wypisz();

        tmp = stos.pop();
        System.out.print("Zdjąłem ze stosu: " + tmp);
        stos.wypisz();

        tmp = stos.pop();
        System.out.print("Zdjąłem ze stosu: " + tmp);
        stos.wypisz();

        Stos<String> s2 = new Stos<String> (); // stos do odkładania napisów
        String s;
        s2.push("Ala");
        s2.push(" ma_kota");
        s2.push(" Azora");
        s2.push(" Kiciusia");
        s2.wypisz();

        s = s2.pop();
        System.out.println("Zdjąłem ze stosu: " + s);
        s2.wypisz();

        s = s2.pop();
        System.out.println("Zdjąłem ze stosu: " + s);
        s2.wypisz();

        s = s2.pop();
        System.out.println("Zdjąłem ze stosu: " + s);
        s2.wypisz();
    }
}
