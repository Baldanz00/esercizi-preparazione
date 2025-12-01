package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.film;

import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.contenuto.Contenuto;

public class Film extends Contenuto {
    private long durata;
    /*Film, si ritroverà già gli attributi del Contenuto e il suo metodo
    * perchè lo eredita dichiarando di essere sottoclasse con la kw 'extends'
    *
    * Anche se la supreclasse ha degli attributi privati o protected, anche se
    * Film non dovesse vederli o accedervi, non significa che non ce li abbia.*/

    public void stampaTitolo(){
        System.out.println("Il titolo è : " + getTitolo());
    }
    //metodo per poter avere accesso al titolo

    /*Io sottoclasse ho le informazioni della mia superclasse, anche se alcune non
    * potrò vederle, però ce le ho.*/

    //Dato che anche il get mi rompe l'incapsulamento, questo metodo lo metto nel Contenuto
//    public void stampaAttori(){
//        for(int i = 0; i < getAttori().length; i++){
//            System.out.println("Attore " + this.getAttori()[i]);
//        }
//    }
}
