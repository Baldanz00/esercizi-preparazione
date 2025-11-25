package RipassoGenerics.BasiJava;

public class UsaWhile {
    static void main(){

        //il while è un altro costrutto iterativo diverso dal for
        //vuole solo una condizione booleana, ma lo devi fermare tu.

        //dobbiamo contare fino a 100
        int i = 0; //parto da 0
        while( i < 100){ //finchè i < 100 va avanti
            System.out.println(i);
            i++; //ha bisogno di questo per andare avanti, altrimenti
            //i vale sempre 0 e va all'infinito
        }

        System.out.println();
        //do-while -> esegue subito ciò che è nel do, e poi controlla il while

        int a = 0;
        do {
            a++; //senza questo a vale sempre 0
            System.out.println("Siamo nel do-while");
            System.out.println(a);

        } while (a < 100);

        //il do-while esegue anche 100 perchè prima esegue e poi controlla

    }
}
