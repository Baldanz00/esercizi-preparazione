package RipassoGenerics.BasiJava;

import java.util.Scanner;

public class LinearSearch {
    void main(){

        //Creare un array di numeri casuali
        int[] numeri = {2,3456,7,21,1,34,5678,32,986,5,10,342,6,678,985};

        //Chiedere all'utente di inserire un numero da terminale
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per verificare che sia presente nell'array di numeri");
        int num = scanner.nextInt();

        //verificare se è presente nell'array oppure no

        for(int i = 0; i <= numeri.length; i++){
            if (num != numeri[i]) {
                continue;
            } else {
                System.out.println("Il numero " + num + " è presente a posizione " + i);
            }
        }
    }
}
