import java.util.*;

public class l6_functions {
    // public static int add(int x,int y){
    //    int sum=x+y;
    //     return sum;
    // }

    // public static int product(int a,int b){
    //     int prod = a*b;
    //     return prod;
    // }

    // factorial of a number

    public static void factorial(int n){
        int fact = 1;

        if(n<0){
            System.out.println("invalid number !");
            return;
        }

        for (int i=n;i>=1;i--){
            fact = fact*i;
        }

        System.out.println("factorial of n number is : "+ fact);;

        return;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        // System.out.print("Enter first number :");
        // int a = sc.nextInt();

        // System.out.print("Enter second number :");
        // int b = sc.nextInt();

        // int sum = add(a,b);
        // System.out.println("The sum is :"+sum);

        // int prod = product(a,b);
        // System.out.println("The product is :"+prod);

        System.out.print("enter the number :");
        int n = sc.nextInt();

        factorial(n);

        sc.close();
    }
    
}
