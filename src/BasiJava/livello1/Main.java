/*1. Stampa e variabili

Scrivi un programma che:
	•	legge da input nome, cognome e età
	•	stampa una frase del tipo:
“Mi chiamo Mario Rossi e ho 25 anni.”*/

void main() {

    //chiedo i dati in input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci il tuo nome: ");
    String name = scanner.nextLine();
    System.out.println("Inserisci il tuo cognome: ");
    String surname = scanner.nextLine();
    System.out.println("Inserisci la tua età: ");
    int age = scanner.nextInt();
    System.out.println("Mi chiamo " + name + " "+  surname + " e ho " + age + " anni.");
}
