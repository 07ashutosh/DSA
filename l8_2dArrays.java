import java.util.*;

public class l8_2dArrays {
    public static void main(String[] args) {

        // syntax : type [][] variable_name = new type[row][column];
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows:");
        // int rows = sc.nextInt();

        // System.out.print("Enter the number of rows:");
        // int column = sc.nextInt();

        // int numbers[][] = new int[rows][column];

        // for (int i=0;i<rows;i++){
        // for(int j=0;j<column;j++){
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // for(int i=0;i<rows;i++){
        // for(int j=0;j<column;j++){
        // System.out.print(numbers[i][j]+" ");
        // }
        // System.out.println();
        // }

        // Q : search for an element in 2d array and print its location

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter the number of rows:");
        int column = sc.nextInt();

        int numbers[][] = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("which number do you want to search :");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("the number is found at location (" + i + "," + j + ")");
                }
            }
        }

        sc.close();
    }
}
