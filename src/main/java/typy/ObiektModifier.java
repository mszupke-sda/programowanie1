package typy;

public class ObiektModifier {

    public void modify(Obiekt obiekt) {

        obiekt.setField(32);
    }

    public void modify(int field) {

        field = 32;

    }
}
