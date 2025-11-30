package RipassoGenerics.OOP.JavaSnacks.Snack4Quiz;

import java.util.Scanner;

public class DomandaQuiz {
    /* Crea una classe che rappresenta la domanda di un quiz a risposta aperta.
    La classe dovra:
    - salvare il testo della domanda e la risposta corretta
    - fornire un metodo per verificare se una risposta è corretta
    - aggiungere un metodo che stampa il risultato
    * */

    public String domanda;
    private String risposta;

    public DomandaQuiz(String domanda, String risposta) {
        this.domanda = domanda;
        this.risposta = risposta;
    }

    public  String getDomanda() { return domanda; }
    public String getRisposta() { return risposta; }

    public boolean verificaRisposta(String rispostaUtente){
        return rispostaUtente.equalsIgnoreCase(risposta);
    }
    public void stampaRisultato(String rispostaUtente){
        System.out.println("Alla domanda : " + getDomanda() + " è stata data la risposta " + rispostaUtente);
    }

   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DomandaQuiz d1 = new DomandaQuiz("Qual è la capitale d'Italia?","Roma");
        System.out.println("Inserisci una risposta alla domanda:\n" + getDomanda());
        String rispostaUtente = scanner.nextLine();
        d1.verificaRisposta(rispostaUtente);
        d1.stampaRisultato(rispostaUtente);
    }
}
