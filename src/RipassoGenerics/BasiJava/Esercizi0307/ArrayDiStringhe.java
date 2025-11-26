package RipassoGenerics.BasiJava.Esercizi0307;

public class ArrayDiStringhe {
    void main(){

        //Stampa i nomi che iniziano per A
        //Obiettivo: Dato un array di nomi, stampa solo
        //quelli che iniziano per A

        String[] nomi = {"Marco", "Anna", "Paolo", "Andrea", "Giorgio", "Annarita"};

        //devo scorrere l'array e vedere se la prima lettera è una A
        System.out.println("I nomi che iniziano con 'A' sono: ");
        for(String nome : nomi){
           // System.out.println("Siamo nel for");
            if(nome.toLowerCase().startsWith("a")){
             //   System.out.println("Siamo nell'if");
                System.out.println(nome);
            }
        }
    }
}
