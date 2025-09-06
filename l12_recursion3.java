import java.util.ArrayList;

public class l12_recursion3 {

    // Q1: printing all permutation of a string

    // public static void printPermutations(String str, String permutation){
    //     // base case
    //     if(str.length() == 0){
    //         System.out.println(permutation);
    //         return;
    //     }
    //     for(int i=0 ; i<str.length();i++){
    //         char curChar = str.charAt(i);
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         printPermutations(newStr, permutation+curChar);
    //     }
    // }


    //Q2: counting total paths in a maze to move from (0,0) to (n,m)
    // public static int pathsCount(int i,int j, int n,int m){
    //     // base case
    //     if(i==n || j==m){
    //         return 0;
    //     }

    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     //moving down
    //     int downPath = pathsCount(i+1, j, n, m);

    //     //moving right
    //     int rightPath = pathsCount(i, j+1, n, m);

    //     return downPath + rightPath;
    // }


    //Q3: place tile of size 1 X m in a floor of size n X m 
    // public static int tilePlacement(int n , int m){
    //     //basecase
    //     if(n == m){
    //         return 2;
    //     }
    //     if (n < m){
    //         return 1;
    //     }
    //     //vertical placement
    //     int vertical = tilePlacement(n-m, m);

    //     // horizontal placement
    //     int horizontal = tilePlacement(n-1, m);

    //     return vertical + horizontal;

    // }


    //Q4:finding the ways in which you can invite n people to a your party,singleor in pair
    // public static int invitGuest(int n){
    //     //basecase
    //     if(n<=1){
    //         return 1;
    //     }

    //     //single
    //     int singleGuest = invitGuest(n-1);

    //     //pair guest

    //     int pairGuest = (n-1)*invitGuest(n-2);

    //     return singleGuest+pairGuest;
    // }


    //Q5: printing all the subset of a first n natural numbers
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int num,ArrayList<Integer> subset){
        //basecase
        if(num ==0){
            printsubset(subset);
            return;
        }
        //add
        subset.add(num);
        findSubset(num-1, subset);

        //not add
        subset.remove(subset.size()-1);
        findSubset(num-1, subset);
    }
    public static void main(String[] args){

        //Q1: printing all permutation of a string
        // String str = "abc";
        // printPermutations(str, "");


        //Q2: counting total paths in a maze to move from (0,0) to (n,m)
        // int n = 3;
        // int m = 4;
        // int totalPaths = pathsCount(0, 0, n, m);
        // System.out.println(totalPaths);


        //Q3: place tile of size 1 X m in a floor of size n X m 
        // int n = 3;
        // int m = 2;
        // int totPlacements = tilePlacement(n, m);
        // System.out.println(totPlacements);


        //Q4: finding the ways in which you can invite n people to a your party,singleor in pair
        // int n = 4;
        // int totalWays = invitGuest(n);
        // System.out.println(totalWays);



        //Q5: printing all the subset of a first n natural numbers
        int num = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(num, subset);

    } 
}
