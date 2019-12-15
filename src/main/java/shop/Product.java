package shop;

public abstract class Product {

    private int id;
    private String producent;
    private String nazwa;
    private double cena;
    private int stanMagazynowy;

    public Product(String producent, String nazwa, double cena, int stanMagazynowy) {
        this.producent = producent;
        this.nazwa = nazwa;
        this.cena = cena;
        this.stanMagazynowy = stanMagazynowy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducent() {
        return producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getStanMagazynowy() {
        return stanMagazynowy;
    }

    public void setStanMagazynowy(int stanMagazynowy) {
        this.stanMagazynowy = stanMagazynowy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", producent='" + producent + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", stanMagazynowy=" + stanMagazynowy +
                '}';
    }
}
