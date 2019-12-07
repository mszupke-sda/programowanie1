package listaJednokierunkowa;

public class Element {

    private int wartosc;
    private Element nastepny;

    public Element(int wartosc) {
        this.wartosc = wartosc;
        this.nastepny = null;
    }

    public int getWartosc() {
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
