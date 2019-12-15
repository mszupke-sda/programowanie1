package listaJednokierunkowa;

public class ListaJenokierunkowaProgram {

    public static void main(String[] args) {

        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa(TrybPracyListyJednokierunkowej.LISTA_UPORZADKOWANA);

        listaJednokierunkowa.add(new ElementListyJednokierunkowej(1));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(11));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(12));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(0));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(4));

        System.out.println("Lista jednokierunkowa posiada " + listaJednokierunkowa.size() + " elementów");

        wypisz(listaJednokierunkowa);

        System.out.println();

        try {
            System.out.println(listaJednokierunkowa.pop(0));
        } catch (TrybPracyListyJednokierunkowejException e) {
            System.out.println("Niepoprawne wywołanie metody pop");
        }

        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        try {
            System.out.println(listaJednokierunkowa.pop(1));
        } catch (TrybPracyListyJednokierunkowejException e) {
            System.out.println("Niepoprawne wywołanie metody pop");
        }
        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        try {
            System.out.println(listaJednokierunkowa.pop(4));
        } catch (TrybPracyListyJednokierunkowejException e) {
            System.out.println("Niepoprawne wywołanie metody pop");
        }
        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        try {
            System.out.println(listaJednokierunkowa.pop(12));
        } catch (TrybPracyListyJednokierunkowejException e) {
            System.out.println("Niepoprawne wywołanie metody pop");
        }
        System.out.println();

        wypisz(listaJednokierunkowa);
    }

    private static void wypisz(ListaJednokierunkowa listaJednokierunkowa) {
        ElementListyJednokierunkowej tmp = listaJednokierunkowa.getHead();

        System.out.println("Od początku");

        if (tmp != null) {
            do {
                System.out.println(tmp);
                tmp = tmp.getNext();
            } while (tmp != null);
        }

        System.out.println();
        System.out.println("Od końca");

        ElementListyJednokierunkowej tail = listaJednokierunkowa.getTail();
        if (tail != null) {
            do {
                System.out.println(tail);
                tail = tail.getPrev();
            } while (tail != null);
        }
    }

}
