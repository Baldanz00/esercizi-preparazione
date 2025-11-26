package RipassoGenerics.BasiJava.Esercizi0307;

public class TrovaMinimo {
    void main(){

        //Trova il valore minimo all'interno di un array
        //esempio: int[] a = {1,2,3,4,5};
        //output: 1.

        //inizializzo il mio array
        int[] numeri = {10,2,4,5,7};
        //mi creo una variabile per salvare il valore minimo che trovo
        int valoreMinimoTrovato = numeri[0];

        for(int i = 0; i < numeri.length; i++){
             if(valoreMinimoTrovato > numeri[i]){
                 valoreMinimoTrovato = numeri[i];
                 break;
             }
        }
        System.out.println("Il valore minimo trovato è : " + valoreMinimoTrovato);

    }
}
