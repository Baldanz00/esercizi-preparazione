package RipassoGenerics.BasiJava.Esercizi0307;

import java.util.Scanner;

public class Tabellina {
    void main(){
        //chiedere all'utente di quale numero vuole vedere la tabellina
        //stampare la trabellina
        Scanner scanner = new Scanner(System.in);
        System.out.println("Di quale numero vuoi sapere la tabellina?");
        int numero = scanner.nextInt();

        //chiedere fino a che numero vuole moltiplicare
        System.out.println("Quante volte devo moltiplicare? ");
        int numeroDiMoltiplicazioni = scanner.nextInt();

        System.out.println("Tabellina del " + numero);
        // num x indice( 0 - a numeroDelleMoltiplicazioni) = num * indice
        for(int i = 1; i <= numeroDiMoltiplicazioni; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i) + " ;");
        }

    }
}
