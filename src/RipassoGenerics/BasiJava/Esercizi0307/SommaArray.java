package RipassoGenerics.BasiJava.Esercizi0307;

public class SommaArray {
    void main(){
        //calcola la somma di tutti gli elementi di
        //un array di interi
        //esempio: int [] numeri = {1,2,3,4,5};
        //output: 15
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //55
        int somma = 0;
        for(int i = 0; i < numeri.length; i++){
            somma += numeri[i];
        }
        System.out.println("La somma degli elementi è : " + somma);
    }
}
