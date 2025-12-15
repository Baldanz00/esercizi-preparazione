package Algoritmi.Base.Studente;

public class UsaStudente {
    void main(){
        Studente[] studenti = new Studente[3];

        studenti[0] = new Studente("Gioia", "463df", 8.5);
        studenti[1] = new Studente("Domenico", "463df56", 6.5);
        studenti[2] = new Studente("Giada", "463df35678", 7.5);
        Studente migliore = Studente.trovaMigliore(studenti);

        System.out.println("Lo studente con il voto più alto è:\n" + migliore.nome + " - " + migliore.voto);
    }
}
