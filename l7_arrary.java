import java.util.*;

public class l7_arrary {
    public static void main(String[] args) {
        // syntax = type []arrayName = new type[size];
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 96;
        // marks[2] = 95;

        // System.out.println(marks[1]);

        // for (int i=0;i<3;i++){
        //     System.out.println(marks[i]);

        // }

        //another way to declare and initialize an array

        // int marks[] = { 97, 96 , 95 };
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

        // Q:- take an array as input from user .search a given number x and print the index at which it is found.

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("enter the number to be searched: ");
        int x = sc.nextInt();


        // output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == x){
                System.out.println("x is found at index :"+ i);
            }
            
            
        }
        sc.close();

    }

}