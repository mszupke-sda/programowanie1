package listaJednokierunkowa;

public class ListaJednokierunkowa {

    private ElementListyJednokierunkowej head;
    private ElementListyJednokierunkowej tail;

    private int index = 0;

    public void add(ElementListyJednokierunkowej elementListyJednokierunkowej) {

        if (head == null) {
            // lista jest pusta
            head = elementListyJednokierunkowej;
            tail = elementListyJednokierunkowej;
        } else {
            // lista jest niepusta
            tail.setNext(elementListyJednokierunkowej);
            tail = elementListyJednokierunkowej;
        }

        index++;
    }

    public int size() {
        return index;
    }

    public ElementListyJednokierunkowej getHead() {
        return head;
    }

    public ElementListyJednokierunkowej getTail() {
        return tail;
    }
}
