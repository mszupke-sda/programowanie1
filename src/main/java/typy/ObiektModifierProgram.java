package typy;

public class ObiektModifierProgram {

    public static void main(String[] args) {

        Obiekt obiekt = new Obiekt();
        ObiektModifier obiektModifier = new ObiektModifier();

        obiektModifier.modify(obiekt.getField());
        System.out.println(obiekt.getField());

        obiektModifier.modify(obiekt);
        System.out.println(obiekt.getField());

    }
}
