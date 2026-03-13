package Problems_On_Numbers;

import java.util.Scanner;


public class AreaOfCircle {
    public static void areaofcircle(int n){
        double ans = 3.14 * n * n;
        System.out.println("Area of Circle: "+ans);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area of circle: ");
        int n = sc.nextInt();
        areaofcircle(n);
        sc.close();

    }
}
