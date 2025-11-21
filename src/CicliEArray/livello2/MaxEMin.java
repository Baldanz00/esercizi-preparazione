/*7. Valore massimo e minimo

Restituisci il max e il min di un array.
*/
void main() {

    //inizializzo il mio array
    int[] num = {1,2,3,4,5};
    int max = num[0];
    int min = num[0];

    //ciclo sull'array
    for(int i = 0; i < num.length; i++){
        if(num[i] > max) {
            max = num[i];
        }
        if(num[i] < min){
            min = num[i];
        }
    }
    System.out.println("Il mio array è composto da: { " + Arrays.toString(num) + " }");
    System.out.println("Il numero maggiore del mio array è: " + max);
    System.out.println("Il numero minore del mio array è : " + min);
}