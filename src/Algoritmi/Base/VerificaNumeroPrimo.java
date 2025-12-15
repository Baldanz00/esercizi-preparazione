package Algoritmi.Base;

public class VerificaNumeroPrimo {
    void main() {
        /*
        Scrivi un metodo che ritorni true se un numero è primo e
        false se non lo è
         */

        /*
        Un numero è primo quando è maggiore di 1 e divisibile solo per 1 e se stesso
         */
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) { //se trovo un divisore non è primo
                return false;
            }
        }
            return true;
    }
}
