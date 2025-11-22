package Stringhe.livello1;

/*11. Palindroma
Controlla se una stringa è palindroma.*/

public class Palindroma {
    void main() {
        //una stringa è palindroma se leggendola da destra a sinistra o da sinistra a destra non cambia
        //ho bisogno quindi di due variabili left e right che mi leggono la stringa
        //dovro ciclare la stringa finche lef < right e left++ right--

        String parola = "MadaM";
        //controllo de la mia parola è palindroma
        if (isPalindrome(parola)) {
            System.out.println("La parola " + parola + " è palindroma.");
        } else {
            System.out.println("La parola " + parola + " non è palindroma.");
        }
    }
        //metodo booleano per verificare se la stringa è palindroma
        public static boolean isPalindrome (String parola){
            parola = parola.toLowerCase(); //mi serve per confrontare tutti i caratteri in minuscolo
            int left = 0;
            int right = parola.length() - 1;

            while (left < right) {
                if (parola.charAt(left) != parola.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
