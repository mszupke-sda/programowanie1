package listaJednokierunkowa;

import fauna.Animal;

public class Element<T> {

    private T wartosc;
    private Element nastepny;

    public Element(T wartosc) {
        this.wartosc = wartosc;
        this.nastepny = null;
    }

    public T getWartosc() {
        return wartosc;
    }

    public Element getNastepny() {
        return nastepny;
    }

    public void setNastepny(Element nastepny) {
        this.nastepny = nastepny;
    }

    public void wypiszKolejne(String s) {
        Element element = this;

        System.out.printf("Kolejne elementy: %s", s);

        while (element != null) {
            System.out.printf(" %d", element.wartosc);
            element = element.getNastepny();
        }

        System.out.println();
    }
}
