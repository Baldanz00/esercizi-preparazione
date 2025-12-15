package Algoritmi.Base;

import java.util.Scanner;

public class RicercaDiUnElemento {
    void main(){
        /*
        Dato un array e un numero x, verifica se x è presente
        nell'array
         */

        int[] num = {1,34,56,4,23,67,39};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per vedere se è presente nell'array");
        int n = scanner.nextInt();
        boolean isPresent=false;

        for(int i = 0; i < num.length; i++){
            if(n == num[i]) {
                isPresent = true;
            }
        }
        if(isPresent){
            System.out.println("Il numero è presente");
        } else {
            System.out.println("Il numero non è presente");
        }
    }
}
