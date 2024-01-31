package CodTech;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // float c=sc.nextFloat();
        System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division\nEnter your choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            int d = a + b;
            System.out.println("Addtion is " + d);
        } else if (choice == 2) {
            int e = a - b;
            System.out.println("Substraction is " + e);
        } else if (choice == 3) {
            float f = a * b;
            System.out.println("Multiplication is " + f);
        } else if (choice == 4) {
            float g = a / b;
            System.out.println("Division is " + g);

        } else {
            System.out.println("Thankyou ");
        }
    }

}
