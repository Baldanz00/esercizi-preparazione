package Algoritmi.Base;

import java.util.Scanner;

public class NumeriPari {
    void main(){
        /*
        Scrivi un programma che legga un numero intero e
        stampi se è pari o dispari
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero per sapere se è pari o dispari");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){
            System.out.println("Il numero " + numero + " è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}
