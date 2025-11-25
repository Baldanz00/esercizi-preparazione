//Esercizio JavaBase1
void main() {

    //prendere un input dall'utente una stringa lunga a piacere
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci una parola lunga a piacere: ");
    String word = scanner.nextLine();

    //prendere un input da Random con valore tra 0 e la lunghezza della stringa
    Random random = new Random();
    int max = random.nextInt(word.length());

    System.out.println("Il numero Random uscito è " + max);
    //stampare i primi caratteri della Stringa compresi tra 0 e il numero Random
   System.out.println("I caratteri della stringa compresi tra 0 e il random sono: " + word.substring(0,max));

}