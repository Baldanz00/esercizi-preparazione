package RipassoGenerics.BasiJava.Esercizi0307;

import java.util.Scanner;

public class InvertiStringa {
    void main(){
        //chiedi all'utente una stringa e stampala al contrario
        //esempio: ciao -> oaic

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola per leggerla al contrario");
        String word = scanner.next();

        String parolaAlContrario = " ";
        for(int i = word.length() - 1; i >= 0; i--){
            parolaAlContrario += word.charAt(i);
        }
        System.out.println("La parola inserita è : " + word);
        System.out.println("La parola invertita è : " + parolaAlContrario);
    }
}
