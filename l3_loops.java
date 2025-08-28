import java.util.*;

public class l3_loops {
    public static void main(String[] args) {
        // for loop example

        // System.out.println("Enter a number to print its table:");
        // Scanner sc =new Scanner (System.in);
        // int table= sc.nextInt();
        // for(int i=1;i<=10;i++){
        // System.out.println(table +"x"+i+"="+(table*i));
        // }

        // while loop example

        // System.out.println("Enter a number to print its table:");
        // Scanner sc = new Scanner(System.in);
        // int table = sc.nextInt();
        // int i=1;
        // while(i<=10){
        // System.out.println(table+"x"+i+"="+(table*i));
        // i++;
        // }

        // do-while loop example/

        // System.out.println("Enter a number to print its table:");
        // Scanner sc = new Scanner(System.in);
        // int table = sc.nextInt();
        // int i=1;
        // do{
        // System.out.println(table + "x" + i +"=" + (table*i));
        // i++;
        // }while(i<=10);

        // question solving using loops

        // for loop
        // Qusestion: print the sum of n natural numbers

        // System.out.println("Enter a number to find the sum of first n natural
        // numbers:");
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // int sum =0;

        // for (int i=1;i<=n;i++){
        // sum = sum +i;
        // }
        // System.out.println("sum of the number is :"+sum);

        // Quesion: Print all even numbers till n.

        // System.out.println("Enter a number to print all even numbers till n:");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // using for loop

        // for(int i=1;i<=n;i++){
        // if(i%2==0){
        // System.out.println(i);
        // }
        // }

        // using while loop

        // int i=1;
        // while(i<=n){
        // if(i%2==0){
        // System.out.println(i);
        // }
        // i++;
        // }

        // using do-while loop

        // int i=1;
        // do{
        // i++;
        // if(i%2==0){
        // System.out.println(i);
        // }
        // }while(i<=n);

        /*
         * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
         * If the user enters 1 then keep taking input from the user for a student’s
         * marks(out of 100).
         * If they enter 0 then stop.
         * If he/ she scores :
         * Marks >=90 -> print “This is Good”
         * 89 >= Marks >= 60 -> print “This is also Good”
         * 59 >= Marks >= 0 -> print “This is Good as well”
         * Because marks don’t matter but our effort does.
         */

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter 1 to enter marks or 0 to exit:");

            num = sc.nextInt();

            if (num == 1) {
                System.out.println("input the marks out of 100:");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks <= 59 && marks >= 0) {
                    System.out.println("This is Good as well Because marks does not matter but our effort does.");
                } else {
                    System.out.println("thank you for showing intrest");
                }
            }
        } while (num != 0);
        System.out.println("Exiting the program. Thank you!");
        sc.close();
    }

}
