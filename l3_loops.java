import java.util.*;

public class l3_loops {
    public static void main(String[] args){
        //for loop example

        // System.out.println("Enter a number to print its table:");
        // Scanner sc =new Scanner (System.in);
        // int table= sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(table +"x"+i+"="+(table*i));
        // }

        // while loop example

        // System.out.println("Enter a number to print its table:");
        // Scanner sc = new Scanner(System.in);
        // int table = sc.nextInt();
        // int i=1;
        // while(i<=10){
        //     System.out.println(table+"x"+i+"="+(table*i));
        //     i++;
        // }


        // do-while loop example/

        // System.out.println("Enter a number to print its table:");
        // Scanner sc = new Scanner(System.in);
        // int table = sc.nextInt();
        // int i=1;
        // do{
        //     System.out.println(table + "x" + i +"=" + (table*i));
        //     i++;
        // }while(i<=10);


        // question solving using loops

        // for loop
        //Qusestion: print the sum of n natural numbers

        // System.out.println("Enter a number to find the sum of first n natural numbers:");
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // int sum =0;

        // for (int i=1;i<=n;i++){
        //     sum = sum +i;
        // }
        // System.out.println("sum of the number is :"+sum);

        // Quesion: Print all even numbers till n.

        System.out.println("Enter a number to print all even numbers till n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // using for loop

        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        // using while loop

        // int i=1;
        // while(i<=n){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        //     i++;
        // }

        // using do-while loop

        int i=1;
        do{
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }while(i<=n);
    
    }
    
}
