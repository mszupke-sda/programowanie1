package shop;

public class Telewizor extends Product {

    private String liczbaCali;

    public Telewizor(String producent, String nazwa, String liczbaCali, double cena, int stanMagazynowy) {
        super(producent, nazwa, cena, stanMagazynowy);

        this.liczbaCali = liczbaCali;
    }

    public String getLiczbaCali() {
        return liczbaCali;
    }

    @Override
    public String toString() {
        return super.toString() + " Telewizor{" +
                "liczbaCali='" + liczbaCali + '\'' +
                '}';
    }
}
