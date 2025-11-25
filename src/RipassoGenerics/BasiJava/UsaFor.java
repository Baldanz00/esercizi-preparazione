package RipassoGenerics.BasiJava;

public class UsaFor {
    void main(){
        System.out.print("for classico: ");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("for inverso: ");
        //posso fare anche un for inverso:
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("For annidato");
        //posso fare un for in un for
        for(int i = 0; i < 10; i ++) {
            System.out.println(i + "-esima iterazione di i");
            for (int j = 0; j < 10; j++) {
                System.out.println(j + "-esima iterazione di j con i = " + i);
            }
        }
        //la j viene eseguita 10 volte per 10 volte in cui viene eseguita la i

        //posso scegliere anche di usare un indice:
        int indice = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(i + " - esima iterazione di i");
            for(int j = 0; j < 10; j++){
                System.out.println(j + "- esima iterazione di j con i che vale: " + i);
                indice++; //colleziona le iterazioni interne = 100
            }
        }
        System.out.println("Ci sono state " + indice + " iterazioni");

        System.out.println();
        System.out.println("Cambiamo il termine a 1000");
        int indice2 = 0;
        for(int i = 0; i < 1000; i++){
            System.out.println(i + " esima iterazione di i");
            for(int j = 0; j < 1000; j++){
                System.out.println(j + " esima iterazione di j I vale:  " + i);
                indice2++;
            }
        }
        System.out.println("Ci sono state " + indice2 + " iterazioni");

        System.out.println();


        //posso anche combinare i for con gli if
    // ora so che ci sono state n iterazioni, di queste, quanti numeri pari ho?
        int indice3 = 0;
        int numeriPari = 0;
        int numeriDispari = 0;

        for(int i = 0; i < 1000; i++){
            //System.out.println(i + " esima iterazione di i");
            for(int j = 0; j < 1000; j++){
                //System.out.println(j + " esima iterazione di j I vale:  " + i);
                if(indice3 % 2 == 0){
                    numeriPari++;
                } else {
                    numeriDispari++;
                }
                indice3++;
            }
        }
        System.out.println("Ci sono state " + indice3 + " iterazioni");

        System.out.println("Ci sono  " + numeriDispari + " numeri dispari");

        System.out.println("Ci sono  " + numeriPari + " numeri pari");





    }
}
