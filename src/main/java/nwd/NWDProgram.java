package nwd;

public class NWDProgram {

    public static void main(String[] args) {

        int a = 17 * 198;
        int b = 17 * 19000;

        System.out.println(NWD.nwdSimpleRecurence(a, b));
        // System.out.println(NWD.nwdModulo(a, b));
        // System.out.println(NWD.nwdRecurence(a, b, 0));
    }
}
