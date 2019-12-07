package fauna;

public class Goldfish extends Fish {

    public Goldfish(PlywanieInterface plywanieInterface) {
        super(plywanieInterface);
    }

    public void plyn() {
        plywanieInterface.plywam();
    }
}
