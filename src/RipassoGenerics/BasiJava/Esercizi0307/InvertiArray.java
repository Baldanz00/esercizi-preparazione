package RipassoGenerics.BasiJava.Esercizi0307;

public class InvertiArray {
    void main(){
        //Stampa gli elementi di un array in ordine inverso
        //Esempio: int [] num = {1,2,3,4,5}
        //output: 5,4,3,2,1

        int[] numeri = {1,2,3,4,5};
        System.out.println("L'array in ordine è : ");
        for(int i = 0; i < numeri.length; i++){
            System.out.print(numeri[i] + " ");
        }

        System.out.println();

        System.out.println("L'array inverito è: ");
        for(int i = numeri.length - 1; i >= 0; i--){
            System.out.print(numeri[i] + " ");
        }
    }
}
