package listaJednokierunkowa;

public class ElementListyJednokierunkowej {

    private final int weight;
    private ElementListyJednokierunkowej next;
    private ElementListyJednokierunkowej prev;

    public ElementListyJednokierunkowej(int weight) {
        this.weight = weight;
    }

    public ElementListyJednokierunkowej getNext() {
        return this.next;
    }

    public void setNext(ElementListyJednokierunkowej next) {
        this.next = next;
    }

    public ElementListyJednokierunkowej getPrev() {
        return prev;
    }

    public void setPrev(ElementListyJednokierunkowej prev) {
        this.prev = prev;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ElementListyJednokierunkowej{" +
                "weight=" + weight +
                '}';
    }
}
