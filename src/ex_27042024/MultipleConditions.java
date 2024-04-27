package ex_27042024;

import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 20){
            System.out.println("number is greater than 20.");
        } else if(num > 10){
            System.out.println("number is between 10 and 20.");
        } else {
            System.out.println("number is less than 20.");
        }
    }
}
