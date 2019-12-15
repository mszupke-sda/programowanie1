package shop;

public class Pracownik {

    private PracownikType pracownikType;
    private String imie;
    private String nazwisko;

    public Pracownik(PracownikType pracownikType, String imie, String nazwisko) {
        this.pracownikType = pracownikType;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public PracownikType getPracownikType() {
        return pracownikType;
    }
}