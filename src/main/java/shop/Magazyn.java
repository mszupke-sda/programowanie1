package shop;

import java.util.ArrayList;

public class Magazyn {

    private int ostatniIdentyfikator = 1;

    private final ArrayList<Product> produkty;

    public Magazyn() {
        produkty = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setId(ostatniIdentyfikator);

        ostatniIdentyfikator += 1;
        this.produkty.add(product);
    }

    public void addProdukty(ArrayList<Product> produkty) {
        for (Product produkt: produkty) {
            addProduct(produkt);
        }
    }

    public Product znajdz(int identyfikator) {
        for (Product product : produkty) {
            if (product.getId() == identyfikator) {

                if (product.getStanMagazynowy() == 0) {
                    return null;
                }

                return product;
            }
        }

        return null;
    }

    public int getTelefonKomorkowyCount() {

        return getProductCount(TelefonKomorkowy.class);
    }

    public int getTelewizorCount() {

        return getProductCount(Telewizor.class);
    }

    public int getLaptopCount() {

        return getProductCount(Laptop.class);
    }

    public int getProductCount(Class<?> type) {

        int count = 0;
        for (Product product : produkty) {

            if (type.isInstance(product)) {
                count += product.getStanMagazynowy();
            }
        }

        return count;
    }

    public boolean wydaj(Product product, Pracownik pracownik) throws Exception {

        return wydaj(product, 1, pracownik);
    }

    public boolean wydaj(Product product, int ilosc, Pracownik pracownik) throws Exception {

        if (pracownik.getPracownikType() == PracownikType.WLASCICIEL) {
            throw new Exception("Właściciel nie może wydawać");
        }

        if (product == null) {
            return false;
        }

        // potwierdzam, że produkt istnieje
        Product temp = znajdz(product.getId());

        if (temp == null) {
            return false;
        }

        if (product.getStanMagazynowy() >= ilosc) {
            product.setStanMagazynowy(product.getStanMagazynowy() - ilosc);
            return true;
        }

        return false;
    }
}
