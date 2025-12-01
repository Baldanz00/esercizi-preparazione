package RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio;

import RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio.poligono.Poligono;
import RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio.rettangolo.Rettangolo;
import RipassoGenerics.OOP.Polimorfismo.polimorfismoEsempio.triangolo.TriangoloRettangolo;

public class PolimorfismoRun {
public static void main(String[] args) {

    TriangoloRettangolo t1 = new TriangoloRettangolo(3,4,5);
    System.out.println(t1.getArea());//polimorfismo 1 : solo sull'area
    //vale lo stesso per quadrato e rettangolo

    //polimorfismo 2: rettangolo è un poligono
    //istanzio un tipo di classe generica con implementazione specifica
    Poligono p1 = new Rettangolo(10, 20); //rettangolo è un caso particolare di poligono
    //i metodi che io invoco sono quelli di Poligono, ma avranno l'implementazione di Rettangolo
    System.out.println(p1.getArea());

    //polimorfismo 3:

}
}