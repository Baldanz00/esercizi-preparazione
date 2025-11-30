package RipassoGenerics.OOP.JavaSnacks.Snack3RegistroStudenti;

import RipassoGenerics.OOP.JavaSnacks.Snack1Studente.Studente;

public class Registro {
    /*Crea una classe registro che rappresenti un registro di
    studenti.
    Utilizza un Array privato per memorizzare oggetti studente,
    Implementa un costruttore senza parametri per inizializzare
    il registro vuoto.
    Aggiungi un metodo pubblico per aggiungere studenti al registro.
    Aggiungi poi un metodo che stampi la lista di studenti
    * */
    private Studente[] registro ;
    private int numStudente; // -> questa variabile mi serve da contatore
    //perchè non so a che posizione devo aggiungere uno studente all'array o che posizione
    //è stata riempita

    public Registro(){
        registro = new Studente[3];
        numStudente = 0;
    }
    public void aggiungiStudente(Studente studente){
        if(numStudente < registro.length){
            registro[numStudente] = studente;
            numStudente++;
        }
    }

    public void stampaRegistro(){
        for(int i = 0; i < registro.length; i++){
            if(registro[i] != null) {
                System.out.println(registro[i].infoStudente());
            } else {
                System.out.println("Impossibile aggiungere a posizione " + numStudente);
            }
        }
    }

    public static void main(String[] args){
        Studente s1 = new Studente("Mario","Rossi", 24);
      //  System.out.println(s1.infoStudente());

        Registro registro1 = new Registro();
        registro1.aggiungiStudente(s1);
        registro1.stampaRegistro();

    }
}
