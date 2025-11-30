package RipassoGenerics.OOP.JavaSnacks.Snack2GestioneDiUnConto;

public class ContoBancario {
    /*Crea una classe contoBancario con attributi per
    - numero di conto
    - saldo
    Implementa un costruttore che accetta un parametro
    e inizializza il saldo a 0.
    Aggiungi metodi publici per:
    - depositare denaro sul conto
    - prelevare denaro dal conto
    - ottenere il saldo
    * */
    private String iban;
    private double saldo;

    public String getIban(){ return iban; }
    public double getSaldo(){ return saldo; }

    public ContoBancario(String iban){
        saldo = 0;
        this.iban = iban;
    }

    public void deposito(double importo){
        if(importo <= 0){
            System.out.println("Non è possibile depositare un importo inferiore o uguale a 0. \n Il saldo attuale è: ");
            System.out.println(getSaldo());
        } else {
            this.saldo += importo;
        }
    }

    public void prelevo(double importo){
        if(importo > saldo && importo == 0){
            System.out.println("Importo non erogabile.");
        } else {
            System.out.println("Prelevo effettuato di " + importo + " €.");
            this.saldo = saldo - importo;
        }
    }

    public void saldoCorrente(){
        System.out.println("Il saldo attuale è: " + getSaldo());
    }

    public static void main(String[] args){

        ContoBancario c1 = new ContoBancario("IT463784298275987");
        c1.deposito(200);
        c1.saldoCorrente();
        c1.prelevo(100);
        c1.saldoCorrente();
    }
}
