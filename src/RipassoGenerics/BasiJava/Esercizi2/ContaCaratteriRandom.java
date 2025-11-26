package RipassoGenerics.BasiJava.Esercizi2;

import java.util.Random;
import java.util.Scanner;

public class ContaCaratteriRandom {
    void main(){

        //L'utente inserisce una frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase lunga a piacere");
        String frase = scanner.nextLine();

        //Genera un numero casuale tra 1 e la lunghezza della frase
        Random random = new Random();
        int n = random.nextInt(1,frase.length());

        //Considera solo i primi n caratteri
        int vocali = 0;
        for(int i = 0; i < n; i++){
            char c = frase.charAt(i);
//            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'
//            || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U'){
             if("aeiouAEIOU".indexOf(c) != -1){
               vocali++;
             }
        }
            System.out.println("Nei primi " + n + " caratteri ci sono " + vocali + " vocali");
        //conta quante vocali ci sono


    }
}
