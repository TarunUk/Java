package Practice_Work;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First num: ");
        int a = sc.nextInt();

        System.out.print("Enter Second num: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.print("Max : " + max);

    }
}
