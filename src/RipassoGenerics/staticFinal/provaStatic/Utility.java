package RipassoGenerics.staticFinal.provaStatic;

public class Utility {

    static int conteggio;
    private Utility(){

    }

    /*
    * METODI DI UTILITA'
    */

    public static void incrementa(){
        conteggio++;
    }
    //essendo che il metodo è static, gli attributi che userò per questo
    //metodo devono essere static, per avere la stessa priorità.

    public static void leggiConteggio(){
        System.out.println(conteggio);
    }
}
