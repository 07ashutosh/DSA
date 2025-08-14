import java.util.*;

public class l2_conditional_statements {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
         
        // System.out.println("enter your age");
        // int age = sc.nextInt();

        // using if-else statement to check age
        // if (age <= 18){
        //     System.out.println("you are under age");
        // }else if(age <=60){
        //     System.out.println("you are an adult");
        // }else{
        //     System.out.println("you are a senior citizen");
        // }

        //checking if number is odd or even

        // System.out.println("Enter a number to check if it is odd or even:");
        // int num = sc.nextInt();

        // if (num%2==0){
        //     System.out.println("The number is even");
        // } else {
        //     System.out.println("The number is odd");
        // }

        //using switch case statement
        
        System.out.println("enter button number (1-3) :");
        int button = sc.nextInt();
        switch (button) {
            case 1:System.out.println("hello");
                   break;
            case 2:System.out.println("namaste");
                   break;
            case 3:System.out.println("hola");
                     break;           
        
            default:System.out.println("invalid button number");
        }

    }
    
}
