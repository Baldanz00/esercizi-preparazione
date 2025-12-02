package RipassoGenerics.staticFinal.provaStatic;

public class Prova {

    private String nome;
    private String descrizione;
    private static String scopo; //variabile di classe, di cui c'è una sola copia
    //e quando qualche istanza ne cambia il valore, tutte le istanze successive
    //avranno quella copia di attributo

    public String getDescrizione() { return descrizione; }
    public String getNome() { return nome; }
    public static String getScopo() { return scopo; }

    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public void setNome(String nome) { this.nome = nome; }
    public static void setScopo(String scopo) { Prova.scopo = scopo; }

    public Prova(){
        Utility.incrementa();
    }
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Prova{");
       sb.append("nome=").append(nome);
       sb.append("descrizione=").append(descrizione);
       sb.append("scopo=").append(scopo);
       sb.append("}");
        return sb.toString();
    }
}
