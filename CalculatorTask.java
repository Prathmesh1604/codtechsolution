package CodTech;
import java.util.Scanner;

public class CalculatorTask {
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner sc=new Scanner(System.in);
       var name=sc.nextLine();
       System.out.println("Hello "+name);
       System.out.println("Please Enter\n1:Addition\n2:Substraction\n3:Multiplication\n4:Division");
       CalculatorTask obj =new CalculatorTask();
       int Choice=sc.nextInt();
       if(Choice==1){
        obj.add();
       }
       else if (Choice==2) {
        obj.sub();
       } 
       else if (Choice==3) {
        obj.mul();
        
       }
       else if (Choice==4) {
        obj.div();
        
       } 
       else {
        System.out.println("Enter A Valid Choice");
        
       }
      
    }
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two numbers for addition: ");
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res1=b+c;
        System.out.println("Addition is: "+res1);

    }
    void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two numbers for Substraction: ");
        int d=sc.nextInt();
        int e=sc.nextInt();
        int res2=d+e;
        System.out.println("Substraction is: "+res2);

    }
    void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two numbers for Multiplication: ");
        int f=sc.nextInt();
        int g=sc.nextInt();
        int res3=f*g;
        System.out.println("Multiplication is: "+res3);

    }
    void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two numbers for Division: ");
        int h=sc.nextInt();
        int i=sc.nextInt();
        int res4=h/i;
        System.out.println("Division is: "+res4);

    }
}
