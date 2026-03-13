package Problems_On_Numbers;

import java.util.Scanner;


/*
 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits
 * is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the
 * Armstrong Numbers.


 */

public class ArmStrongCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int digits = 0;
        int sum = 0;
        int dummy = n;

        while(dummy > 0){
            digits++;
            dummy = dummy/10;                                //   /10 = remove last digit
        }

        int temp = n;
        while(temp > 0){
            int digit = temp % 10;                            // 10% = get last digit
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }
        if (sum==n){
            System.out.print("It is a Armstrong Number");
        }
        else{
            System.out.print("It is not a Armstrong Number");
        }

    }
}
