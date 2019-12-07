package listaJednokierunkowa;

public class ElementListyJednokierunkowej {

    private final int weight;
    private ElementListyJednokierunkowej next;

    public ElementListyJednokierunkowej(int weight) {
        this.weight = weight;
    }

    public ElementListyJednokierunkowej getNext() {
        return this.next;
    }

    public void setNext(ElementListyJednokierunkowej next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ElementListyJednokierunkowej{" +
                "weight=" + weight +
                '}';
    }
}
