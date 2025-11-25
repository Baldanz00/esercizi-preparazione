package RipassoGenerics.BasiJava;

import java.util.Scanner;

public class CompareAge {
    void main(){

        //chiedere all'utente l'età di due persone
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicami l'età di due persone per capire chi è più grande");

        System.out.println("Inserisci l'età della prima persona: ");
        int age1 = scanner.nextInt();

        System.out.println("Inserisci l'età della seconda persona: ");
        int age2 = scanner.nextInt();

        //comunicare quale dei due è più grande

        if(age1 > age2){
            System.out.println("La persona che ha " + age1 + " anni, è più grande della seconda persona che ha " + age2 + " anni");
        } else if (age2 > age1) {
            System.out.println("La persona che ha " + age2 + "anni, è più grande della  persona che ha " + age1 + " anni");
        } else {
            System.out.println("Le due persone hanno la stessa età " + age2 + " anni");
        }
    }
}
