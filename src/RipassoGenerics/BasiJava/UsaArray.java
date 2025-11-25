void main() {

    //inizializzo il mio array di stringhe che si chiama iscritti
    //questo array contiene 3 valori
    String[] iscritti = {"Luca", "Marco", "Pierpaolo"};

    //String[] a = new String[3]; -> altro modo di inizializzarlo,
    //ha almeno bisogno di sapere quante celle di memoria occupare

    //o gli diciamo quanti sono o quali sono gli elementi dell'array

    //dato che è statico, se io gli dico che è di 3 elementi, non posso
    //aggiungere o modificarlo.

    //è posizionale: accedo al valore dell'array per posizione
    System.out.println("Iscritti: ");
    System.out.println(iscritti[0]);
    System.out.println(iscritti[1]);
    System.out.println(iscritti[2]);

    //se provo a stampare iscritti:
    System.out.println(iscritti); // output: [Ljava.lang.String;@27716f4
    //dato che è un oggetto, è il valore esadecimale dell'ash dell'oggetto,
    //ossia il riferimento alla cella di memoria. Per stamparlo devo accedere
    //alle singoe posizioni

    //Nell'array possono esserci elementi anche di grandezza diversa, purchè
    //siano dello stesso tipo:
    System.out.println("Lunghezza nomi Iscritti: ");
    System.out.println(iscritti[0].length()); //4
    System.out.println(iscritti[1].length()); //5
    System.out.println(iscritti[2].length()); //9

    System.out.println();
    System.out.println();

    //posso avere un array di interi
    int[] b = new int[3]; //sto dichiarando il mio array di 3 elementi, ma
    //al momento sono vuoti...

    //come si valorizzano gli elementi dell'array?
    b[0] = 1;
    b[1] = 2;
    b[2] = 3;

    System.out.println(b[0]);
    System.out.println(b[1]);
    System.out.println(b[2]);

    //se io provassi ad andare a indice 10, andrei in eccezione:
   // b[10] = 25;
    //ArrayIndexOutOfBoundExceprion -> ho superato il numero massimo di elementi
    //contenuti nel mio array, che sono solo 3

    //potrei modificare la capienza con:
    //b = new int[10]; //così però quando stampo non ho più valori.
    //ho reinizializzato l'array e quindi il puntamento al mio vecchio
    //array l'ho perso

    //se dovessi stampare un array di 1000 elementi ho bisogno di un
    //ESPRESSIONE ITERATIVA: devo ripetere un blocco di codice n volte

    b = new int[1000];
    for(int i = 0;  i <= b.length; i = i + 100){
        System.out.println("Posizione : " + i + " , Valore: " + b[i]); //mi stampo l'intero array
    }

    //Come si fa il for?
    //dichiarazione della variabile di controllo : int i = 0;
    //b.length è la fine del mio controllo, voglio arrivare alla lunghezza del
    //mio array (quante volte devo ripetere questo ciclo?)
    //i++ "passo" -> i = i +1 incremento
    //se io metto i + 100, girerà 10 volte




}