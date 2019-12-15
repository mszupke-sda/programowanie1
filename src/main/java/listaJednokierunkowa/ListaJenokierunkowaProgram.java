package listaJednokierunkowa;

public class ListaJenokierunkowaProgram {

    public static void main(String[] args) {

        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa();

        listaJednokierunkowa.add(new ElementListyJednokierunkowej(1));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(12));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(13));

        System.out.println("Lista jednokierunkowa posiada " + listaJednokierunkowa.size() + " elementów");

        wypisz(listaJednokierunkowa);

        System.out.println();
        System.out.println(listaJednokierunkowa.pop());
        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        System.out.println(listaJednokierunkowa.pop());
        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        System.out.println(listaJednokierunkowa.pop());
        System.out.println();

        wypisz(listaJednokierunkowa);

        System.out.println();
        System.out.println(listaJednokierunkowa.pop());
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
