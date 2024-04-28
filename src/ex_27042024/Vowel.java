package ex_27042024;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U'){
            System.out.println(ch + " letter is vowel.");
        } else {
            System.out.println(ch + " letter is consonant.");
        }
    }
}
