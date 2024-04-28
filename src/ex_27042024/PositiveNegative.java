package ex_27042024;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        //Find if number is +ve, -ve or 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float num = sc.nextFloat();

        if(num > 0){
            System.out.println("Number is positive.");
        } else if(num < 0){
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
        sc.close();
    }
}
