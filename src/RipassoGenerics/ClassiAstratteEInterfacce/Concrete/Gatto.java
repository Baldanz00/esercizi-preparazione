package RipassoGenerics.ClassiAstratteEInterfacce.Concrete;

import RipassoGenerics.ClassiAstratteEInterfacce.Astratte.Animale;
import RipassoGenerics.ClassiAstratteEInterfacce.interfacce.Camminante;

public class Gatto extends Animale implements Camminante {

    @Override
    public void faiVerso() {
        System.out.println("Miaooo");
    }

    @Override
    public void getCibo() {
        System.out.println("Onnivoro");
    }

    @Override
    public void Cammina() {
        System.out.println("Cammino in modo silenzioso");
    }
}
