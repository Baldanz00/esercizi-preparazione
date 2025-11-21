/*3. Somma dei primi N numeri

Dato un intero N, stampa la somma 1 + 2 + … + N.
*/
void main() {

    //chiedo all'utente l'intero
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci un numero per contare la somma dei numeri fino al tuo");
    int num = scanner.nextInt();

    //mi serve una variabile che contiene la mia somma
    int somma = 0;

    //logica per il calcolo
    for(int i = 0; i <= num; i++){
        somma = somma + i;
    }
    System.out.println("La somma dei primi numeri è " + somma);
}