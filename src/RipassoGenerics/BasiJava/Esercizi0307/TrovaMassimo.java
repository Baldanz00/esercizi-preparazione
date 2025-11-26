package RipassoGenerics.BasiJava.Esercizi0307;

public class TrovaMassimo {
    void main(){
        //Trova il valore massimo all'interno dell'array di interi
        //Esempio: int [] numeri = {1,2,3,4,5}
        //output: 5

        //inizializzare il mio array
        int[] numeri = {1,23,3,45,21};
        //ho bisogno di una variabile per salvare il numero massimo
        int numeroMassimoTrovato = numeri[0];

        //ciclo l'array e..
        for(int i = 0; i < numeri.length; i++){

            //confronto il numero massimo che ho con quello attuale
            if(numeroMassimoTrovato < numeri[i]){

            //se è minore, inserisco il nuovo numero nella variabile
                numeroMassimoTrovato = numeri[i];

            }
        }
        System.out.println("Il valore massimo trovato è: " + numeroMassimoTrovato);
    }
}
