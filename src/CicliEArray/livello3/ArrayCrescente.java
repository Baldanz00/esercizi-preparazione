/*8. Verifica se un array è crescente

Restituisci true se ogni elemento è > del precedente.
*/
void main() {

    //dichiaro il mio array e lo inizializzo
    int[] num = {1,2,3,4,5};
    boolean arrayCrescente = true;

    for(int i = 1; i < num.length; i++){
        if(num[i] <= num[i - 1] ){
            arrayCrescente = false;
            break;
        }
    }
    System.out.println("L'array è crecente? " + arrayCrescente);
}