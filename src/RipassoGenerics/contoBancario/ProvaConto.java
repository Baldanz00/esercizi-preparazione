package RipassoGenerics.contoBancario;

public class ProvaConto{

    void main() {

        ContoBancario c1 = new ContoRisparmio("IT9582629847", 0,4);
        System.out.println("Il saldo attuale è: " + c1.getSaldo());

        c1.deposita(200);
        c1.preleva(50);
        System.out.println(c1.getSaldo());

    }
}