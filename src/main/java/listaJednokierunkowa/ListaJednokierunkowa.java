package listaJednokierunkowa;

public class ListaJednokierunkowa {

    private ElementListyJednokierunkowej head;
    private ElementListyJednokierunkowej tail;
    private final TrybPracyListyJednokierunkowej trybPracyListyJednokierunkowej;

    public ListaJednokierunkowa(TrybPracyListyJednokierunkowej trybPracyListyJednokierunkowej) {
        this.trybPracyListyJednokierunkowej = trybPracyListyJednokierunkowej;
    }

    private int index = 0;

    public void add(ElementListyJednokierunkowej elementListyJednokierunkowej) {

        // jeśli trybPracyListyJednokierunkowej == FIFO to dodajemy na koniec kolejki
        // jeśli trybPracyListyJednokierunkowej == LISTA_UPORZADKOWANA to dodajemy
        // w odpowiednie miejsce ze względu na wagę

        if (head == null) {
            // lista jest pusta
            head = elementListyJednokierunkowej;
            tail = elementListyJednokierunkowej;
        } else {
            // lista jest niepusta
            tail.setNext(elementListyJednokierunkowej);
            elementListyJednokierunkowej.setPrev(tail);
            tail = elementListyJednokierunkowej;
        }

        index++;
    }

    public ElementListyJednokierunkowej pop() {

        ElementListyJednokierunkowej result = head;
        if (head != null) {

            ElementListyJednokierunkowej next = head.getNext();
            head = next;

            if (next != null) {
                next.setPrev(null);
            } else {
                tail = null;
            }

            index--;
        }

        return result;
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
