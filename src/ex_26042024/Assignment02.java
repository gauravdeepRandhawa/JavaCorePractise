package ex_26042024;

public class Assignment02 {
    public static void main(String[] args){
        int a = 10;
        int b = a++;
        System.out.println(a++);
        System.out.println(++a + a++ + a++ + a++); //55
        System.out.println(a);
        System.out.println(b);
    }
}
