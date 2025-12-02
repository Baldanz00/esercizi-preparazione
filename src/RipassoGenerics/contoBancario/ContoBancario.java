package RipassoGenerics.contoBancario;

public class ContoBancario {
    /*
    Consegna:
    Crea una classe ContoBancario con i campi privati saldo e numeroConto.
    Crea metodi pubblici deposita(), preleva(), getSaldo().
    Crea una sottoclasse ContoRisparmio che aggiunge un tasso di interesse.
    Aggiungi un metodo applicaInteressi() che aumenta il saldo.
    Testa tutto nel main e spiega perché serve l’incapsulamento.
     */

    private double saldo;
    private String numeriConto;

    public ContoBancario(String numeriConto, double saldo){
        this.numeriConto = numeriConto;
        this.saldo = 0;
    }
    public double getSaldo() { return saldo; }
    public String getNumeriConto() { return numeriConto; }

    public void deposita(double importo){
        if(importo <= 0){
            System.out.println("Impossibile depositare un importo inferiore a 0.");
        } else {
            saldo += importo;
            System.out.println("L'importo di € " + importo + " è stato depositato.");
        }
    }
    public void preleva(double importo){
        if(importo > saldo || importo <= 0){
            System.out.println("Impossibile prelevare.");
        } else {
            saldo -= importo;
            System.out.println("L'importo di € " + importo + " è stato prelevato.");
        }
    }
}
