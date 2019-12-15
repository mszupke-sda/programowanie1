package shop;

import java.util.ArrayList;

public class ShopProgram {

    // produkty - typ, nazwa, ilość na magazynie, cena (telefon komórkowy, telewizor, laptop)
    // magazyn - dodawanie produktu do magazynu i zdejmowanie
    // pracownik - dane osobowe (imię, nazwisko, stanowisko - menadżer, właściciel, sprzedawca)
    //

    public static void main(String[] args) {

        Magazyn magazyn = new Magazyn();

        ArrayList<Product> produkty = new ArrayList<Product>();
        produkty.add(new TelefonKomorkowy("Samsung", "Galaxy S10", 3000.00, 20));
        produkty.add(new TelefonKomorkowy("Apple", "iPhone 11 Pro", 6000.00, 10));
        produkty.add(new TelefonKomorkowy("Qiaomi", "Note 8 Pro", 1100.00, 50));

        produkty.add(new Telewizor("Sony", "Bravia XXX", "43", 5000.00, 20));
        produkty.add(new Telewizor("Samsung", "QLED", "82", 21000.00, 20));

        produkty.add(new Laptop("Lenovo", "Y700", 4000.00, 20));
        produkty.add(new Laptop("Dell", "XPS 13", 4000.00, 20));

        magazyn.addProdukty(produkty);

        System.out.println("Na magazynie jest " + magazyn.getTelefonKomorkowyCount() + " telefonów komórkowych");
        System.out.println("Na magazynie jest " + magazyn.getTelewizorCount() + " telewizorów");
        System.out.println("Na magazynie jest " + magazyn.getLaptopCount() + " laptopów");

        Pracownik wlasciciel = new Pracownik(PracownikType.WLASCICIEL, "Joanna", "Kowalska");
        Pracownik menadzer = new Pracownik(PracownikType.MENADZER, "Adrian", "Nowak");
        Pracownik sprzedawca = new Pracownik(PracownikType.SPRZEDAWCA, "Franciszek", "Staropolski");

        int szukanyIdentyfikator = 4;
        Product szukanyProdukt = magazyn.znajdz(szukanyIdentyfikator);

        System.out.println(szukanyProdukt);

        try {
            if (magazyn.wydaj(szukanyProdukt, wlasciciel)) {
                System.out.println("Na magazynie jest " + magazyn.getTelefonKomorkowyCount() + " telefonów komórkowych");
                System.out.println("Na magazynie jest " + magazyn.getTelewizorCount() + " telewizorów");
                System.out.println("Na magazynie jest " + magazyn.getLaptopCount() + " laptopów");
            } else {
                System.out.println("Nie ma odpowiedniej ilości produktu");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            if (magazyn.wydaj(szukanyProdukt, menadzer)) {
                System.out.println("Na magazynie jest " + magazyn.getTelefonKomorkowyCount() + " telefonów komórkowych");
                System.out.println("Na magazynie jest " + magazyn.getTelewizorCount() + " telewizorów");
                System.out.println("Na magazynie jest " + magazyn.getLaptopCount() + " laptopów");
            } else {
                System.out.println("Nie ma odpowiedniej ilości produktu");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            if (magazyn.wydaj(szukanyProdukt, sprzedawca)) {
                System.out.println("Na magazynie jest " + magazyn.getTelefonKomorkowyCount() + " telefonów komórkowych");
                System.out.println("Na magazynie jest " + magazyn.getTelewizorCount() + " telewizorów");
                System.out.println("Na magazynie jest " + magazyn.getLaptopCount() + " laptopów");
            } else {
                System.out.println("Nie ma odpowiedniej ilości produktu");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
