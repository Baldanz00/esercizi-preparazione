package RipassoGenerics.OOP.Incapsulamento.Automobile;


public class Automobile {

    private String colore;
    private String marca;
    private int annoImmatricolazione;
    private String modello;
    private String alimentazione;
    private String targa;
    private double numeroKmPercorsi;
    private int proprietariPrecedenti;
    private int numeroPosti;
    private int numeroPorte;
    private double cilindrata;

    public String getColore() { return colore; }
    public String getMarca() { return marca; }
    public int getAnnoImmatricolazione() { return annoImmatricolazione; }
    public String getModello() { return modello; }
    public String getAlimentazione() { return alimentazione; }
    public String getTarga() { return targa; }
    public double getNumeroKmPercorsi() { return numeroKmPercorsi; }
    public int getProprietariPrecedenti() { return proprietariPrecedenti; }
    public int getNumeroPosti() { return numeroPosti; }
    public int getNumeroPorte() { return numeroPorte; }
    public double getCilindrata() { return cilindrata; }

    public void setCilindrata(double cilindrata) { this.cilindrata = cilindrata; }
    public void setNumeroPorte(int numeroPorte) { this.numeroPorte = numeroPorte; }
    public void setNumeroPosti(int numeroPosti) { this.numeroPosti = numeroPosti; }
    public void setTarga(String targa) { this.targa = targa; }

    public void setAlimentazione(String alimentazione){ this.alimentazione = alimentazione; }
    public Automobile(){
        colore = "red";
    }
    public Automobile(String targa){ this.targa = targa; }

    public void parti(){ System.out.println("Wroooom"); }
    public void cambiaColore(String nuovoColore){ colore = nuovoColore; }
    public String saluta(){
        String saluto = "ciao sono un automobile di colore " + colore;
        return saluto;
    }
    //@Overload del metodo saluta
    public String saluta(String nomeDaSalutare){
        String saluto = "Ciao " + nomeDaSalutare + " sono un auto di marca " + marca;
        return saluto;
    }
    public void  descriviAuto(){
        System.out.println("L'automobile ha " + numeroPosti + " posti, ha " + numeroPorte + " porte, è " + cilindrata + " di cilindrata "
                + " e ha " + targa + " come numero di targa.");
    }

    public static void main(String[] args){

        Automobile auto1 = new Automobile();
        auto1.setAlimentazione("Benzina");
        System.out.println(auto1.getColore());

        Automobile auto2 = new Automobile();
        auto2.setAlimentazione("Diesel");
        System.out.println("Colore auto2 " + auto2.getColore());
        auto2.cambiaColore("blue");
        System.out.println("colore auto2 dopo inizializzazione " + auto2.getColore());
        System.out.println("colore auto1 " + auto1.getColore());


        Automobile auto3 = new Automobile();
        auto3.setCilindrata(1600);
        auto3.setNumeroPosti(5);
        auto3.setNumeroPorte(5);
        auto3.setTarga("FG651AE");

        auto3.descriviAuto();

    }
}