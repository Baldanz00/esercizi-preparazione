package RipassoGenerics.BasiJava;

import java.util.Scanner;

public class Esempio2 {

    void main (){

    Scanner scanner = new Scanner(System.in);
//    System.out.println("Inserisci la tua età");
//    int age = scanner.nextInt();
//        //mi arriva un dato dall'utente, e io voglio valutare questo dato
//        //e stampare una cosa o un altra a seconda che la mia condizione
//        //sia vera o falsa
//
//    if(age >= 18){ //controllo booleano, se la mia condizione == true
//        System.out.println("Sei maggiorenne");
//    } else{ //controllo booleano se la condizione != true
//        System.out.println("Sei minorenne");
//    }

        System.out.println("Scegliere tra: 1, 2 o 3 ");
        int scelta = scanner.nextInt();
    switch (scelta){
        case 1:
            System.out.println("Hai scelto il numero 1");
            break;
        case 2:
            System.out.println("Hai scelto il numero 2");
            break;
        case 3:
            System.out.println("Hai scelto il numero 3");
            break; //senza questo genero un flusso di informazione
        default: //è come avere un else
            System.out.println("Scelta errata");}

    System.out.println("Inserisci un numero tra 0 e 10 per vedere se è pari");
    int numero = scanner.nextInt();

    System.out.print("Il numero è ");
    switch (numero){
        case 10:
        case 8:
        case 6:
        case 4:
        case 2:
        case 0:
            System.out.println("pari");
        break;
        case 9:
        case 7:
        case 5:
        case 3:
        case 1:
            System.out.println("dispari");
            break;
        default:
            System.out.println("Fuori range");
    }
    }
}
