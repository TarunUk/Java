package Problems_On_Number;

import java.util.Scanner;

/*
 *  A number is called an Automorphic number if and only if
 * its square ends in the same digits as the number itself.
 */
public class AutomorphicCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        int sq = N * N;
        boolean flag = true;
        while (N > 0) {

            //  Check the last digit

            if (N % 10 != sq % 10) {
                flag = false;
                break;
            }

            // remove the last digit

            N /= 10;
            sq /= 10;

        }

        if (flag) {
            System.out.println("It is an Automorphic Number");
        } else {
            System.out.println("It is not Automorphic Number");
        }
        sc.close();
    }





}
