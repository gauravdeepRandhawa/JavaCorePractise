package ex_27042024;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Find the type of triangle (Equilateral / Scalene / Isosceles)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1, side2 and side3 of triangles");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
