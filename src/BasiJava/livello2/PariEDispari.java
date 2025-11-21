/*2. Numeri pari/dispari

Scrivi un programma che legge un numero e stampa se è pari o dispari.
*/
void main() {

    //chiedo all'utente di inserire un numero
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci un numero per sapere se è pari o dispari: ");
    int num = scanner.nextInt();
    if(num % 2 == 0 ){
        System.out.println("Il numero " + num + " è pari.");
    } else {
        System.out.println("Il numero " + num + " è dispari.");
    }
}