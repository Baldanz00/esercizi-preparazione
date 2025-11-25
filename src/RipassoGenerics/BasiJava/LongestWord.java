package RipassoGenerics.BasiJava;

import java.util.Scanner;

public class LongestWord {
    void main(){

        //chiediamo all'utente due parole in successione
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci due parole in successione per verificare quale delle due è più lunga");
        System.out.println("Inserisci la prima parola: ");
        String word1 = scanner.next();
        System.out.println("Inserisci la seconda parola: ");
        String word2 = scanner.next();

        //Andiamo poi a verificare quale delle due parole è più lunga
        if(word1.length() == word2.length()){
            System.out.println("Le due parole hanno la stessa lunghezza");
        } else if (word1.length() > word2.length()) {
            System.out.println("La prima parola è più lunga della seconda");
        } else if (word2.length() > word1.length()) {
            System.out.println("La seconda parola è più lunga della prima");
        } else {
            System.out.println("Parola errata");
        }
        //stampiamo in console il messaggio appropriato
    }
}//riprendere da java base 2 -32.37
