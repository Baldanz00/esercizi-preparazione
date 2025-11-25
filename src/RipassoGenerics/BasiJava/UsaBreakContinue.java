package RipassoGenerics.BasiJava;

public class UsaBreakContinue {
    void main(){

        //break e continue sono due condizioni di
        //fermo del ciclo...

        for(int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                continue; //ricomincia dall'inizio
                //se i è divisibile per 10, non esegue il codice
                //che c'è dopo.
            }
            if (i % 2 == 0) {
                System.out.println("Numero paro");
            } else if (i % 3 == 0) {
                System.out.println("Divisibile per 3");
            } else if (i % 5 == 0) {
                System.out.println("Divisibile per 5");
            } else if (i % 7 == 0) {
                System.out.println("Divisibile per 7");
            } else if (i > 800) {
                System.out.println("Fine del ciclo con i che vale " + i);
                break; //rompo/termino il ciclo
            }
            //se ho due cicli innestati e metto un break in quello interno
            //il ciclo esterno continua ad andare
        }

        System.out.println();
        System.out.println("For innestato");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j == 5){
                    continue;
                } else if (j == 7) {
                    break;
                }else {
                    System.out.println("J vale " + j + " con i che vale " + i);
                }
            }
        }


    }
}
