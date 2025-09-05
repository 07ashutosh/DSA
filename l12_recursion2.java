import java.util.HashSet;

public class l12_recursion2 {

    //Q1: hainoi tower
    // public static void hanoiTower(int n,String src, String hlpr, String dest ){
    //     if(n==1){
    //         System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
    //         return;
    //     }
    //     hanoiTower(n-1, src, dest,hlpr);
    //     System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
    //     hanoiTower(n-1, hlpr,src, dest);
    // }


    //Q2:rev string
    // public static void revString(String str, int idx){
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     revString(str, idx-1);
    // }


    //Q3: finding the 1st and last occurence of an element in a string

    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurence(String str, int idx ,char element){
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currentChar = str.charAt(idx);
    //     if(currentChar == element){
    //         if(first == -1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }

    //     findOccurence(str, idx+1, element);

    // }


    //Q4: checking if an array is sorted (strictly increasing)
    // public static boolean isSorted(int arr[],int idx){
    //     //base case
    //     if(idx == arr.length-1){
    //         return true;
    //     }

    //     if(arr[idx]< arr[idx+1]){
    //         //array is sorted till now
    //         return isSorted(arr, idx+1);
    //     }
    //     else{
    //         return false;
    //     }

    //another method
    // if(arr[idx]>= arr[idx+1]){
    //         //array is un sorted
    //         return false;
    //     }
    // return isSorted(arr, idx+1);
    // }


    //Q5: move all x to the end of the array
    // public static void moveAllX(String str, int idx, int count, String newStr){
    //     //base case
    //     if(idx == str.length()){
    //         for(int i=0;i<count;i++){
    //             newStr += 'x' ;
    //         }
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char curChar = str.charAt(idx);
    //     if(curChar == 'x'){
    //         count ++;
    //         moveAllX(str, idx+1, count, newStr);
    //     }else{
    //         newStr += curChar;
    //         moveAllX(str, idx+1, count, newStr);
    //     }
    // }

    //Q6: remove duplicates from a string
    // public static boolean[] map = new boolean[26];
    // public static void remvDuplicate(String str , int idx, String newStr){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char curChar = str.charAt(idx);
    //     if(map[curChar - 'a'] == true){
    //         //duplicate
    //         remvDuplicate(str, idx+1, newStr);
    //     }else{
    //         newStr += curChar;
    //         map[curChar-'a'] = true;
    //         remvDuplicate(str, idx+1, newStr);
    //     }
    // }


    //Q7: print all subsequences of a string   (so so important)
    // public static void subsequences(String str, int idx, String newstr){
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }

    //     char curChar = str.charAt(idx);

    //     //to be
    //     subsequences(str, idx+1, newstr+curChar);

    //     // not to be
    //     subsequences(str, idx+1, newstr);
    // }



    //Q8: print all unique subsequences of a string   (so so important)
    // public static void subsequences(String str, int idx, String newstr,HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newstr)){
    //             return;
    //         }else{
    //             System.out.println(newstr);
    //             set.add(newstr);
    //             return;
    //         }
            
    //     }

    //     char curChar = str.charAt(idx);

    //     //to be
    //     subsequences(str, idx+1, newstr+curChar,set);

    //     // not to be
    //     subsequences(str, idx+1, newstr,set);
    // }


    //Q:9 keypad combination
    public static String[] keyPad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 

    public static void printkeyPadComb(String str , int idx , String Combination){
        //base case
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char curchar = str.charAt(idx);
        String mapping = keyPad[curchar-'0'];

        for(int i=0;i<mapping.length();i++){
            printkeyPadComb(str, idx+1, Combination+mapping.charAt(i));
        }
    }


    public static void main(){

        //Q1: hanoi tower
        // int n=5;
        // hanoiTower(n, "S", "H", "D");


        //Q2: printing reverse string 
        // String str = "Ashutosh";
        // revString(str,str.length()-1);


        //Q3: finding the 1st and last occurence of an element in a string
        // String str = "abccddaachaah";
        // findOccurence(str, 0, 'a');


        //Q4: checking if an array is sorted (strictly increasing)
        // int arr[] = {1,2,3};
        // System.out.println(isSorted(arr, 0));


        //Q5: move all x to the end of the array
        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");


        //Q6: remove duplicates from a string
        // String str = "abbcddef";
        // remvDuplicate(str, 0, "");


        //Q7: print all subsequences of a string
        // String str = "abc";
        // subsequences(str, 0, "");


        //Q8: print all unique subsequences of a string (using hashset)
        // String str = "aaa";
        // HashSet <String> set = new HashSet<>();
        // subsequences(str, 0, "",set);


        //Q9: printing combination 
        String str = "23";
        printkeyPadComb(str, 0, ""); 

    }
}
