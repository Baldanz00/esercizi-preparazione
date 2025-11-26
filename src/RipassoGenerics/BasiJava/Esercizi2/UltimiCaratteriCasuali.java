package RipassoGenerics.BasiJava.Esercizi2;

import java.util.Random;
import java.util.Scanner;

public class UltimiCaratteriCasuali {
    void main(){
        //L'utente inserisce una stringa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa lunga a piacere");
        String frase = scanner.nextLine();

        //genera un numero random tra 1 e la lunghezza della stringa
        Random random = new Random();
        int numeroCasuale = random.nextInt(1, frase.length());

        System.out.println("Il numero casuale è: " + numeroCasuale);
        //stampa gli ultimi n caratteri della stringa
        for(int i = numeroCasuale; i < frase.length(); i++){
            System.out.print(frase.charAt(i));
        }
    }
}
