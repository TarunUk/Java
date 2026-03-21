package Problems_On_Numbers;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n %2 == 0){
            System.out.print("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
