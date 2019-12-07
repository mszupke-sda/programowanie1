package listaJednokierunkowa;

public class Lista {

    private Element head;
    private Element tail;

    public boolean czyPusta() {
        return (head == null);
    }

    public Element wstawNaKoniec(int wartosc) {
        Element element = new Element(wartosc);

        if (this.czyPusta()) {
            head = element;
            tail = element;
        } else {
            tail.setNastepny(element);
            element.setNastepny(null);
            tail = element;
        }

        return element;
    }
}
