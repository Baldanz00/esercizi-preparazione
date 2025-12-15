package Algoritmi.Base;

public class ContaVocali {
    void main(){
        /*
        Scrivi un metodo che conti ul numero di vocali in una stringa
         */
        String s = "ciao io mi chiamo Gioia";
        System.out.println("Il numero delle vocali è " + contaVocali(s));
    }
    public static int contaVocali(String s){
        int numeroVocali = 0;
        String vocali = "aeiouAEIOU";

        for(int i =0; i < s.length(); i++){
            if(vocali.contains(String.valueOf(s.charAt(i)))){
                //char c = s.charAt(i);
                // c== 'a' || c == 'e'.....
                numeroVocali++;
            }
        }
        return numeroVocali;
    }
}
