package RipassoGenerics.ClassiAstratteEInterfacce;

import RipassoGenerics.ClassiAstratteEInterfacce.Astratte.Animale;
import RipassoGenerics.ClassiAstratteEInterfacce.Concrete.Gatto;
import RipassoGenerics.ClassiAstratteEInterfacce.Concrete.Vacca;
import RipassoGenerics.ClassiAstratteEInterfacce.interfacce.Camminante;

public class UsaAstratte{
void main() {

    //Astratta a1 = new Astratta(); -> non può essere istanziata

    Animale a = new Vacca();
    Animale b = new Gatto();

    a.faiVerso();
    a.getCibo();
    b.faiVerso();
    b.getCibo();

    Camminante c1 = new Gatto();
    c1.Cammina();

    Camminante c2 = new Vacca();
    c2.Cammina();
}
}