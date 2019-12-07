package listaJednokierunkowa;

public class ListaJenokierunkowaProgram {

    public static void main(String[] args) {

        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa();

        listaJednokierunkowa.add(new ElementListyJednokierunkowej(1));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(12));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(13));

        System.out.println("Lista jednokierunkowa posiada " + listaJednokierunkowa.size() + " elementów");

        ElementListyJednokierunkowej tmp = listaJednokierunkowa.getHead();

        if (tmp != null) {
            do {
                System.out.println(tmp);
                tmp = tmp.getNext();
            } while (tmp != null);
        }
    }



}
