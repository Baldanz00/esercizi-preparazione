package Stringhe.livello2;

/*12. Conta occorrenze di una parola

Dato un testo e una parola, conta quante volte compare.
*/
public class OccorrenzeDiUnaParola {

    //text = stringa lunga
    //word = parola che devo verificare
    //non devo contare la punteggiatura adiacente ',' , '.'
    //case-insensitive = Casa o casa è uguale
    //regex \b con bordi di parola
    //.split per pulizia

    //1. Devo convertire la mia word.toLowerCase() -> case-insensitive
    //2. Devo sostituire tutti i caratteri non char con spazi -> rimuovo la punteggiatura
    //3. .split("\\s+") -> per dividere ogni volta che trovo uno o più spazi
    //4. Devo verificare tutte le parole se sono == alla mia word

    public static int contaOccorrenze(String text, String word){
        if(text == null || word == null) return 0;

        //1. case-insensitive
        String text1 = text.toLowerCase();
        String word1 = word.toLowerCase();

        //2.Tutto ciò che non è lettera o numero diventa spazio
        text1 = text1.replaceAll("[^\\p{L}\\p{Nd}]+", " ");

        //3. divido ogni volta che trovo uno o più spazi
        String[] words = text1.split("\\s+");

        //4.
        int count = 0;
        for(String current : words){
            if(current.equals(word1)) {
                count++;
            }
        }
        return count;
    }

    void main(){
        String testo = "La casa è bella, ma la casa non è vicina";
        String parola = "casa";

        int occorrenze = contaOccorrenze(testo, parola);
        System.out.println("Occorrenze per la parola : " + parola + " sono: " + occorrenze );
    }
}
