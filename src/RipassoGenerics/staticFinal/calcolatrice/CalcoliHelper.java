package RipassoGenerics.staticFinal.calcolatrice;

public class CalcoliHelper {
    //somma di due numeri interi
    public static int somma(int a, int b){
        return a + b;
    }
    //somma di due numeri double
    public static double somma(double a, double b){
        return a + b;
    }
    //differenza tra due numeri interi
    public static int differenza(int a, int b){
        return a - b;
    }
    //differenza tra due numeri double
    public static double differenza(double a, double b){
        return a - b;
    }
    //moltiplicazione tra due interi
    public static long moltiplicazione(int a, int b){
        return a * b;
    }
    //moltiplicazione tra due double
    public static double moltiplicazione (double a, double b){
        return a * b;
    }
    //valore assoluto di un intero
    public static int valoreAssoluto(int a){
        if(a < 0){
            return -a;
        }
        return a;
    }
    //valore assoluto di un double
    public static double valoreAssoluto(double a){
        if(a < 0){
            return -a;
        }
        return a;
    }
    //massimo tra due interi
    public static int massimo(int a, int b){
        if(a > b){
            return a;
        } else if(a == b){
            System.out.println("I due numeri sono uguali");
        }
        return b;
    }
    //massimo tra due double
    public static double massimo(double a, double b){
        if(a > b){
            return a;
        } else if ( a == b) {
            System.out.println("I due numeri sono uguali");
        }
        return b;
    }
    //minimo tra due interi

    //minimo tra due double

}
