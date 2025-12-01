package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.serie;

import RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.contenuto.Contenuto;

public class Serie extends Contenuto {
    private int numEpisodi;
    private int episodioCorrente;

    public Serie(int numEpisodi, int episodioCorrente) {
        this.numEpisodi = numEpisodi;
        this.episodioCorrente = episodioCorrente;
    }

    //polimorfismo, riuso del metodo della superclasse con la kw super
    //e fornisco una mia implementazione del metodo
   @Override
    public void riproduci(){
        System.out.println("Riprendiamo dall'episodio " + episodioCorrente);
        super.riproduci(); //mi riferisco alla superclasse
    }
}
