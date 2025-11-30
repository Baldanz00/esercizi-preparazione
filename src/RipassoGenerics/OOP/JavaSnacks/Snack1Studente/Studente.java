package RipassoGenerics.OOP.JavaSnacks.Snack1Studente;

public class Studente {
    //Scrivi una classe Studente
    //- nome;
    //-cognome;
    //età;
    //Implementa un costruttore che accetta 3 parametri
    //per inizializzare questi attributi.
    //Aggiungi un metodo che restituisca una Stringa concatenata dei valori

    private String name;
    private String surname;
    private int age;

    public int getAge() { return age; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public Studente(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String infoStudente(){
        String info = "Lo studente è: \n" + getName() + " " + getSurname() + " e ha " + getAge() + " anni";
        return info;
    }


public static void main(String[] args){

    Studente s1 = new Studente("Mario","Rossi", 24);
    System.out.println(s1.infoStudente());
}
}

