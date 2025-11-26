package RipassoGenerics.BasiJava.Esercizi2;

import java.util.Random;
import java.util.Scanner;

public class MaiuscolaETaglia {
    void main(){
        //L'utente inserisce una stringa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa lunga a piacere");
        String frase = scanner.nextLine();

        //Genera un numero casuale compreso tra 1 e la lunghezza della stringa
        Random random = new Random();
        int n = random.nextInt(1, frase.length()) + 1;
        System.out.println("Numero casuale: " + n);

        //converti la stringa in un array di caratteri e prendi i primi n caratteri
        char[] arrayDiCaratteri =frase.substring(0,n).toCharArray();


        //stampa i primi n caratteri mescolati in odine casuale
        for(int i = 0; i < arrayDiCaratteri.length; i++){
            int scambio = random.nextInt(arrayDiCaratteri.length);
            char temporanea = arrayDiCaratteri[i];
            arrayDiCaratteri[i] = arrayDiCaratteri[scambio];
            arrayDiCaratteri[scambio] = temporanea;
        }

        System.out.println("Caratteri mescolati: ");
        System.out.println(new String(arrayDiCaratteri));

    }
}
