package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        // // Creazione di un prodotto
        // Prodotto prodotto = new Prodotto("Laptop", "Un laptop potente e leggero",
        // 1200.00, 22.0);

        // // Stampa delle caratteristiche del prodotto
        // System.out.println("Codice: " + prodotto.codice);
        // System.out.println("Nome: " + prodotto.nome);
        // System.out.println("Descrizione: " + prodotto.descrizione);
        // System.out.println("Prezzo base: " + prodotto.getPrezzoBase() + " EUR");
        // System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva() + " EUR");
        // System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        // }

        // Creazione di un prodotto con costruttore 1
        Prodotto prodotto1 = new Prodotto("Laptop", "Dell", 1200.00, 22.0);
        System.out.println("Prodotto 1: " + prodotto1.getNome() + ", Marca: " + prodotto1.getMarca() + ", Prezzo: "
                + prodotto1.getPrezzo() + ", IVA: " + prodotto1.getIva());

        // Creazione di un prodotto con costruttore 2
        Prodotto prodotto2 = new Prodotto("Smartphone", "Samsung");
        System.out.println("Prodotto 2: " + prodotto2.getNome() + ", Marca: " + prodotto2.getMarca() + ", Prezzo: "
                + prodotto2.getPrezzo() + ", IVA: " + prodotto2.getIva());
    }
}
