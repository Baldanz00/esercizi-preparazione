/*5. Conta le vocali

Data una stringa, conta quante vocali contiene.
*/
void main() {

    //chiedo la stringa all'utente
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci una parola per contarne le vocali: ");
    String parola = scanner.nextLine();

    int contaVocali = 0;
    for(int i = 0; i < parola.length(); i++){
        char lettera = parola.charAt(i); //estraggo il carattere a posizione i

        if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u' ||
        lettera == 'A' || lettera == 'E' || lettera == 'I' || lettera == 'O' || lettera == 'U'){
            contaVocali++;
        }
    }
    System.out.println("Il numero di vocali nella stringa è: " + contaVocali);
}