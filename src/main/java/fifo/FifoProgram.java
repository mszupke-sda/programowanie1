package fifo;

public class FifoProgram {

    public static void main(String[] args) {

        int i;
        Fifo<String> kolejka = new Fifo<String> (4); //kolejkadoobsługinapisów(np.nazwisk)

        kolejka.wstaw("Kowalska");
        kolejka.wstaw("Fronczak");
        kolejka.wstaw("Bęcki");
        kolejka.wstaw("Pigwa");
        kolejka.wstaw("Pigwa1");
        kolejka.wstaw("Pigwa2"); //te operacje już się niepowiodą!
        kolejka.wypisz();

        String s;
        s = kolejka.obsluz();
        System.out.println("Obsłużony został klient: " + s);
        kolejka.wypisz();

        System.out.println("Przyszedł Pan Last Minute...");
        kolejka.wstaw("Mr Last Minute");
        kolejka.wypisz();

        while (!kolejka.pusta()) { // ekspresowa obsługa całej kolejki przed zamknięciem sklepu!
            s = kolejka.obsluz();
            System.out.println("Obsłużony został klient: " + s);
        }

        if (!kolejka.pusta()) {
            s = kolejka.obsluz(); //tu już kolejka będzie pusta
        }  else {
            System.out.println("Kolejka pusta!");
        }
    }
}
