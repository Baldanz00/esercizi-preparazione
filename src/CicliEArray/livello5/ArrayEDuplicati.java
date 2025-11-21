/*10. Rimuovi duplicati da un array (senza Set)

Restituisci un nuovo array con solo i valori unici.*/
void main() {
    //inizializzo il mio array int[] num = {1,2,3,4,5,5,2,2,1,6}
    //ho bisogno di un nuovo array dove salvare gli elementi senza duplicati.
    //if(num[i] == num [i + 1] -> num[i] += arrayNuovo[i]

    int[] arrayConDuplicati = {1,2,3,1,2,4,1,5,3,6,2,1};
    int[] arrayTemporaneo = new int[arrayConDuplicati.length];
    int contatore = 0; //conto quandi elementi unici ho aggiunto al nuovo array

    for(int i = 0; i < arrayConDuplicati.length; i++){
        int num = arrayConDuplicati[i];

        boolean numeroPresente = false; //devo controllare se il numero è già presente

        for(int j = 0; j < contatore; j++){
            if(arrayTemporaneo[j] == num){
                numeroPresente = true;
                break;
            }
        }

        //se il numero non è presente, lo aggiungo
        if(!numeroPresente){
            arrayTemporaneo[contatore] = num;
            contatore++;
        }
    }
    //nuovo array della lunghezza giusta
    int[] arraySenzaDuplicati = Arrays.copyOf(arrayTemporaneo,contatore);
    System.out.println("Array con duplicati: " + Arrays.toString(arrayConDuplicati));
    System.out.println("Array nuovo senza duplicati: " + Arrays.toString(arraySenzaDuplicati));
}