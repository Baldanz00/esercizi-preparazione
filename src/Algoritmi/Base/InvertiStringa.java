package Algoritmi.Base;

import java.util.Scanner;

public class InvertiStringa {
    void main(){
        /*
        Leggi una stringa e stampala al contrario
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String s = scanner.nextLine();

        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
