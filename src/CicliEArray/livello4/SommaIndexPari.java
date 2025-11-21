/*9. Somma elementi in posizioni pari

Sommare solo gli elementi negli indici pari.*/
void main() {
    //creo il mio array e lo inizializzo
    int[] num = {1,2,3,4,5};
    int sommaPari = 0;


    //voglio salvare in una variabile somma i valori degli elementi su indice paro
    for(int i = 0; i < num.length; i++){
        if(i % 2 == 0){
            sommaPari += num[i];
        }
    }
    System.out.println("Il mio array è: " + Arrays.toString(num));
    System.out.println("La somma degli elementi su indice pari è: " + sommaPari);
}
//1 -2-5