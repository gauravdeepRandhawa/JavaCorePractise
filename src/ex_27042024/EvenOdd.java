package ex_27042024;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 20;
        if(a%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        //Taking input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("You entered even number");
        }
        else {
            System.out.println("You entered odd number");
        }
        sc.close();
    }
}
