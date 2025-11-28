package RipassoGenerics.OOP.Incapsulamento;

import javax.security.sasl.Sasl;

public class Rettangolo {

   private int base;
   private int altezza;
   //rendendoli privati, non esistono fuori dalla classe, ho quindi bisogno di
   //metodi che mi permettano l'accesso in lettura e scrittura
    //GETTERS : LETTURA -> metodo che mi restituisce il valore
    public int getBase(){ return this.base; }
    public int getAltezza(){ return this.altezza; }

    //SETTERS : SCRITTURA
    public void setBase(int base){ this.base = base; }
    public void setAltezza(int altezza){ this.altezza = altezza; }
    //Così sto rompendo l'incapsulamento... perchè sto permettendo la scrittura
    //dato che ho un costruttore che accetta tutti i parametri, non ha senso il setter
    //Dovrei fare un setter custom, con della logica di controllo che mi permette
    //di avere il controllo dei dati

    Rettangolo(int base, int altezza){
        if(base <= 0){
            System.out.println("Valore errato, imposto un defoult");
            this.base = 10;
        } else { this.base = base; }

        if(altezza <= 0){
            System.out.println("Valore errato, imposto un defoult");
            this.altezza = 20;
        } else { this.altezza = altezza; }
    }

    public int calolaArea(){ return base * altezza; }
    public int perimetro(){ return base*2 + altezza*2; }


    public static void main(String[] args){
        Rettangolo r1 = new Rettangolo(10,20);
        System.out.println(r1.calolaArea());

        //r1.altezza = 0; //ho cambiato lo stato interno della mia classe dall'esterno
        System.out.println(r1.calolaArea());

        //ora con il get posso vedere il valore:
        System.out.println(r1.getAltezza());
    }
}
