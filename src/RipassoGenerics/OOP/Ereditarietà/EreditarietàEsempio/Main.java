import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.film.Film;

void main() {

    Film f1 = new Film();
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