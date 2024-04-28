package ex_27042024;

public class FizzBuzz {
    public static void main(String[] args) {
        //If number is multiple of 3 print Fizz, if multiple of 5 print Buzz.

        for(int i = 1; i <= 100 ; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println(i + " FizzBuzz");
            } else if(i%3 == 0){
                System.out.println(i + " Fizz");
            } else if(i%5 == 0){
                System.out.println(i + " Buzz");
            }
        }
    }
}
