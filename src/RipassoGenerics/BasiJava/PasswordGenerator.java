package RipassoGenerics.BasiJava;

import java.util.Scanner;

public class PasswordGenerator {
    void main(){


        //Aggiungete una classe PasswordGenerator che contiene un metodo main.
        //Il programma deve fare quanto segue:
        //- chiedere all'utente e salvare in opportune variabili
        //- nome
        //- cognome
        // - colore preferito
        // - data di nascita di un utente
        // suddivisa in giorno, mese , anno in numero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i dati che ti verranno richiesti per generare la tua password.");

        System.out.println("Inserisci il tuo nome: ");
        String name = scanner.next();

        System.out.println("Inserisci il tuo cognome: ");
        String surname = scanner.next();

        System.out.println("Inserisci il tuo colore preferito: ");
        String bestColor = scanner.next();

        System.out.println("Inserisci la tua data di nascita suddivisa per gg.mm.AAAA : ");
        System.out.println("Inserisci il giorno di nascita: ");
        int dayOfBirth = scanner.nextInt();
        System.out.println("Inserisci il mese di nascita in numero:  ");
        int mounth = scanner.nextInt();
        System.out.println("Inserisci l'anno : ");
        int year = scanner.nextInt();

        //Generare e stampare a video una password concatenando nome,cognome,colore preferito, //somma di giorno, mese e anno di nascita
        //Esempio Pinco Pallino, Viola, 02.03.2000 -> Pinco-Pallino-Viola-2005 ///
        int somma = dayOfBirth + mounth + year;

        System.out.println("La tua password è: " + name + "-" + surname + "-" + bestColor + "-" + somma);





    }
}
