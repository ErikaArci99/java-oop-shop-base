package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        // Creazione di un prodotto
        Prodotto prodotto = new Prodotto("Laptop", "Un laptop potente e leggero", 1200.00, 22.0);

        // Stampa delle caratteristiche del prodotto
        System.out.println("Codice: " + prodotto.codice);
        System.out.println("Nome: " + prodotto.nome);
        System.out.println("Descrizione: " + prodotto.descrizione);
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase() + " EUR");
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva() + " EUR");
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
