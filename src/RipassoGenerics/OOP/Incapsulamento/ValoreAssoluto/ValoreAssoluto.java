package RipassoGenerics.OOP.Incapsulamento.ValoreAssoluto;

public class ValoreAssoluto {
    //Dato un valore, ti restituisco il valore positivo
    private double valore;

    public ValoreAssoluto(double valore){
        if (valore <= 0){
          valore *= -1;
        }
        this.valore = valore;
    }

    public double getValore(){ return this.valore; }

    public static void main(String[] args){
        ValoreAssoluto v1 = new ValoreAssoluto(-10);
        ValoreAssoluto v2 = new ValoreAssoluto(0);
        ValoreAssoluto v3 = new ValoreAssoluto(5);

        System.out.println(String.format("v1 : %f, v2: %f, v3: %f", v1.getValore(), v2.getValore(), v3.getValore()));
    }
}
