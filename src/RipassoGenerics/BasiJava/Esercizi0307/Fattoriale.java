package RipassoGenerics.BasiJava.Esercizi0307;

import java.util.Scanner;

public class Fattoriale {
    void main(){
        //chiedere all'utente un numero n e calcola il suo fattoriale
        //esempio n = 5
        //output 5x4x3x2x1 = 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero positivo per poterne calcolare il fattoriale");
        int numero = scanner.nextInt();

        //il numero scelto deve essere > 0 altrimenti non possiamo calcolarne il fattoriale
        if(numero < 0){
            System.err.println("Il numero deve essere maggiore di 0");
        } else{
            long fattoriale = 1;
            for(int i = 1; i <= numero; i++){
                fattoriale *=  i;
            }
            System.out.println("Il fattoriale del numero " + numero + " è : " + fattoriale);
        }
    }
}
