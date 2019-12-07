package nwd;

public class NWD {

    public static int nwdModulo(int a, int b) {

        if (a == b || b == 0) {
            return a;
        }

        int counter = 0;

        while (b > 0) {

            int c = b;
            b = a % b;
            a = c;

            counter++;
        }

        System.out.println("Ilość kroków: " + counter);

        return a;
    }

    public static int nwdSimple(int a, int b) {

        int counter = 0;

        while (a != b) {

            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }

            counter++;
        }

        System.out.println("Ilość kroków: " + counter);

        return a;
    }

    public static int nwdSimpleRecurence(int a, int b) {

        if (a < b) return nwdSimpleRecurence(a, b - a);
        if (a > b) return nwdSimpleRecurence(a - b, b);

        System.out.println(a);

        return a;
    }

    public static int nwdRecurence(int a, int b, int counter) {

        if (a == b || b == 0) {
            return a;
        }

        System.out.println("Ilość kroków: " + ++counter);

        return nwdRecurence(b, a % b, counter);
    }
}
