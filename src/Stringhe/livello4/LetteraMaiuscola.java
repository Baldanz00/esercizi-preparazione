package Stringhe.livello4;
/*14. Prima lettera maiuscola

Capitalizza ogni parola in una frase.
*/
public class LetteraMaiuscola {

    //in una frase devo rendere maiuscola la prima parola
    // devo dividere la frase con il metodo .split("\\s+")
    //Prendere la prima lettera CharAt(0);
    //renderla maiuscola con Character.toUpperCase
    //prendere il resto della parola substring(1)
    public static String capitalizza(String frase) {
        if (frase == null || frase.isEmpty()) return frase;

        //dividere la frase in parole
        String[] parole = frase.split("\\s+");
        StringBuilder risultato = new StringBuilder();

        for (String parola : parole) {
            if (parola.length() > 0) {
                String nuovaParola = Character.toUpperCase(parola.charAt(0)) + parola.substring(1).toLowerCase();
                risultato.append(nuovaParola).append(" ");
            }
        }
            return risultato.toString().trim();//tolgo lo spazio finale
    }
    void main(){
        String testo = " ciao a tutti benvenuti";
        System.out.println(capitalizza(testo));
    }
}
