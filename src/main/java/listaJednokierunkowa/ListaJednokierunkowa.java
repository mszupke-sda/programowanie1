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

            if (trybPracyListyJednokierunkowej == TrybPracyListyJednokierunkowej.FIFO) {
                tail.setNext(elementListyJednokierunkowej);
                elementListyJednokierunkowej.setPrev(tail);
                tail = elementListyJednokierunkowej;
            }

            if (trybPracyListyJednokierunkowej == TrybPracyListyJednokierunkowej.LISTA_UPORZADKOWANA) {

                if (head.getWeight() > elementListyJednokierunkowej.getWeight()) {

                    head.setPrev(elementListyJednokierunkowej);
                    elementListyJednokierunkowej.setNext(head);
                    head = elementListyJednokierunkowej;

                } else if (tail.getWeight() < elementListyJednokierunkowej.getWeight()) {

                    elementListyJednokierunkowej.setPrev(tail);
                    tail.setNext(elementListyJednokierunkowej);
                    tail = elementListyJednokierunkowej;

                } else {

                    ElementListyJednokierunkowej element = head;
                    while (element.getNext() != null && element.getNext().getWeight() < elementListyJednokierunkowej.getWeight()) {
                        element = element.getNext();
                    }

                    ElementListyJednokierunkowej next = element.getNext();
                    if (next != null) {
                        next.setPrev(elementListyJednokierunkowej);
                        elementListyJednokierunkowej.setNext(next);
                    }

                    element.setNext(elementListyJednokierunkowej);
                    elementListyJednokierunkowej.setPrev(element);

                }
            }
        }

        index++;
    }

    public ElementListyJednokierunkowej pop() throws TrybPracyListyJednokierunkowejException {

        if (trybPracyListyJednokierunkowej == TrybPracyListyJednokierunkowej.LISTA_UPORZADKOWANA) {
            throw new TrybPracyListyJednokierunkowejException();
        }

        ElementListyJednokierunkowej result = head;
        if (head != null) {

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                ElementListyJednokierunkowej next = head.getNext();
                head = next;

                if (next != null) {
                    next.setPrev(null);
                }
            }

            index--;
        }

        return result;
    }

    public ElementListyJednokierunkowej pop(int weight) throws TrybPracyListyJednokierunkowejException {

        if (trybPracyListyJednokierunkowej == TrybPracyListyJednokierunkowej.FIFO) {
            throw new TrybPracyListyJednokierunkowejException();
        }

        ElementListyJednokierunkowej tmp = head;
        while (tmp != null && tmp.getWeight() != weight) {
            tmp = tmp.getNext();
        }

        if (tmp == null) {

            return null;

        } else if (tmp == head) {

            if (head == tail) {

                head = null;
                tail = null;

            } else {

                head = head.getNext();
                head.setPrev(null);
                tmp.setNext(null);

            }

        } else if (tmp == tail) {

            tail = tail.getPrev();
            tail.setNext(null);
            tmp.setPrev(null);

        } else {

            ElementListyJednokierunkowej prev = tmp.getPrev();
            ElementListyJednokierunkowej next = tmp.getNext();

            prev.setNext(next);
            next.setPrev(prev);

            tmp.setNext(null);
            tmp.setPrev(null);

        }

        index--;
        return tmp;
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
