/*6. Inverti un array

Dato un array di interi, inverti l’ordine senza usare librerie.
*/
void main() {
    //inizializziamo il mio array
    int[] num = {1,23,15,2,5};
        Arrays.sort(num);
        System.out.println("Array in ordine crescente : " + Arrays.toString(num));

        //per leggere al contrario salvo i nuovi numeri in ordine inverso in un nuovo array
    int[] numInvertiti = new int[num.length];
    for(int i = 0; i< num.length; i++){
    numInvertiti[num.length - 1 -i] = num[i]; //assegno l'elemento dell'array al suo indice opposto
    }
    //cicliamo il nuovo array
    System.out.println("L'array inverito è: ");
    for(int numero : numInvertiti){
        System.out.print(numero + " ");
    }
}