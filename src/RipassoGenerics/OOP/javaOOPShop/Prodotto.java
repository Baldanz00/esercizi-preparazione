package RipassoGenerics.OOP.javaOOPShop;

import java.lang.classfile.TypeKind;
import java.util.Random;

public class Prodotto {
    //  creare la classe prodotto che gestisce i prodotti dello shop
    //  Un prodotto è caratterizzato da:
    //- nome;
    public String name;
    //- descrizione;
    public String description;
    //- prezzo;
    public double basePrice;
    //- iva;
    public double iva;

    public int code;

    // Usate costruttori, attributi ed eventuali metodi di 'utilità' per fare in modo che:
    //- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random;
    public Prodotto(){
        Random random = new Random();
        this.code = random.nextInt(1000);
    }
    public Prodotto(String name, String description, double basePrice){
        this(); //mi richiama il costruttore senza parametri che mi genera il codice
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    //- il prodotto esponga un metodo per avere il prezzo base;
    public double getBasePrice(){
        return this.basePrice;
    }

    //- il prodotto esponga un metodo per avere il prezzo complessivo di iva;
    public double prezzoConIVA(){
        double iva = 22.0;
        double prezzoConIva = basePrice + (basePrice * (iva/100));
        return prezzoConIva;
    }
    //- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando
    public String infoProdotto(){
        String info = code + "-" + name;
        return info;
    }
   // codice-nome

   // Aggiungere il metodo main dove testare
    public static void main(String[] args){

        Prodotto p1 = new Prodotto("Cuffie", "Cuffie apple airpods duo ", 189.99);
        System.out.println("Il codicd del prodotto è : " + p1.code);
        System.out.println("Il prezzo base del prodotto è: " + p1.getBasePrice());
        System.out.println(String.format("Il prezzo complessivo di iva è: %.2f",  p1.prezzoConIVA()));
        System.out.println("Info del prodotto: \n" + p1.infoProdotto());

    }
}
