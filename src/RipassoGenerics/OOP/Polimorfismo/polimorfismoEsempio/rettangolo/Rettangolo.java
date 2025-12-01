package RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio.rettangolo;

import RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio.poligono.Poligono;

public class Rettangolo extends Poligono {

    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        super(4);
        this.base = base;
        this.altezza = altezza;
    }

    private int calolaArea(){
        return base * altezza;
    }
    private int calcolaPerimetro(){
        return base*2 + altezza *2;
    }

    @Override
    public int getArea(){
        return calolaArea();
    }
    @Override
    public int getPerimetro(){
        return calcolaPerimetro();
    }
}
