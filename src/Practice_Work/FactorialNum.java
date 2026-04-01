package Practice_Work;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n =sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++){
            num = num * i;
        }

        System.out.print("Factorial: " + num);


    }
}
