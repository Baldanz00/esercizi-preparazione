package Algoritmi.Base;

public class MediaDiUnArray {
    void main(){
        /*
        Dato un array di numeri interi, calcola e stampa la media
         */

        int[] num = {1,2,3,4,5};
        int media = num[0];
        int somma = num[0];
        for(int i = 0; i < num.length; i++){
            somma += num[i];
        }
        media = somma / num.length;

        System.out.println("La media è: " + media);
    }
}
