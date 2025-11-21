/*4. Massimo tra tre numeri

Senza usare Math.max, trova il maggiore tra 3 numeri.
*/
void main() {

    //chiedo i numeri all'utente
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci tre numeri per conoscerne il maggiore ");
    System.out.println("Inserisci il primo numero: ");
    int num1 = scanner.nextInt();
    System.out.println("Inserisci il secondo numero: ");
    int num2 = scanner.nextInt();
    System.out.println("Inserisci il terzo numero: ");
    int num3 = scanner.nextInt();

    if(num1 > num2 && num1 > num3){
        System.out.println("Il numero maggiore è : " + num1);
    } else if(num2 > num1 && num2 > num3){
        System.out.println("Il numero maggiore è : " + num2);
    } else{
        System.out.println("Il numero maggiore è: " + num3);
    }
}