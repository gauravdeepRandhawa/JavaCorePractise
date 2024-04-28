package ex_27042024;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " number is greater.");
            } else{
                System.out.println(num3 + " number is greater.");
            }
        } else if(num2 > num3){
            System.out.println(num2 + " number is greater.");
        } else if(num3 > num2){
            System.out.println(num3 + " number is greater.");
        } else{
            System.out.println("All numbers are equal.");
        }

        //Another way
        if((num1 > num2) && (num1 > num3)){
            System.out.println(num1 + " number is greater.");
        } else if((num2 > num1) && (num2 > num3)){
            System.out.println(num2 + " number is greater.");
        } else {
            System.out.println(num3 + " number is greater.");
        }
        sc.close();
    }
}
