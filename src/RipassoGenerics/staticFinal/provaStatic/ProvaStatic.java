package RipassoGenerics.staticFinal.provaStatic;

public class ProvaStatic{
    public static void main(String[] args) {

        Prova p1 = new Prova();
        p1.setDescrizione("DescrizioneProva,");
        p1.setNome("Prova1,");
        //p1.setScopo("ScopoProva1");
        Prova.setScopo("ScopoProva1");

        System.out.println(p1);

        Prova p2 = new Prova();
        p2.setDescrizione("DescriszioneProva2,");
        p2.setNome("Prova2,");
       // p2.setScopo("ScopoProva2");
        //dato che setScopo è un metodo static, non vuole l'istanza che lo richiama
        //ma:
        Prova.setScopo("scopoProva2");

        System.out.println(p2);
        System.out.println(p1);
        /*Lo scopo di p1 è rimasto 'scopoProva2'...
        * Dato che lo scopo è statico, non fa riferimento
        * allo scope dell'oggetto ma della classe.
        * Le altre sono variabili di istanza, con un loro scope
        * ciò significa che cambiando l'istanza , cambia il
        * valore.
        *
        * Dato che scopo è static, fa riferimento all'intera classe,
        * di conseguenza c'è una sola versione di quell'attributo
        * in tutto il programma, che le altre classi condividono.
        *
        * Quando fai un componenti static, questi vengono visti per primi
        * e viene istanziata una cella di memoria diversa.
        * Di conseguenze tutte le istanze che creo dopo l'assegnazione di
        * questo elemento, quelle istanze punteranno all'attributo static
        * di cui c'è una sola copia.
        *
        * */

        /*
        * Utility u = new Utility(); -> non posso farlo perchè il costruttore è
        * privato.
        * Di fatto non voglio che vengano create istanze di quella classe
        * */
        Utility.incrementa();
        Utility.leggiConteggio();
        System.out.println(p2);
        System.out.println(p1);
}
}