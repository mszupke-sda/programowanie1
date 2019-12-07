package fauna;

public class Fish extends Animal {

    // pływanie
    protected final PlywanieInterface plywanieInterface;

    public Fish(PlywanieInterface plywanieInterface) {
        this.plywanieInterface = plywanieInterface;
    }
}
