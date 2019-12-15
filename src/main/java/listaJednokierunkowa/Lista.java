package listaJednokierunkowa;

import fauna.Animal;
import fauna.Lion;

public class Lista {

    private Element head;
    private Element tail;

    public boolean czyPusta() {
        return (head == null);
    }

    public Element wstawNaKoniec(Lion wartosc) {
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
