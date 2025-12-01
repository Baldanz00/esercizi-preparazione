package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio;

import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.film.Film;
public class UsaEreditarietà {
    void main() {

        Film f1 = new Film();
        //COSA SUCCEDE QUI?
        /*Viene allocata una nuova parte di memoria di Film,
         * Richiama il costruttore, che dato che la classe Film non ce l'ha suo ma eredita quello di Contenuto,
         * richiama prima quello della superclasse
         * Restituisce un riferimento all'oggetto
         *
         * Per prima cosa crea il padre (costruttore di Contenuto) e poi crea il figlio (costruttore di defoult di Film)
         * */

        f1.setTitolo("Titanic");
        //in film io non ho setTitolo, ma lo sto ereditando da Contenuto,
        //motivo per cui posso richiamarlo da film

        //Contenuto c1 = new Contenuto();
        //c1.attori = ...;
        //c1.titolo = "Pippo";

        f1.stampaTitolo();
        f1.stampaAttori();
        f1.aggiungiAttore("Leonardo di Caprio");
        f1.aggiungiAttore("Kate Winslet");
        f1.aggiungiAttore("Billy Zane");
        f1.aggiungiAttore("Kathy Bates");
        f1.aggiungiAttore("Bill Paxton");

        f1.getAttori()[0] = "IO"; //ho rotto l'incapsulamento, perchè in casi non
        //primitivi mi restituisce l'intera struttura, non solo il dato.
    }
}