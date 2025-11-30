package RipassoGenerics.OOP.Incapsulamento;

public class Auto {
    // 'class' è la kw per la definizione di una nuova classe = modello

    //caratteristiche della macchina -> field
    //modificatore di visibilità - tipo - nome
    public String colore;
    public String marca;
    public int annoImmatricolazione;
    public String modello;
    public String alimentazione;
    public String targa;
    public double numeroKmPercorsi;
    public int proprietariPrecedenti;
    public int numeroPosti;
    public int numeroPorte;
    public double cilindrata;

    //l'insieme delle caratteristiche definisce lo STATO INTERNO

    //costruttore: metodo speciale perchè non ha il ritorno e non ha il nome
    public Auto(){
        //ritorna un auto, non c'è il nome
        colore = "red";
    }
    //@Overload del costruttore
    public Auto(String targa){
        this.targa = targa;//this. riferimento all'oggetto corrente
        //this: targa del costruttore = targa della classe
    }

    public void parti(){
        System.out.println("Wroooom");
    }
    public void cambiaColore(String nuovoColore){
        colore = nuovoColore;
    }
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

        Auto auto1 = new Auto(); //creo l'oggetto/istanza della classe
        auto1.alimentazione = "Benzina";
        System.out.println(auto1.colore);
        //stamperà null perchè dato che non l'ho inizializzato Java assegna un valore di defoult

        Auto auto2 = new Auto();
        auto2.alimentazione = "Diesel"; //scope di oggetto
        //il new richiama il costruttore, che ha la funzione di costruire l'istanza data la classe
        //se io non creo il costruttore, java ne crea uno di defoult, con zero-initialization
        System.out.println("Colore auto2 " + auto2.colore);
        //auto2.colore = "blue";
        auto2.cambiaColore("blue");//interagisco con il metodo con .notation
        System.out.println("colore auto2 dopo inizializzazione " + auto2.colore);
        System.out.println("colore auto1 " + auto1.colore);

        //costruttore:
        //1. fa riferimento alla cella di memoria
        //2. zero-initialization

        Auto auto3 = new Auto();
        auto3.cilindrata = 1600;
        auto3.numeroPosti = 5;
        auto3.numeroPorte = 5;
        auto3.targa = "FG651AE";

        auto3.descriviAuto();

    }
}
