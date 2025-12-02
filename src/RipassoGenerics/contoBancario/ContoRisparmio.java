package RipassoGenerics.contoBancario;

public class ContoRisparmio extends ContoBancario{

    private int interesse;

    public ContoRisparmio(String numeriConto, double saldo, int interesse) {
        super(numeriConto, saldo);
        this.interesse = interesse;
    }

    public void applicaInteressi(){
        deposita(getSaldo() * interesse);
    }
}
