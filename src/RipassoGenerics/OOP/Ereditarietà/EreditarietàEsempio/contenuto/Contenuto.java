package RipassoGenerics.OOP.Ereditarietà.EreditarietàEsempio.contenuto;

public class Contenuto {
    String titolo;
    String[] attori;

    public String[] getAttori() { return attori; }
    public void setAttori(String[] attori) { this.attori = attori; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    void riproduci(){
        System.out.println("Inizio contenuto");
    }
}
