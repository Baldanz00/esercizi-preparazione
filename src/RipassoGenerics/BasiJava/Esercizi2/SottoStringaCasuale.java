package RipassoGenerics.BasiJava.Esercizi2;

import java.util.Random;
import java.util.Scanner;

public class SottoStringaCasuale {
    void main(){
        //chiedi all'utente una stringa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa lunga a piacere");
        String frase = scanner.nextLine();

        //genera un numero casuale tra 0 e la lunghezza della stringa
        Random random = new Random();
        int numeroCasuale = random.nextInt(frase.length());

        //stampa i caratteri compresi tra 0 e quel numero
        System.out.println("Il numero random uscito è: " + numeroCasuale);
        for(int i = 0; i <= numeroCasuale; i++){
            System.out.print(frase.charAt(i));
        }
    }
}
