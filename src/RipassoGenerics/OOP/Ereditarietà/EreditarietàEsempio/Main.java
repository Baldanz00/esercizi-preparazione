import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.film.Film;

void main() {

    Film f1 = new Film();
    f1.setTitolo("Titanic");
    //in film io non ho setTitolo, ma lo sto ereditando da Contenuto,
    //motivo per cui posso richiamarlo da film

}