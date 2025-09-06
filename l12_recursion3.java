public class l12_recursion3 {

    // Q1: printing all permutation of a string

    public static void printPermutations(String str, String permutation){
        // base case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0 ; i<str.length();i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, permutation+curChar);
        }
    }
    public static void main(String[] args){

        //Q1: printing all permutation of a string
        String str = "abc";
        printPermutations(str, "");


    } 
}
