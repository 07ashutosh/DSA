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
    public static int pathsCount(int i,int j, int n,int m){
        // base case
        if(i==n || j==m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        //moving down
        int downPath = pathsCount(i+1, j, n, m);

        //moving right
        int rightPath = pathsCount(i, j+1, n, m);

        return downPath + rightPath;
    }
    public static void main(String[] args){

        //Q1: printing all permutation of a string
        // String str = "abc";
        // printPermutations(str, "");


        //Q2: counting total paths in a maze to move from (0,0) to (n,m)
        int n = 3;
        int m = 4;
        int totalPaths = pathsCount(0, 0, n, m);
        System.out.println(totalPaths);

    } 
}
