package ex_27042024;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        //Maximum number in two numbers:
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater.");
        }
        else {
            System.out.println(num2 + " is greater.");
        }

        //Another method
        int max = Math.max(num1,num2);
        System.out.println(max + " is greater.");
        sc.close();
    }
}
