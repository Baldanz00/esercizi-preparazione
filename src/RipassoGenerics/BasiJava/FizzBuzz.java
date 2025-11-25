package RipassoGenerics.BasiJava;

public class FizzBuzz {
    /*
    * Il gioco consiste nel sostituire i numeri
    * divisibili per 3 con "Fizz",
    * i numeri divisibili per 5 con "Buzz" e i
    * numeri divisibili sia per 3 che per 5 con "FizzBuzz"
    */
    void main() {

       // int numero = 0;
        for (int i = 0; i < 100; i++){
          if(i % 3 == 0 || i % 5 == 0){
              System.out.println("i è divisibile per 3 e per 5 e vale : " + i + " : FizzBuzz");
          } else if (i % 5 == 0) {
              System.out.println("i è divisibile per 5 e vale : " + i + " : Buzz");
          } else {
              System.out.println("i è divisibile per 3 e vale : " + i + " : Fizz");
          }
        }
    }
}
