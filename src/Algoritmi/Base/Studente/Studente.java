package Algoritmi.Base.Studente;

public class Studente {
/*
Crea una classe Studente con:
- nome
- matricola
- voto
Scrivi un programma che:
- memorizza più studenti in un array
- stampa lo studente con il voto più alto
 */

     String nome;
     String matricola;
     double voto;

    public Studente(String nome, String matricola, double voto){
        this.nome = nome;
        this.matricola = matricola;
        this.voto = voto;
    }


    public static Studente trovaMigliore(Studente[] studenti){
        Studente migliore = studenti[0];

        for(int i = 1; i < studenti.length; i++){
            if(studenti[i].voto > migliore.voto){
                migliore = studenti[i];
            }
        }
        return migliore;
    }
}
