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

// Creare la classe Prodotto che gestisce i prodotti dello shop.

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - marca
// - prezzo
// - iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di "utilità" per fare in modo che:
// - esistano almeno due costruttori diversi
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // // caratteristiche
    // public int codice;
    // public String nome;
    // public String descrizione;
    // public double prezzo;
    // public double iva;

    // attributi privati
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    // // costruttore
    // public Prodotto(String nome, String descrizione, double prezzo, double iva) {
    // this.codice = (int) (Math.random() * 10000); // codice random tra 0 e 9999
    // this.nome = nome;
    // this.descrizione = descrizione;
    // this.prezzo = prezzo;
    // this.iva = iva;
    // }

    // COSTRUTTORE 1 - con tutti i parametri
    public Prodotto(String nome, String marca, double prezzo, double iva) {
        this.codice = generaCodiceRandom();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // COSTRUTTORE 2 - solo nome e marca, prezzo e iva default
    public Prodotto(String nome, String marca) {
        this.codice = generaCodiceRandom();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = 0.0;
        this.iva = 22.0;
    }

    // GETTER (solo lettura per codice)
    public int getCodice() {
        return codice;
    }

    // GETTER e SETTER per gli altri campi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // METODO UTILITY: prezzo con IVA
    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }

    // METODO UTILITY: nome esteso
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    // Metodo privato per generare codice random
    private int generaCodiceRandom() {
        Random rand = new Random();
        return rand.nextInt(10000); // da 0 a 9999
    }

    // // metodo per ottenere il prezzo base
    // public double getPrezzoBase() {
    // return this.prezzo;
    // }

    // // metodo per ottenere il prezzo comprensivo di iva
    // public double getPrezzoConIva() {
    // return this.prezzo + (this.prezzo * this.iva / 100);
    // }

    // // metodo per ottenere il nome esteso
    // public String getNomeEsteso() {
    // return this.codice + "-" + this.nome;
    // }

}
