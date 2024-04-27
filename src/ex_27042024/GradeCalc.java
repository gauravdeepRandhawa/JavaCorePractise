package ex_27042024;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a prog that calculates and displays the letter grade for a given numerical score (e.g, A,B..)
        //Grade scale
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        double score = sc.nextDouble();

        if(score > 100){
            System.out.println("Score cannot be greater than 100.");
        } else if(score < 0){
            System.out.println("Score cannot be negative");
        }else if(score >= 90 && score <= 100){
            System.out.println("Grade: A");
        } else if(score >= 80 && score <= 89){
            System.out.println("Grade: B");
        } else if(score >= 70 && score <= 79){
            System.out.println("Grade: C");
        } else if(score >= 60 && score <= 69){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}
