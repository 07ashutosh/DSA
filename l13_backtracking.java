public class l13_backtracking {
    //Q1 : printing all the permutations of arranging n strudents in chairs
    public static void printPermutations(String str , String perm ,int idx){
        //basecase
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printPermutations(newstr, perm + curChar, idx+1);
        }
    }
    public  static void main(String[] args){

        //Q1 : printing all the permutations of arranging n strudents in chairs
        String str = "ABC";
        printPermutations(str, "", 0);

    }
}
