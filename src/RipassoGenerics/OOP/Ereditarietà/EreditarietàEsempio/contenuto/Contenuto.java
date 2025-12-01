package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.contenuto;

public class Contenuto {
    protected String titolo;
   private String[] attori;

    public Contenuto(){
        this.attori = new String[5];
        this.numeroAttori = 0;
    }

    public String[] getAttori() { return attori; }
    /*avendo un costruttore che accetta massimo 5 attori, utilizzando il setter
    * potrei modificare il numero di attori sovrascrivendo l'array.

     public void setAttori(String[] attori) { this.attori = attori; }
     * L questo setter mi rompe l'incapsulamento....
    *
    * Come faccio quindi a proteggere il mio incapsulamento e dare la possibilità di
    * aggiungere gli attori?
    * Ci vuole un metodo per aggiungere un attore con una variabile contatore*/
    private int numeroAttori;
    public void aggiungiAttore(String attore){
        if(numeroAttori < this.attori.length){
            this.attori[numeroAttori] = attore;
            this.numeroAttori++;
        } else {
            System.out.println("Raggiunto il numero massimo di attore");
        }
    }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    void riproduci(){
        System.out.println("Inizio contenuto");
    }

    public void stampaAttori(){
        for(int i = 0; i < attori.length; i++){
            System.out.println("Attore " + this.attori[i]);
        }
    }
}
