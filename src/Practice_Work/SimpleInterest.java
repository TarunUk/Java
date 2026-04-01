package Practice_Work;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double p = sc.nextInt();

        System.out.print("Enter the Time: ");
        double t = sc.nextInt();

        System.out.print("Enter the Rate: ");
        double r = sc.nextInt();

        double si = p * t * r / 100;

        System.out.print("The Simple Interest: "+ si);


    }
}
