package RipassoGenerics.ClassiAstratteEInterfacce.Concrete;

import RipassoGenerics.ClassiAstratteEInterfacce.Astratte.Animale;
import RipassoGenerics.ClassiAstratteEInterfacce.interfacce.Camminante;

public class Vacca extends Animale implements Camminante {
    @Override
    public void faiVerso() {
        System.out.println("Muuuuu");
    }

    @Override
    public void getCibo() {
        System.out.println("Erbivoro");
    }

    @Override
    public void Cammina() {
       System.out.println("Cammina");
    }
}
