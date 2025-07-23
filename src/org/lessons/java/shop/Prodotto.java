// Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. 

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - il prodotto esponga un metodo per avere il prezzo base 
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

// Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
//ESERCIZIO TEMRINATO

package org.lessons.java.shop;

public class Prodotto {

    // caratteristiche
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    // costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = (int) (Math.random() * 10000); // codice random tra 0 e 9999
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo per ottenere il prezzo base
    public double getPrezzoBase() {
        return this.prezzo;
    }

    // metodo per ottenere il prezzo comprensivo di iva
    public double getPrezzoConIva() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

    // metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
    }

}
