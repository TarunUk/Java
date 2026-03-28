package Practice_Work;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int mul = a * b;
        System.out.print("The multiple of two num: "+mul);

    }
}
