package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.film;

import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.contenuto.Contenuto;

public class Film extends Contenuto {
    private long durata;
    /*Film, si ritroverà già gli attributi del Contenuto e il suo metodo
    * perchè lo eredita dichiarando di essere sottoclasse con la kw 'extends'*/
}
