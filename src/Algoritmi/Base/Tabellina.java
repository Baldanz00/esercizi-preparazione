package Algoritmi.Base;

import java.util.Scanner;

public class Tabellina {
    void main(){
        /*
        Leggi un numero N e stampa la sua tabellina fino a 10
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per vedere la sua tabellina fino a 10");
        int num = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            int moltiplicazione = num * i;
            System.out.println(num + " x " + i + " = " + moltiplicazione);
        }
    }
}
