package RipassoGenerics.BasiJava.Esercizi0307;

import java.util.Scanner;

public class RettangoloAsterischi {
    void main(){
        //stampa un rettangolo di asterischi
        // Dati due numeri per righe e colonne
        //n = 4 -> 4 righe
        //c = 6 -> 6 colonne

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante righe devono esserci?");
        int righe = scanner.nextInt();
        System.out.println("Quante colonne devono esserci?");
        int colonne = scanner.nextInt();

        for(int i = 0; i < righe; i++){
            for(int j = 0; j < colonne; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}
