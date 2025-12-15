package Algoritmi.Base.Rettangolo;

public class Rettangolo {

    /*
    Crea una classe rettangolo con:
    - attributi base e altezza
    - metodo area()
    - metodo perimetro()
     */

    int base;
    int altezza;

    public Rettangolo(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }

    public int getArea(){
        return base * altezza;
    }

    public int getPerimemtro(){
        return base * 2 + altezza * 2;
    }

}