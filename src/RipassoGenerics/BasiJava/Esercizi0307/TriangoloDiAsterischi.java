package RipassoGenerics.BasiJava.Esercizi0307;

public class TriangoloDiAsterischi {
    void main(){
        /* Dato un numero n stampare un albero di asterischi crescente:
        Esempio: n = 5
        Output:
        *
        **
        ***
        ****
        *****
        */

        int n = 5;
        //devo ciclare il mio numero:
        //ciclo prima le righe e devono essere 5
        //spazi
        stampaTriangolo(n);
    }
    public void stampaTriangolo(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n - 1; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
