package Practice_Work;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side one: ");
        int a = sc.nextInt();

        System.out.print("Enter side second: ");
        int b = sc.nextInt();

        System.out.print("Enter side third: ");
        int c = sc.nextInt();

        int peri = a+b+c;

        System.out.print("Perimeter of Triangle: "+ peri);

    }
}
