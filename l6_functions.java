import java.util.*;

public class l6_functions {
    // public static int add(int x,int y){
    //    int sum=x+y;
    //     return sum;
    // }

    public static int product(int a,int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter second number :");
        int b = sc.nextInt();

        // int sum = add(a,b);
        // System.out.println("The sum is :"+sum);

        int prod = product(a,b);
        System.out.println("The product is :"+prod);
        sc.close();
    }
    
}
