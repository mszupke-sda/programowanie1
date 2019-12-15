package fauna;

public class Zoo {

    private Human zookeeper;

    public Animal getLew() {
        Animal animal = new Lion();

        Zookeeper lionZookeeper = new Zookeeper<Lion>();
        Zookeeper goldfishZookeeper = new Zookeeper<Goldfish>();

        return animal;
    }

    private void test() {

        while (zookeeper != null && warunek() == 1 || 1 < 2) {


        }

    }

    private int warunek() {
        return 1;
    }

    public Human getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Human zookeeper) {
        this.zookeeper = zookeeper;
    }
}
