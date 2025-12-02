package RipassoGenerics.ClassiAstratteEInterfacce.Astratte;

public abstract class Animale {

    public void faiQualcosa(){
        //metodo concreto, il suo corpo sono le {} sia con implementazione che senza
        System.out.println("Qualcosa");
    }
    /*
    Un metodo astratto non ha corpo
     */
    public abstract void faiVerso();

    /*
    Se una classe astratta ha dei metodi asratti non può essere istanziata...

    Perchè dovrei avere una classe che non può essere istanziata?
        Non conosco quante istanze creerò, ne tantomeno che verso fanno....
     */
}
