package Algoritmi.Base;

import java.util.Scanner;

public class SommaPrimiNNumeri {
    void main(){
        /*
        Leggi un numero N e calcola la somma dei numeri
        da 1 a N
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = scanner.nextInt();

        int somma = 0;
        for(int i = 1; i <= num; i++){
            somma = num + i;
        }
        System.out.println(somma);
    }
}
