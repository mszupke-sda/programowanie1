package fauna;

public class Animal {

    private boolean czyGlodny;
    private String imie;
    private short wiek;

    public void setCzyGlodny(boolean czyGlodny) {
        this.czyGlodny = czyGlodny;
    }

    public boolean isCzyGlodny() {
        return czyGlodny;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public boolean czyNakarmic() {
        return true;
    }
}
