package Problems_On_Numbers;

import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sumofdivisors = 0;

         for (int i = 1; i < n; i++){
             if(n % i == 0){
                 sumofdivisors += i;
             }
        }
         if(sumofdivisors > n)
         {
             System.out.println("It is a abundant number.");
         }
         else {
             System.out.println("It is not a abundant number.");
         }

    }

}
